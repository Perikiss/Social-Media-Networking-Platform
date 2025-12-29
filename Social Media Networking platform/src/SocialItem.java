import java.util.Objects;

public abstract class SocialItem {
    protected Profile author;

    public SocialItem(Profile author) {
        this.author = author;
    }

    public Profile getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SocialItem)) return false;
        SocialItem that = (SocialItem) o;
        return Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }

    @Override
    public abstract String toString();
}
