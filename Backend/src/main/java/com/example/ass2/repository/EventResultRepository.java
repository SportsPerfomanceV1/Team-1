package com.example.ass2.repository;

import com.example.ass2.model.EventResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventResultRepository extends JpaRepository<EventResult, Integer> {
    List<EventResult> findByEventId(int eventId);
    List<EventResult> findByEventIdAndPublishedTrue(int eventId);
    List<EventResult> findByAthleteId(int athleteId);
}
