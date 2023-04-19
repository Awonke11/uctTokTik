package uct.mntawooo2.uctTokTik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public String addPost(Post post, Integer accountId) {
        Query query = new Query(Criteria.where("accountId").is(accountId));
        Update update = new Update().push("posts", post);
        mongoTemplate.updateFirst(query, update, Account.class, "accounts");
        return "{Post " + post.toString() + " added}";
    }
}
