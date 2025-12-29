import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SocialNetwork {
    private ArrayList<Profile> profiles = new ArrayList<>();
    private ArrayList<Post> posts = new ArrayList<>();

    public void addProfile(Profile p) {
        profiles.add(p);
    }

    public void addPost(Post p) {
        posts.add(p);
    }

    public Profile findProfile(String username) {
        return profiles.stream()
                .filter(p -> p.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public ArrayList<Post> filterPostsByLikes(int minLikes) {
        return posts.stream()
                .filter(p -> p.getLikes() >= minLikes)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Profile> sortProfilesByFollowers() {
        return profiles.stream()
                .sorted(Comparator.comparingInt(Profile::getFollowers).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void showAllProfiles() {
        profiles.forEach(System.out::println);
    }

    public void showAllPosts() {
        posts.forEach(Post::display);
    }
}
