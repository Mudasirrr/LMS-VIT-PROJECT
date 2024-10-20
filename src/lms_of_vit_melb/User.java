package lms_of_vit_melb;

public class User {
    public String userId;
    public String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name;
    }
}
