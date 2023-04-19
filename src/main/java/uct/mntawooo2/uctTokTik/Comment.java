package uct.mntawooo2.uctTokTik;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comment {
    @Id
    private ObjectId id;
    private Integer accountId;
    private String authorName;
    private String comment;

    public Comment(Integer accountId, String authorName, String comment) {
        this.accountId = accountId;
        this.authorName = authorName;
        this.comment = comment;
    }

    public Comment() {
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "{" +
                " accountId='" + getAccountId() + "'" +
                ", authorName='" + getAuthorName() + "'" +
                ", comment='" + getComment() + "'" +
                "}";
    }

}