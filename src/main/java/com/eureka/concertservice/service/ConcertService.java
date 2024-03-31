package com.eureka.concertservice.service;

import com.eureka.concertservice.domain.Concert;
import com.eureka.concertservice.dto.ConcertDto;
import com.eureka.concertservice.dto.ConcertResponse;
import com.eureka.concertservice.repository.ConcertRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConcertService {

    private final ConcertRepository concertRepository;

    public ConcertService(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }

    // R) 제목으로 콘서트 가져오기
    public ConcertResponse getConcertByTitle(String title) {
        Optional<Concert> concert = concertRepository.findByTitle(title);
        ConcertResponse concertResponse = null;
        if (concert.isPresent()) {
            concertResponse = ConcertResponse.of(concert.get());
        }
        return concertResponse;
    }

    // C) 콘서트 생성
    public Concert createConcert(ConcertDto concertDto) throws Exception {
        try {
            Concert concert = Concert.builder()
                    .title(concertDto.getTitle())
                    .genre(concertDto.getGenre())
                    .startDate(concertDto.getStartDate())
                    .endDate(concertDto.getEndDate())
                    .price(concertDto.getPrice())
                    .description(concertDto.getDescription())
                    .runningTime(concertDto.getRunningTime())
                    .build();
            return concertRepository.save(concert);
        } catch(Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("잘못된 요청입니다.");
        }
    }

}
