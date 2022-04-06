package com.example.demo.controller;

import com.example.demo.annotation.CustomResolver;
import com.example.demo.dto.CommonDto;
import com.example.demo.dto.TestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SampleController {

    @PostMapping("/test")
    public void test(@RequestBody TestDto testDto, @CustomResolver CommonDto commonDto, String ordNo) {
        log.info(testDto.toString());
        log.info(commonDto.toString());
    }
}
