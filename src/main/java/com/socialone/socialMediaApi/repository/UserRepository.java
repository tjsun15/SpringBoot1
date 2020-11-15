package com.socialone.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;


import com.socialone.socialMediaApi.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

		public User findByUsername(String username);
}
