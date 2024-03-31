package com.eureka.concertservice.dto;

import com.eureka.concertservice.domain.Genre;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ConcertDto {

    private String title;
    private Date startDate;
    private Date endDate;
    private String price;
    private Genre genre;
    private String description;
    private String runningTime;

    public ConcertDto() {
    }

    public ConcertDto(String title) {
        this.title = title;
    }

    public ConcertDto(String title, Date startDate) {
        this.title = title;
        this.startDate = startDate;
    }

    public ConcertDto(String title, Date startDate, Date endDate, String price, Genre genre, String description,
                      String runningTime) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.genre = genre;
        this.description = description;
        this.runningTime = runningTime;
    }

}
