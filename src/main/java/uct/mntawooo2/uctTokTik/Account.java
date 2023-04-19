package uct.mntawooo2.uctTokTik;

import java.util.ArrayList;
import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Account {
    @Id
    private ObjectId id;
    private Integer accountId;
    private String name;
    private String email;
    private String password;
    private String description;
    private Integer followers;
    private ArrayList<Post> posts;

    public Account(Integer accountId, String name, String email, String password, String description, Integer followers,
            ArrayList<Post> posts) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.description = description;
        this.followers = followers;
        this.posts = posts;
    }

    public Account() {
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer AccountId) {
        this.accountId = AccountId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFollowers() {
        return this.followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public ArrayList<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "{AccountId='" + getAccountId() + "'" +
                ", name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                ", password='" + getPassword() + "'" +
                ", description='" + getDescription() + "'" +
                ", followers='" + getFollowers() + "'" +
                ", posts='" + getPosts() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(accountId, account.accountId)
                && Objects.equals(name, account.name) && Objects.equals(email, account.email)
                && Objects.equals(password, account.password) && Objects.equals(description, account.description)
                && Objects.equals(followers, account.followers) && Objects.equals(posts, account.posts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, name, email, password, description, followers, posts);
    }

}
