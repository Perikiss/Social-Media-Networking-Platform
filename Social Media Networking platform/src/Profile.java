import java.util.Objects;

public class Profile {
    private String username;
    private String fullName;
    private int followers;

    public Profile(String username, String fullName, int followers) {
        this.username = username;
        this.fullName = fullName;
        this.followers = followers;
    }

    public String getUsername() {
        return username;
    }

    public int getFollowers() {
        return followers;
    }

    public void follow(Profile other) {
        other.followers++;
    }

    @Override
    public String toString() {
        return fullName + " (@" + username + "), followers: " + followers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profile)) return false;
        Profile profile = (Profile) o;
        return Objects.equals(username, profile.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
