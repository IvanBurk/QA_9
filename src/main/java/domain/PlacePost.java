package domain;

public class PlacePost {
    private int id;
    private String title;
    private int latitude;
    private int longitude;
    private int created;
    private String icon;
    private int checkins;
    private int updated;
    private int type;
    private int country;
    private int city;
    private String address;

    public void setDomainId(int id) {
        this.id = id;
    }

    public int getDomainId() {
        return id;
    }

    public void setDomainTitle(String title) {
        this.title = title;
    }

    public String getDomainTitle() {
        return title;
    }

    public void setDomainLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getDomainLatitude() {
        return latitude;
    }

    public void setDomainLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getDomainLongitude() {
        return longitude;
    }

    public void setDomainCreated(int created) {
        this.created = created;
    }

    public int getDomainCreated() {
        return created;
    }

    public void setDomainIcon(String icon) {
        this.icon = icon;
    }

    public String getDomainIcon() {
        return icon;
    }

    public void setDomainCheckins(int checkins) {
        this.checkins = checkins;
    }

    public int getDomainCheckins() {
        return checkins;
    }

    public void setDomainUpdated(int updated) {
        this.updated = updated;
    }

    public int getDomainUpdated() {
        return updated;
    }

    public void setDomainType(int type) {
        this.type = type;
    }

    public int getDomainType() {
        return type;
    }

    public void setDomainCountry(int country) {
        this.country = country;
    }

    public int getDomainCountry() {
        return country;
    }

    public void setDomainCity(int city) {
        this.city = city;
    }

    public int getDomainCity() {
        return city;
    }

    public void setDomainAddress(String address) {
        this.address = address;
    }

    public String getDomainAddress() {
        return address;
    }
}
