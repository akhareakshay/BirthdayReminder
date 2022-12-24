package com.codewithakshay.birthdayreminder.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithakshay.birthdayreminder.postgres.model.Birthday;

@Repository
public interface BirthdayRepository extends JpaRepository<Birthday, Long>{

}
