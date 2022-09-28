package com.example.onetoonebirectional.repository;

import com.example.onetoonebirectional.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity,Long> {
}
