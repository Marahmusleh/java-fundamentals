package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Theater implements AddReview{
    private String theaterName;
    public List<Review> reviews = new ArrayList<>();
    public LinkedList<String> movies = new LinkedList<String>();
    private double numOfStars;


    public Theater(String theaterName, double numOfStars) {
        this.theaterName = theaterName;
        this.numOfStars=numOfStars;
    }

    public LinkedList<String> getMovies() {
        return movies;
    }

    public void setMovies(LinkedList<String> movies) {
        this.movies = movies;
    }

    public void addMovie(String movie){
        if(!this.movies.contains(movie))
            this.movies.add(movie);
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
    }

    @Override
    public void addReview(Review review) {
        if (!reviews.contains(review)) { // prevent duplicates
            reviews.add(review);
            this.numOfStars = (this.numOfStars * (reviews.size()) + review.getNumOStars())/ (reviews.size()+1);

        }
    }

    @Override
    public String toString() {
        return "Theater{" +
                "theaterName='" + theaterName + '\'' +
                ", reviews=" + reviews +
                ", movies=" + movies +
                ", numOfStars='" + numOfStars + '\'' +
                '}';
    }
}
