package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

	void save(Optional<Message> existingMessage);
}
