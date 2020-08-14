package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
	
	//List<Worker> findAll();
	
	/*
	 * @Query(nativeQuery=true,value="Select * from Worker ") List<Worker>
	 * getWorkers();
	 */
	
	/*
	 * @Query(nativeQuery=true,value="{call getWorkers()}") List<Worker>
	 * getWorkersProc();
	 */
	
	@Query(nativeQuery=true, value= "{call getBySal(?)}")
	List<Worker> getBySal(double wrk_sal);

	@Query(nativeQuery=true, value="{call getBySalNam(?,?)}")
	Worker getBySalNam(double wrk_sal, String wrk_name);
	
	@Query(nativeQuery=true, value="{call getBySalNumCount(?)}")
	Integer getBySalNamCount(double wrk_sal);
}
