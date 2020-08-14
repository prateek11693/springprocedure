package com.example.demo.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Worker;

@Component
public class EmRunner implements CommandLineRunner {

	@Autowired
	private EntityManager em;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("by Entiry Manager");
		StoredProcedureQuery proc = em.createStoredProcedureQuery("getWorkers", Worker.class);

		List<Worker> list = proc.getResultList();
		list.forEach(System.out::println);

	}

}
