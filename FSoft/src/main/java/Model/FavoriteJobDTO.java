package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteJobDTO {
    private int id;
    private String title;
    private int yearEx;
    private String location;
    private int salary;
    private String companyName;
    private String Status;
}
