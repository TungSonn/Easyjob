package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogDTO {
    private int blogId;
    private int userId;
    private String title;
    private String content;
    private LocalDateTime date;
    private String image;
    private String status;
    private int nLike;
    private int nCmt;
}
