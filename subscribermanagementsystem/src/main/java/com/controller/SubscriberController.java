package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.model.Subscriber;
import com.repository.SubscriberRepository;
import com.rest.SubscriberNotFoundException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subscribers")
public class SubscriberController {

    @Autowired
    SubscriberRepository subscriberRepository;

    @GetMapping("/subscribers")
    public ResponseEntity<List<Subscriber>> getAllSubscribers() {
        List<Subscriber> subscribers = subscriberRepository.findAll();
        return new ResponseEntity<>(subscribers, HttpStatus.OK);
    }

    @GetMapping("/subscribers/{id}")
    public ResponseEntity<Subscriber> getSubscriberById(@PathVariable Long id) {
        Optional<Subscriber> subscriber = subscriberRepository.findById(id);
        return subscriber.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                         .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/subscribers")
    public ResponseEntity<Subscriber> createSubscriber(@RequestBody Subscriber subscriber) {
        Subscriber newSubscriber = subscriberRepository.save(subscriber);
        return new ResponseEntity<>(newSubscriber, HttpStatus.CREATED);
    }

    @PatchMapping("/subscribers/{id}")
    public ResponseEntity<Subscriber> updateSubscriber(@PathVariable Long id, @RequestBody Subscriber subscriber) {
        
    	if (!subscriberRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        subscriber.setId(id);
        Subscriber updatedSubscriber = subscriberRepository.save(subscriber);
        return new ResponseEntity<>(updatedSubscriber, HttpStatus.OK);
    }

    @DeleteMapping("/subscribers/{id}")
    public ResponseEntity<HttpStatus> deleteSubscriber(@PathVariable Long id) {
    	Subscriber subscriber = subscriberRepository.findById(id)
                .orElseThrow(() -> new SubscriberNotFoundException(id));
    	if (!subscriberRepository.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        subscriberRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
