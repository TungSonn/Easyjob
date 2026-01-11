package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CompanyProfile")
public class CompanyProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyId;

    private String companyName;

    @OneToOne
    @JoinColumn(name = "userId", unique = true)
    private User user;

    @Column(columnDefinition = "TEXT")
    private String aboutUs;

    private String address;

    private String status;

    private String url;

}

