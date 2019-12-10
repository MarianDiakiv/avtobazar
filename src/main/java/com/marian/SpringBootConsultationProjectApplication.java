package com.marian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.marian.entity.CarMake;
import com.marian.entity.Engine;
import com.marian.entity.UserEntity;
import com.marian.entity.enumeration.Role;
import com.marian.repository.EngineRepository;
import com.marian.repository.MakerRepository;
import com.marian.repository.UserRepository;

@SpringBootApplication
public class SpringBootConsultationProjectApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootConsultationProjectApplication.class);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootConsultationProjectApplication.class, args);
		addAdmin(context);
		addCarMake(context);
		addEngine(context);
	}
	
	static void addAdmin(ConfigurableApplicationContext context) {
		String adminEmail = "admin@gmail.com";
		String adminPassword = "123";
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		UserEntity entity = userRepository.findUserByEmail(adminEmail);
		if(entity == null) {
			PasswordEncoder encoder = context.getBean(PasswordEncoder.class);
			
			entity = new UserEntity();
			entity.setEmail(adminEmail);
			entity.setPassword(encoder.encode(adminPassword));
			entity.setRole(Role.ROLE_ADMIN);
			
			userRepository.save(entity);
		}
	}
	static void addCarMake(ConfigurableApplicationContext context) {
		String title = "skoda";
		MakerRepository makerRepository = context.getBean(MakerRepository.class);
		CarMake make = makerRepository.findMakerByName(title);
		if(make==null) {
			make = new CarMake();
			make.setTitle(title);
			makerRepository.save(make);
		}
	}
	static void addEngine(ConfigurableApplicationContext context) {
		String title = "v6"; 
		String capacity = "2.1"; 
		String power = "150"; 
		EngineRepository engineRepository = context.getBean(EngineRepository.class);
		Engine engine = engineRepository.findEngineByTitle(title);
		if(engine==null) {
			engine = new Engine();
			engine.setTitle(title);
			engine.setCapacity(capacity);
			engine.setPower(power);
			engineRepository.save(engine);
		}
	}
	
}
