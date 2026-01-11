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
@Table(name = "Jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobId;

    @ManyToOne
    @JoinColumn(name = "companyId")
    private CompanyProfile company;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private int experienceYears;

    private String location;

    private int salary;

    private String status;

    @Column(nullable = false)
    private LocalDateTime date = LocalDateTime.now();

}

