package com.careerdevs.JsonPlaceholderAPI.JsonPlaceholder2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/jsonplaceholder2/")
public class JsonPlaceholderController2 {

    @GetMapping("/test")
    public String test() {
        return "the test worked";
    }

    @GetMapping("/getAllPosts")
    public Object getPosts(RestTemplate restTemplate) {
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/", Object.class);
    }

    @GetMapping("/getAllComments")
    public Object getComments(RestTemplate restTemplate) {
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/comments", Object.class);
    }
}
