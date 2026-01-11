package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "UserPackages")
public class UserPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userPackageId;

    @ManyToOne
    @JoinColumn(name = "packageId")
    private Package packageDetail;

    @ManyToOne
    @JoinColumn(name = "userId", unique = true)
    private User user;

}

