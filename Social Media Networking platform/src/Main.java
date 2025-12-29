public class Main {
    public static void main(String[] args) {

        Profile p1 = new Profile("perixh", "Perizat Qilimbay", 1200);
        Profile p2 = new Profile("alina_pr", "Alina Utebaeva", 980);
        Profile p3 = new Profile("ashton", "Nurshat Nurgisaqyzy", 790);
        Profile p4 = new Profile("tulegenova", "Tulegenova Assem", 9070);

        Post post1 = new Post(p1, "Learning Java today!", 150);
        Post post2 = new Post(p2, "Coffee + coding = ❤️", 210);
        Post post3 = new Post(p3, "Coding my first assignment for OOP", 890);

        Comment c1 = post1.addComment(p2, "woow so cool!!");
        Comment r1 = post1.replyToComment(c1, p1, "thank you!");
        Comment r2 = post1.replyToComment(r1, p2, "you're welcome 😊");

        Comment c2 = post1.addComment(p3, "I like this post!");
        post1.replyToComment(c2, p1, "thanks!");

        SocialNetwork sn = new SocialNetwork();
        sn.addProfile(p1);
        sn.addProfile(p2);
        sn.addProfile(p3);
        sn.addProfile(p4);

        sn.addPost(post1);
        sn.addPost(post2);
        sn.addPost(post3);

        System.out.println("\n--- ALL PROFILES ---");
        sn.showAllProfiles();

        System.out.println("\n--- ALL POSTS ---");
        sn.showAllPosts();

        System.out.println("\n--- SEARCH PROFILE ---");
        System.out.println(sn.findProfile("perixh"));

        System.out.println("\n--- FILTER POSTS (likes >= 200) ---");
        for (Post p : sn.filterPostsByLikes(200)) {
            System.out.println(p);
        }

        System.out.println("\n--- SORT PROFILES BY FOLLOWERS ---");
        for (Profile p : sn.sortProfilesByFollowers()) {
            System.out.println(p);
        }
    }
}
