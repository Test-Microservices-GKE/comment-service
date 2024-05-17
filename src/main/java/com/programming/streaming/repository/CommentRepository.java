package com.programming.streaming.repository;

import org.springframework.stereotype.Repository;

import com.programming.streaming.model.Comment;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {

}
