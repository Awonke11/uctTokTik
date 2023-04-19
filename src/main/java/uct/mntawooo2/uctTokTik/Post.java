package uct.mntawooo2.uctTokTik;

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
    public Integer likes;

    public Post(Integer accountId, String title, String description, String video,
            Integer likes) {
        this.accountId = accountId;
        this.title = title;
        this.description = description;
        this.video = video;
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

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "{ accountId='" + getAccountId() + "'" +
                ", title='" + getTitle() + "'" +
                ", description='" + getDescription() + "'" +
                ", video='" + getVideo() + "'" +
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
        return Objects.equals(id, post.id) && Objects.equals(accountId, post.accountId)
                && Objects.equals(title, post.title) && Objects.equals(description, post.description)
                && Objects.equals(video, post.video) && Objects.equals(likes, post.likes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, title, description, video, likes);
    }

}
