package com.programming.streaming.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/comment")
@AllArgsConstructor
public class CommentController {
    private final CommentRepository commentRepository;
    @GetMapping("/")    
    public ResponseEntity<Map<String, String>> getMethodName() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Comment service");
        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/add")
    public ResponseEntity uploadComment(@RequestBody Comment comment) {
        try {
            Comment save = commentRepository.save(comment);
            return ResponseEntity.ok(HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

}
