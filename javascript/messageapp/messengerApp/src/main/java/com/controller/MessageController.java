package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Message;
import com.repository.MessageRepository;

@RestController
@CrossOrigin(origins="*")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/message")
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    @PostMapping("/message")
    public Message saveAMessage(@RequestBody Message msg) {
        return messageRepository.save(msg);
    }
    
    @PatchMapping("/message/{messageId}")
    public ResponseEntity<String> updateMessage(@PathVariable Long messageId, @RequestBody Message updatedMessage) {
        Optional<Message> existingMessage = messageRepository.findById(messageId);

            messageRepository.save(existingMessage);
            return ResponseEntity.ok("Message updated successfully");
        
    }
    
    
    
}
