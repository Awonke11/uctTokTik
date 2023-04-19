package uct.mntawooo2.uctTokTik;

import java.util.ArrayList;
import java.util.Objects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post {
    @Id
    private ObjectId id;
    public Integer accountId;
    public String title;
    public String description;
    public String video;
    public ArrayList<Comment> comments;
    public Integer likes;

    public Post(Integer accountId, String title, String description, String video, ArrayList<Comment> comments,
            Integer likes) {
        this.accountId = accountId;
        this.title = title;
        this.description = description;
        this.video = video;
        this.comments = comments;
        this.likes = likes;
    }

    public Post() {
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public ArrayList<Comment> getComments() {
        return this.comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "{" +
                " accountId='" + getAccountId() + "'" +
                ", title='" + getTitle() + "'" +
                ", description='" + getDescription() + "'" +
                ", video='" + getVideo() + "'" +
                ", comments='" + getComments() + "'" +
                ", likes='" + getLikes() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Post)) {
            return false;
        }
        Post post = (Post) o;
        return Objects.equals(accountId, post.accountId) && Objects.equals(title, post.title)
                && Objects.equals(description, post.description) && Objects.equals(video, post.video)
                && Objects.equals(comments, post.comments) && Objects.equals(likes, post.likes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, title, description, video, comments, likes);
    }

}
