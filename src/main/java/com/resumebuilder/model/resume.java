package com.resumebuilder.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10000)
    private String content;

    private String filePath;

    private String originalFilename;

    private String fileType;

    private boolean isActive = true;

}
