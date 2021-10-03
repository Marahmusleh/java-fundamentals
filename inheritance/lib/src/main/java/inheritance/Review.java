package inheritance;

public class Review {
    private String body;
    private String author;
    private int numOStars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.numOStars = stars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOStars() {
        return numOStars;
    }

    public void setNumOStars(int numOStars) {
        this.numOStars = numOStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + numOStars +
                '}';
    }
}
