package com.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.model.Subscriber;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Integer> {

	public Subscriber findItemBySubscriberName(String name);

	public void deleteById(Long id);

	public boolean existsById(Long id);

	public Optional<Subscriber> findById(Long id);

}
