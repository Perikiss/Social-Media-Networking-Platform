import java.util.ArrayList;

public class Post extends SocialItem {
    private String content;
    private int likes;
    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(Profile author, String content, int likes) {
        super(author);
        this.content = content;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public Comment addComment(Profile author, String text) {
        Comment c = new Comment(author, text);
        comments.add(c);
        return c;
    }

    public Comment replyToComment(Comment parent, Profile author, String text) {
        Comment reply = new Comment(author, text, parent);
        parent.addReply(reply);
        return reply;
    }

    public void display() {
        System.out.println(this);
        for (Comment c : comments) {
            c.display("   ");
        }
    }

    @Override
    public String toString() {
        return "Post by @" + author.getUsername() +
                ": \"" + content + "\" (Likes: " + likes + ")";
    }
}
