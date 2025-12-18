import java.util.ArrayList;

public class Comment {
    private Profile author;
    private String text;
    private Comment parent;
    private ArrayList<Comment> replies = new ArrayList<>();

    public Comment(Profile author, String text) {
        this.author = author;
        this.text = text;
        this.parent = null;
    }

    public Comment(Profile author, String text, Comment parent) {
        this.author = author;
        this.text = text;
        this.parent = parent;
    }

    public void addReply(Comment reply) {
        replies.add(reply);
    }

    // --- getters ---
    public Profile getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public ArrayList<Comment> getReplies() {
        return replies;
    }

    // --- recursive display ---
    public void display(String indent) {
        System.out.println(indent + "@" + author.getUsername() + ": " + text);

        for (Comment reply : replies) {
            reply.display(indent + "    ");
        }
    }
}


