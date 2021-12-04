package com.sec;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sec.entities.AppRole;
import com.sec.entities.AppUser;
import com.sec.entities.Task;
import com.sec.repository.TaskRepository;
import com.sec.service.AccountService;

@SpringBootApplication
public class AuthsecurityApplication implements CommandLineRunner {
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private AccountService accountService;
	public static void main(String[] args) {
		SpringApplication.run(AuthsecurityApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder getBCPE() {
	return new BCryptPasswordEncoder();
	}
	@Override
	public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	Stream.of("T1","T2","T3").forEach(t->{
	taskRepository.save(new Task(t));
	});
	taskRepository.findAll().forEach(t->{
	System.out.println(t.getId()+" -- "+t.getTaskName());
	});
	accountService.saveUser(new AppUser("admin", "1234",1,null));
	accountService.saveUser(new AppUser("user", "1234",1,null));
	accountService.saveRole(new AppRole("ADMIN"));
	accountService.saveRole(new AppRole("USER"));
	accountService.addRoleToUser("admin", "ADMIN");
	accountService.addRoleToUser("user", "USER");
	
	
	
	}
	}
