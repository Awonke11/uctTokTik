package uct.mntawooo2.uctTokTik;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    AccountTreeNode accountTreeNode = new AccountTreeNode(new Account(
            12345, "Awonke Mnotoza", "mntawo002@myuct.ac.za", "password", "Some small text here", 1,
            new ArrayList<Post>()));

    public List<Account> allAccounts() {
        for (Account account : accountRepository.getAccounts()) {
            accountTreeNode.insertAccount(account);
        }
        return accountTreeNode.showAllAccounts();
    }
}
