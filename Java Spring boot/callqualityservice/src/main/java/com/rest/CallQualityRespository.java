package com.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallQualityRespository  extends JpaRepository<CallQuality, Integer>{

}
