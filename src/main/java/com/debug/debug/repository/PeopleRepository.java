package com.debug.debug.repository;

import com.debug.debug.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People,Integer> {

}
