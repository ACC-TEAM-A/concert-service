package com.eureka.concertservice.domain;

import lombok.*;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Concert")
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "concert_id")
    private Long id;

    @Column
    private String title;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(columnDefinition = "TEXT")
    private String price;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "running_time")
    private String runningTime;

}
