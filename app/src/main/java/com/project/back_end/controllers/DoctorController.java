package com.project.back_end.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/doctors")
public class DoctorController {
    @GetMapping("/availability")
    public ResponseEntity<?> getAvailability(@RequestParam String date, @RequestHeader("Authorization") String token) {
        return ResponseEntity.ok("Available slots");
    }
}