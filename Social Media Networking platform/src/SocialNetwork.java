import java.util.ArrayList;

public class SocialNetwork {
    private ArrayList<Profile> profiles = new ArrayList<>();
    private ArrayList<Post> posts = new ArrayList<>();

    public void addProfile(Profile profile) {
        profiles.add(profile);
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void showAllProfiles() {
        System.out.println("\n--- All Profiles ---");
        for (Profile p : profiles) {
            p.display();
        }
    }

    public void showAllPosts() {
        System.out.println("\n--- All Posts ---");
        for (Post post : posts) {
            post.display();
        }
    }
}

