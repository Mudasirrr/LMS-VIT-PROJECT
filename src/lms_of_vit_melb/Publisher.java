package lms_of_vit_melb;

public class Publisher {
    private String publisherId;
    private String publisherName;

    public Publisher(String publisherId, String publisherName) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    @Override
    public String toString() {
        return publisherName;
    }
}
