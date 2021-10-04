package domain;

public class GeoPost {
    private int type;
    private int coordinates;
    private PlacePost placePost;

    public void setGeoType(int type) {
        this.type = type;
    }

    public int getGeoType() {
        return type;
    }

    public void setGeoCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public int getGeoCoordinators() {
        return coordinates;
    }

    public void setGeoPlacePost(PlacePost placePost) {
        this.placePost = placePost;
    }

    public PlacePost getGeoPlacePost() {
        return placePost;
    }
}
