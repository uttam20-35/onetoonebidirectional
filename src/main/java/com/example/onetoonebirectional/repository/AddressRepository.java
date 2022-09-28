package com.example.onetoonebirectional.repository;

import com.example.onetoonebirectional.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity,Long> {
}
