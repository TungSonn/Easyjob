package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Questions")
public class Question {

    @Id
    @Column(length = 255)
    private String questionId;

    @ManyToOne
    @JoinColumn(name = "jobId")
    private Job job;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false)
    private LocalDateTime date = LocalDateTime.now();

}

