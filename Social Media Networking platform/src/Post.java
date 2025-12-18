import java.util.ArrayList;

public class Post {
    private Profile author;
    private String content;
    private int likes;
    private ArrayList<Comment> comments = new ArrayList<>();

    public Post(Profile author, String content, int likes) {
        this.author = author;
        this.content = content;
        this.likes = likes;
    }

    // --- getters и setters ---
    public Profile getAuthor() {
        return author;
    }

    public void setAuthor(Profile author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    // --- добавление комментария ---
    public Comment addComment(Profile author, String text) {
        Comment c = new Comment(author, text);
        comments.add(c);
        return c; // возвращаем комментарий
    }

    // --- ответ на комментарий ---
    public Comment replyToComment(Comment parent, Profile author, String text) {
        Comment reply = new Comment(author, text, parent);
        parent.addReply(reply);
        return reply; // возвращаем ответ
    }

    // --- вывод поста с комментариями ---
    public void display() {
        System.out.println("Post by @" + author.getUsername()
                + ": \"" + content + "\" (Likes: " + likes + ")");

        if (comments.isEmpty()) {
            System.out.println("   No comments yet");
            return;
        }

        System.out.println("   Comments:");
        for (Comment c : comments) {
            c.display("      "); // рекурсивный вывод с отступом
        }
    }
}


