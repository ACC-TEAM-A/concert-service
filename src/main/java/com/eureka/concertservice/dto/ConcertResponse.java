package com.eureka.concertservice.dto;

import com.eureka.concertservice.domain.Concert;
import com.eureka.concertservice.domain.Genre;
import lombok.Data;

import java.util.Date;

@Data
public class ConcertResponse {
    private Long id;
    private String title;
    private Date startDate;
    private Date endDate;
    private String price;
    private Genre genre;
    private String description;
    private String runningTime;

    public ConcertResponse(Long id, String title, Date startDate, Date endDate, String price, Genre genre, // 변경된 부분
                           String description, String runningTime) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.genre = genre;
        this.description = description;
        this.runningTime = runningTime;
    }

    //convert
    public static ConcertResponse of(Concert concert) {
        return new ConcertResponse(
                concert.getId(),
                concert.getTitle(),
                concert.getStartDate(),
                concert.getEndDate(),
                concert.getPrice(),
                concert.getGenre(),
                concert.getDescription(),
                concert.getRunningTime()
        );
    }
}
