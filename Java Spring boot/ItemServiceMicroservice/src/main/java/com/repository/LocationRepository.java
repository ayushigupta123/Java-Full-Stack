package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.StoreLocation;


@Repository
public interface LocationRepository extends JpaRepository<StoreLocation, String> {

}
