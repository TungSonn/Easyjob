package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ChooseAns")
public class ChooseAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chooseId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "chooseAnsId")
    private Answer answer;

    private String status;

}

