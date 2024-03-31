package com.eureka.concertservice.repository;

import com.eureka.concertservice.domain.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, Long> {
    Optional<Concert> findByTitle(String title);

}
