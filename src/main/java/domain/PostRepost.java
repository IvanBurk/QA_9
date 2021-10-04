package domain;

public class PostRepost {
    private int count;
    private int userReposted;

    public void setRepostCount(int count) {
        this.count = count;
    }

    public int getRepostCount() {
        return count;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }

    public int getUserReposted() {
        return userReposted;
    }
}
