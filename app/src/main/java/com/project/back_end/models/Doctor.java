package com.project.back_end.models;
import jakarta.persistence.*;
@Entity
public class Doctor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String speciality;
    private String availableTimes;
    // Getters and setters
}