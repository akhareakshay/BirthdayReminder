package com.codewithakshay.birthdayreminder.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithakshay.birthdayreminder.postgres.model.UserManagement;

@Repository
public interface UserManagementRepository extends JpaRepository<UserManagement, Long> {

	public UserManagement findByUserName(String userName);

}
