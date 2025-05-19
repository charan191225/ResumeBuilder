package com.resumebuilder.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comparision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double score;

    @ElementCollection
    @CollectionTable(name = "matched_skills", joinColumns = @JoinColumn(name = "comparison_result_id"))
    @Column(name = "skill")
    private List<String> matchedSkills;

    @ElementCollection
    @CollectionTable(name = "missing_skills", joinColumns = @JoinColumn(name = "comparison_result_id"))
    @Column(name = "skill")
    private List<String> missingSkills;

    @Column(length = 1000)
    private String feedback;
}
