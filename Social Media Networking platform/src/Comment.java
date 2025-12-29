import java.util.ArrayList;

public class Comment extends SocialItem {
    private String text;
    private Comment parent;
    private ArrayList<Comment> replies = new ArrayList<>();

    public Comment(Profile author, String text) {
        super(author);
        this.text = text;
    }

    public Comment(Profile author, String text, Comment parent) {
        super(author);
        this.text = text;
        this.parent = parent;
    }

    public void addReply(Comment reply) {
        replies.add(reply);
    }

    public void display(String indent) {
        System.out.println(indent + this);
        for (Comment r : replies) {
            r.display(indent + "   ");
        }
    }

    @Override
    public String toString() {
        return "@" + author.getUsername() + ": " + text;
    }
}
