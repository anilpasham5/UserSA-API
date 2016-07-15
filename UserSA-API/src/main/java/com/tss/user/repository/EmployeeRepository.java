package com.tss.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.tss.user.entity.EmployeeEntity;
@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeEntity, String> {

	@Query(value="{'empEmailId':?0}")
	EmployeeEntity getEmployee(String empEmailId);
	@Query(value="{'empEmailId':?0}",delete=true)
	void deleteEmployee(String empEmailId);
}
