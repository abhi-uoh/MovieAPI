package com.template.springtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class SpringTemplateApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringTemplateApplication.class, args);
        RestTemplate restTemplate = new RestTemplate();
//        //https://jsonplaceholder.typicode.com/posts
//        //https://api.themoviedb.org/3/movie/550?api_key=dee9f0cf7cafd488c017d1db70a27c2c
////        List response = restTemplate.getForObject("https://restcountries.eu/rest/v2/all",List.class);
//
////        response.forEach(post->{
////            System.out.println(post);
////            System.out.println("");
////        });
//////        System.out.println(response);

        ResponseEntity <String> responseEntity = restTemplate.getForEntity("https://api.themoviedb.org/3/discover/movie?api_key=dee9f0cf7cafd488c017d1db70a27c2c&year&=",String.class);
        String body = responseEntity.getBody();
        HttpHeaders headers = responseEntity.getHeaders();
        System.out.println("Enter year: ");

        System.out.println(body);
        System.out.println(headers);

////         Posts posts = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1",Posts.class);
////         System.out.println(posts.getTitle()+"  "+posts.getId());
//
//        ResponseEntity <Posts> postsResponseEntity  = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts/1",Posts.class);
//        Posts posts= postsResponseEntity.getBody();
//        System.out.println(posts.getBody() +"       "+posts.getId());
    }

}
