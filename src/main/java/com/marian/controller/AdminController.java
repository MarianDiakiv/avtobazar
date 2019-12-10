package com.marian.controller;

import java.awt.print.Printable;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.marian.domain.CreateCarRequest;
import com.marian.domain.EditCarRequest;
import com.marian.entity.CarMake;
import com.marian.entity.CarModel;
import com.marian.entity.Custom;
import com.marian.entity.Engine;
import com.marian.entity.UserEntity;
import com.marian.entity.enumeration.BodyType;
import com.marian.entity.enumeration.Fuel;
import com.marian.mail.Mail;
import com.marian.mapper.CarModelMapper;
import com.marian.repository.EngineRepository;
import com.marian.repository.MakerRepository;
import com.marian.service.CarService;
import com.marian.service.CustomService;
import com.marian.service.EmailService;
import com.marian.service.EngineService;
import com.marian.service.MakeService;
import com.marian.service.UserService;
import com.marian.service.utils.CustomFileUtils;

@Controller
@RequestMapping("/admin")
@SessionAttributes("editCarModel")
public class AdminController {
	
	@Autowired
	private CarService carService; 
	@Autowired
	private MakeService makeService;
	@Autowired
	private EngineService engineService;
	@Autowired 
	private CustomService customService;
	@Autowired
	private EmailService emailService;
	@Autowired
	private UserService userService;

	@GetMapping("/admin")
	public String showprofile(Principal priytipal, Model model) {
		UserEntity entity = userService.findUserByEmail(priytipal.getName());
		model.addAttribute("user", entity);
		return"admin/admin-profile";
	}
	
	@GetMapping("/addcar")
	public String showAddCar(Model model) {

		
		model.addAttribute("modelRequest", new CreateCarRequest() );
		List<Engine> engineList = engineService.findAllEngine();
		model.addAttribute("listEngine", engineList);
		
		List<CarMake> make = makeService.findAllCarMake();
		model.addAttribute("makers", make);
		
		model.addAttribute("typeFuel", Fuel.values());
		model.addAttribute("bodyModel", BodyType.values());
		model.addAttribute("carModel", new CarModel());
		
		
		
		return"admin/add_car";
	}
	@PostMapping("/addcar")
	public String  saveCar(@ModelAttribute("modelRequest") CreateCarRequest request) throws IOException{

//		if(result.hasErrors()) {
//			System.out.println(request.toString());
//			return"admin/add_car";
//		}
		System.out.println("dfhvsuedirhfoesdhfiseolhfisef;isoehj;");
		//System.out.println(request.toString());
		CarModel carModel = new CarModel();
		carModel = CarModelMapper.addRequestToCarModel(request);
		System.out.println(carModel.toString());
		
		carService.saveCar(carModel);
		
//		CustomFileUtils.createFolder("car_"+carModel.getId());
//		CustomFileUtils.createImage("car_"+carModel.getId(), request.getCarImage());
		
		return"redirect:/admin/admin";
	}
	@GetMapping("/addMaker")
	public String showAddMaker(Model model) {
		model.addAttribute("carMake", new CarMake());
		return"admin/add_maker";
	}
//	@PostMapping("/addMaker")
//	public String addMaker(@RequestParam("maker") @Valid String title, BindingResult result) {
//		
//		if(result.hasErrors()) {
//			return "admin/add-maker";
//		}
//		
//		CarMake make = new CarMake();
//		make.setTitle(title);
//		makeService.saveMaker(make);
//		return"redirect:/admin/admin";
//		
//	}
	@PostMapping("/addMaker")
	public String addMaker(@ModelAttribute("carMake") @Valid CarMake carMake, BindingResult result) {
		
		if(result.hasErrors()) {
			return"admin/add_maker";
		}
		
		makeService.saveMaker(carMake);
		return"redirect:/admin/admin";
		
	}
	
	
	@GetMapping("/addEngine")
	public String showAddEngine() {
		return"admin/add_engine";
	}
	@PostMapping("/addEngine")
	public String saweEngine(@ModelAttribute("engineModel") Engine engine) {
//		Engine engine = new Engine();
//		engine.setTitle(title);
//		engine.setCapacity(capacity);
//		engine.setPower(power);
		engineService.saveEngine(engine);
		return"redirect:/admin/admin";
	}

	
	@GetMapping("/custom")
	public String showCustonPage(Model model) {
		List<Custom> customList = customService.findAllCustomByStatus(false);
		model.addAttribute("customListModel", customList);
		return"admin/custom";
	}
	@PostMapping("/custom")
	public String confirmedCuston() {
		return"redirect:/admin/custom";
	}
	@GetMapping("/edit/{carId}")
	public String editCar(@PathVariable("carId") int carId, Model model, Principal pritipal ) {
		CarModel carModel = carService.getCarById(carId);
		
		if(carId!=carModel.getId()) {
			return"redirect:/admin/carList";
		}
		EditCarRequest request = CarModelMapper.carToRequest(carModel);
		List<Engine> engine = engineService.findAllEngine();
		model.addAttribute("engineList", engine);
		model.addAttribute("editCarModel", request);
		
		return"admin/edit_car";
	}
	
	@PostMapping("/edit/{carId}")
	public String saveEditCarModel(@ModelAttribute("editCarModel") EditCarRequest request, @PathVariable("carId") int carId ) {
		
		CarModel carModel = CarModelMapper.editCarToEntity(request);
		
		carService.saveCar(carModel);
		return"redirect:/admin/admin";
	}
	
	@GetMapping("/confirm/{customId}")
	public String confirmOrder(@PathVariable("customId") int customId) {
		Custom custom = customService.findOneCustonById(customId);
		
		if(customId!=custom.getId()) {
			return"redirect:/admin/custom";
		}
		
		custom.setStatus(true);
		customService.saveCustom(custom);
		UserEntity user = custom.getUser();
		CarModel modelCar = custom.getModel();
		Mail mail = new Mail();
		mail.setTo(user.getEmail());
		mail.setSubject("Custom");
		mail.setContent("your car " + modelCar.getCarMake().getTitle() +modelCar.getModel()+"  is available  "+"  car cost  "+ modelCar.getPrice()+"$");
		emailService.sendMessage(mail);
		return"redirect:/admin/custom";
	}
	
//	@GetMapping("/carlist")
//	private String showCarListAdmin(Model model ) {
//		List<CarModel> carModelList = carService.findAllCar();
//		model.addAttribute("carList", carModelList);		
//		
//		return"car_list";
//	}
	
	
}
