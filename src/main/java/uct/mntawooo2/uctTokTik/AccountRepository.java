package uct.mntawooo2.uctTokTik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
    @Autowired
    MongoTemplate mongoTemplate;

    public List<Account> getAccounts() {
        return mongoTemplate.findAll(Account.class);
    }
}
