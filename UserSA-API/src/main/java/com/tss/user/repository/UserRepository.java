package com.tss.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.tss.user.entity.UserEntity;
@Repository
public interface UserRepository extends MongoRepository<UserEntity, String>{

	@Query(value="{'userEmailId':?0}")
	UserEntity isUserEmailExists(String userEmailId);
	@Query(value="{'userContactNumber':?0}")
	UserEntity isUserContactNumberExists(long userContactNumber);
	@Query(delete=true,value="{'userEmailId':?0}")
	void deleteUser(String userEmailId);
}
