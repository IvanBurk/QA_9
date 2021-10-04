package domain;

public class PostSource {
    private String type;
    private String platform;
    private String data;
    private String url;

    public void setSourceType(String type) {
        this.type = type;
    }

    public String getSourceType() {
        return type;
    }

    public void setSourcePlatform(String platform) {
        this.platform = platform;
    }

    public String getSourcePlatform() {
        return platform;
    }

    public void setSourceData(String data) {
        this.data = data;
    }

    public String getSourceData() {
        return data;
    }

    public void setSourceUrl(String url) {
        this.url = url;
    }

    public String getSourceUrl() {
        return url;
    }
}
