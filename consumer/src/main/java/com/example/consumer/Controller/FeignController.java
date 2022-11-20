package com.example.consumer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/consumer/feign")
@RestController
public class FeignController {

    @GetMapping("/gateway/request")
    public String getRequest(HttpServletRequest request){

        final String header = request.getHeader("request-arg");
        System.out.println(header);

        return "request";
    }
}

