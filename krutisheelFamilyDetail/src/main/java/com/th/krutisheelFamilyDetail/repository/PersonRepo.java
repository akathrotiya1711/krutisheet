package com.th.krutisheelFamilyDetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.th.krutisheelFamilyDetail.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
