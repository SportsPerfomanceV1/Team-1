package com.example.ass2.controller;

import com.example.ass2.model.EventResult;
import com.example.ass2.service.EventResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/results")
public class EventResultController {

    @Autowired
    private EventResultService eventResultService;

    @GetMapping("/{eventId}")
    public List<EventResult> getPublishedResults(@PathVariable Long eventId) {
        return eventResultService.getPublishedResultsByEventId(eventId);
    }

    @PostMapping("/publish")
    public EventResult publishEventResult(@RequestBody EventResult eventResult) {
        return eventResultService.publishEventResult(eventResult);
    }
}