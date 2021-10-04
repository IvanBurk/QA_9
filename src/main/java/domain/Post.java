package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int data;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int postType;
    private int singerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markerAsAds;
    private boolean isFavorite;
    private int postponedId;
    private PostComment postComment;
    private CopyrightPost copyrightPost;
    private LikesPost likesPost;
    private PostRepost postRepost;
    private PostView postView;
    private PostSource postSource;
    private GeoPost geoPost;
    private PostDonate postDonate;

    public void setPostId(int id) {
        this.id = id;
    }

    public int getPostId() {
        return id;
    }

    public void setPostOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getPostOwnerId() {
        return ownerId;
    }

    public void setPostFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getPostFromId() {
        return fromId;
    }

    public void setPostCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getPostCreatedBy() {
        return createdBy;
    }

    public void setPostData(int data) {
        this.data = data;
    }

    public int getPostData() {
        return data;
    }

    public void setPostText(String text) {
        this.text = text;
    }

    public String getPostText() {
        return text;
    }

    public void setPostReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getPostReplyOwnerId() {
        return replyOwnerId;
    }

    public void setPostReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getPostReplyPostId() {
        return replyPostId;
    }

    public void setPostFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getPostFriendsOnly() {
        return friendsOnly;
    }

    public void setPostPostType(int postType) {
        this.postType = postType;
    }

    public int getPostPostType() {
        return postType;
    }

    public void setPostSingerId(int singerId) {
        this.singerId = singerId;
    }

    public int getPostSingerId() {
        return singerId;
    }

    public void setPostCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getPostCanPin() {
        return canPin;
    }

    public void setPostCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getPostCanDelete() {
        return canDelete;
    }

    public void setPostCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getPostCanEdit() {
        return canEdit;
    }

    public void setPostIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getPostIsPinned() {
        return isPinned;
    }

    public void setPostMarkerAsAds(int markerAsAds) {
        this.markerAsAds = markerAsAds;
    }

    public int getPostMarkerAsAds() {
        return markerAsAds;
    }

    public void setPostIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public boolean getPostIsFavorite() {
        return isFavorite;
    }

    public void setPostPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public int getPostPostponedId() {
        return postponedId;
    }

    public void setPostPostComment(PostComment postComment) {
        this.postComment = postComment;
    }

    public PostComment getPostPostComment() {
        return postComment;
    }

    public void setPostCopyrightPost(CopyrightPost copyrightPost) {
        this.copyrightPost = copyrightPost;
    }

    public CopyrightPost getPostCopyrightPost() {
        return copyrightPost;
    }

    public void setPostLikesPost(LikesPost likesPost) {
        this.likesPost = likesPost;
    }

    public LikesPost getPostLikesPost() {
        return likesPost;
    }

    public void setPostPostRepost(PostRepost postRepost) {
        this.postRepost = postRepost;
    }

    public PostRepost getPostPostRepost() {
        return postRepost;
    }

    public void setPostPostView(PostView postView) {
        this.postView = postView;
    }

    public PostView getPostPostView() {
        return postView;
    }

    public void setPostPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public PostSource getPostPostSource() {
        return postSource;
    }

    public void setPostGeoPost(GeoPost geoPost) {
        this.geoPost = geoPost;
    }

    public GeoPost getPostGeoPost() {
        return geoPost;
    }

    public void setPostPostDonate(PostDonate postDonate) {
        this.postDonate = postDonate;
    }

    public PostDonate getPostPostDonate() {
        return postDonate;
    }

}
