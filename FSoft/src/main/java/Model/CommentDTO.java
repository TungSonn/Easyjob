package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    private int commentId;
    private int userId;
    private int blogId;
    private String uFullName;
    private String content;
    private String date;
    private String avatar;
}
