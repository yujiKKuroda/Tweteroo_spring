package com.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.repositories.TweetRepository;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    final TweetRepository tweetRepository;

		TweetController(TweetRepository tweetRepository) {
		    this.tweetRepository = tweetRepository;
		}

    @GetMapping
    public ResponseEntity<Object> getTweets() {
        List<TweetModel> tweet = tweetRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(tweet);
    }
}