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
@Table(name = "Answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    @ManyToOne
    @JoinColumn(name = "questionId", referencedColumnName = "questionId")
    private Question question;

    private int isTrue;

    @Column(columnDefinition = "TEXT")
    private String answerText;

    @Column(nullable = false)
    private LocalDateTime answerDate = LocalDateTime.now();
}

