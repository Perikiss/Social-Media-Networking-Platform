public class Main {
    public static void main(String[] args) {

        Profile p1 = new Profile("perixh", "Perizat Qilimbay", 1200);
        Profile p2 = new Profile("alina_pr", "Alina Utebaeva", 980);
        Profile p3 = new Profile("ashton", "Nurshat Nurgisaqyzy", 790);
        Profile p4 = new Profile("Tulegenova Assem", "Tulegenova Assem", 9070);

        Post post1 = new Post(p1, "Learning Java today!", 150);
        Post post2 = new Post(p2, "Coffee + coding = ❤️", 210);
        Post post3 = new Post(p3, "codding my first assignment for OOP", 890);

        Comment c1 = post1.addComment(p2, "woow so cool!!");
        Comment r1 = post1.replyToComment(c1, p1, "thank you!");
        Comment c2 = post1.addComment(p2, "WOOW, i am also learning this programming language in this trimester");
        Comment r2 = post1.replyToComment(c2, p2, "Same, I also study Java!");
        Comment c3 = post2.addComment(p2, "its so aesthetic gurl");
        Comment r3 = post2.replyToComment(c3, p3, "thankss)))");


        SocialNetwork sn = new SocialNetwork();
        sn.addProfile(p1);
        sn.addProfile(p2);
        sn.addProfile(p3);
        sn.addProfile(p4);

        p1.follow(p4);
        p3.follow(p1);
        p4.follow(p2);
        p2.follow(p4);

        sn.addPost(post1);
        sn.addPost(post2);
        sn.addPost(post3);

        sn.showAllProfiles();
        sn.showAllPosts();

        System.out.println("\nFollowers comparison (p1 > p2): " +
                (p1.getFollowers() > p2.getFollowers()));
    }
}