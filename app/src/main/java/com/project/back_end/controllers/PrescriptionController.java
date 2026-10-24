package com.project.back_end.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/prescriptions")
public class PrescriptionController {
    @PostMapping
    public ResponseEntity<?> savePrescription(@RequestHeader("Authorization") String token, @RequestBody Object body) {
        return ResponseEntity.ok("Saved successfully");
    }
}