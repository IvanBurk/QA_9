package domain;

public class CopyrightPost {
    private int id;
    private String link;
    private String type;
    private String name;

    public void setCopyrightId(int id) {
        this.id = id;
    }

    public int getCopyrightId() {
        return id;
    }

    public void setCopyrightLink(String link) {
        this.link = link;
    }

    public String getCopyrightLink() {
        return link;
    }

    public void setCopyrightType(String type) {
        this.type = type;
    }

    public String getCopyrightType() {
        return type;
    }

    public void setCopyrightName(String name) {
        this.name = name;
    }

    public String getCopyrightName() {
        return name;
    }
}
