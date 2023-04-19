package uct.mntawooo2.uctTokTik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public List<Account> getAccounts() {
        return mongoTemplate.findAll(Account.class, "accounts");
    }

    public Account addAccount(Account account) {
        return mongoTemplate.insert(account, "accounts");
    }

    public String deleteAccount(Integer accountId) {
        Query query = new Query(Criteria.where("accountId").is(accountId));
        mongoTemplate.remove(query, Account.class, "accounts");
        return "{Account: " + accountId + " is deleted}";
    }

    public String followAccount(Integer accountId) {
        Query query = new Query(Criteria.where("accountId").is(accountId));
        Update update = new Update();
        mongoTemplate.updateFirst(query, update.inc("followers", 1), Account.class, "accounts");
        return "{Account has 1 more follower}";
    }

    public String unFollowAccount(Integer accountId) {
        Query query = new Query(Criteria.where("accountId").is(accountId));
        Update update = new Update();
        mongoTemplate.updateFirst(query, update.inc("followers", -1), Account.class, "accounts");
        return "{Account has 1 less follower}";
    }
}
