package domain;

public class LikesPost {
    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;

    public void setCountLikes(int count) {
        this.count = count;
    }

    public int getCountLikes() {
        return count;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

    public int getCanPublish() {
        return canPublish;
    }
}
