package uct.mntawooo2.uctTokTik;

import java.util.ArrayList;
import java.util.List;

public class AccountTreeNode {
    public Account root;
    public AccountTreeNode left;
    public AccountTreeNode right;

    public AccountTreeNode(Account root) {
        this.root = root;
    }

    public void insertAccount(Account account) {
        if (this.root.getAccountId() > account.getAccountId()) {
            if (this.left != null) {
                this.left.insertAccount(account);
            } else {
                this.left = new AccountTreeNode(account);
            }
        } else {
            if (this.right != null) {
                this.right.insertAccount(account);
            } else {
                this.right = new AccountTreeNode(account);
            }
        }
    }

    public List<Account> showAllAccounts() {
        List<Account> accounts = new ArrayList<Account>();
        if (this.root != null) {
            accounts.add(this.root);
            if (this.left != null) {
                this.left.showAllAccounts();
            }
            if (this.right != null) {
                this.right.showAllAccounts();
            }
        }
        return accounts;
    }
}
