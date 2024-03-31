package com.eureka.concertservice.controller;

import com.eureka.concertservice.config.SuccessCode;
import com.eureka.concertservice.domain.Concert;
import com.eureka.concertservice.dto.ConcertDto;
import com.eureka.concertservice.dto.ConcertResponse;
import com.eureka.concertservice.service.ConcertService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/concert")
public class ConcertController {

    private final ConcertService concertService;
    private SuccessCode successCode = SuccessCode.OK;

    @GetMapping("")
    public String hello(){
        return "hello!";
    }

    @Autowired
    public ConcertController(ConcertService concertService) {
        this.concertService = concertService;
    }

    // create
    @PostMapping("/create")
    public ResponseEntity<Concert> createConcert(@RequestBody ConcertDto concertDto) throws Exception {
        log.info("concertDto = {}", concertDto);
        Concert createdConcert = concertService.createConcert(concertDto);
        return new ResponseEntity<>(createdConcert, HttpStatus.CREATED);
    }

    // read - title
    @GetMapping("/title")
    public ResponseEntity<ConcertResponse> getConcertByTitle(@RequestParam(value = "title") String title) {
        ConcertResponse concertResponse = concertService.getConcertByTitle(title);
        return ResponseEntity.ok(concertResponse);
    }


}
