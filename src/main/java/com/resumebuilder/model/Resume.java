package com.resumebuilder.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Entity
@Table(name = "users")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resumeId;
    private String resumeFileName;
    private String resumeFilePath;
    private String resumeFileType;
    private Date resumeUploadDate;
    private boolean resumeFileIsActive = true;

}
