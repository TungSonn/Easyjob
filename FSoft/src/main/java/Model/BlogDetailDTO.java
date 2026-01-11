package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogDetailDTO {
    private int blogId;
    private int userId;
    private String title;
    private String content;
    private Date date;
    private String image;
    private String status;
    private int nLike;
    private int nCmt;
    private List<CommentDTO> cmt;
}
