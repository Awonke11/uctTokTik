package uct.mntawooo2.uctTokTik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public String addComment(Comment comment) {
        // mongoTemplate.insert();
        return "";
    }
}
