package com.example.demo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Worker;
import com.example.demo.repo.WorkerRepository;

@Component
public class WorkerRunner implements CommandLineRunner {

	@Autowired
	private WorkerRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//repo.findAll().forEach(System.out::println);
		
		//repo.getWorkers().forEach(System.out::println);
		
		//repo.getWorkersProc().forEach(System.out::println);
		
		//repo.getBySal(200).forEach(System.out::println);
		System.out.println(repo.getBySalNam(200,"Chandra"));
		
		System.out.println((Integer)repo.getBySalNamCount(200));
	
	}

}
