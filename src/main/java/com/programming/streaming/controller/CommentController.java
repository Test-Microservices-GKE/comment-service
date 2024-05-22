package com.programming.streaming.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/comment")
@AllArgsConstructor
// @CrossOrigin("*")
public class CommentController {
    @GetMapping("/")
    public ResponseEntity<Map<String, String>> getMethodName() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Comment service");
        return ResponseEntity.ok(response);
    }
    

}
