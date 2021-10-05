package inheritance;

//import main.java.inheritance.Library;
//import main.java.inheritance.Restaurant;
//import main.java.inheritance.Review;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void constructorRestaurant() {
        Restaurant res = new Restaurant("PizzaHut", 2, 1);
        assertEquals("PizzaHut", res.getShopName());
        assertEquals(2, res.getNumOfStars());
        assertEquals(1, res.getPriceCategory());
    }

    @Test
    void toStringRestaurant() {
        Restaurant res = new Restaurant("mac", 3, 3);
        String expectedString = "Restaurant{name='mac', stars=3.0, priceCategory=$$$, reviews=[]}";
        assertEquals(expectedString, res.toString());
    }

    @Test
    void constructorReview() {
        Review review = new Review("Delicious meals", "Marah", 4);
        assertEquals("Delicious meals", review.getBody());
        assertEquals("Marah", review.getAuthor());
        assertEquals(4, review.getNumOStars());
    }

    @Test
    void toStringReview() {
        Review review = new Review("The meals taste great", "Marah", 5);
        String expectedString = "Review{body='The meals taste great', author='Marah', stars=5}";
        assertEquals(expectedString, review.toString());
    }

    @Test public void testAddReviewMethod(){
        // the instance
        Restaurant res1 = new Restaurant("pizza",5,4);
        Review rev1 = new Review("nice","mais",5);
        res1.addReview(rev1);
        String out =  "Restaurant{name='pizza', stars=5.0, priceCategory=$$$$, reviews=[Review{body='nice', author='mais', stars=5}]}";

        assertEquals(out,res1.toString(),"call addReview, the association is created between the Restaurant and the " +
                "Review");
    }
// ----------------------------------------------------Lab7--------------------------------------------------


    @Test
    void Lab07Test(){
        Shop ShopRev = new Shop("glasses", "Good", 12);
        Review rev4 = new Review("not good","marah",7);
        ShopRev.addReview(rev4);
        assertEquals("Shop{name='glasses', description='Good', numOfDollars=12.0'reviews=[Review{body='not good', author='marah', stars=7}]}",ShopRev.toString());

        Theater reviewTheatre = new Theater("jarash",5);
        Review rev5 = new Review("great","marah",5);
        reviewTheatre.addMovie("Don't Breath");
        reviewTheatre.addMovie("Primal Fear");
//        System.out.println(theater.getMovies());
//        System.out.println(theater.toString());
        List<String> newOne = reviewTheatre.getMovies();
        assertEquals("Theater{theaterName='jarash', reviews=[], movies=[Don't Breath, Primal Fear], numOfStars='5.0'}", reviewTheatre.toString());
        assertEquals(newOne, reviewTheatre.getMovies());

        reviewTheatre.addReview(rev5);
        assertEquals("Theater{theaterName='jarash', reviews=[Review{body='great', author='marah', stars=5}], movies=[Don't Breath, Primal Fear], numOfStars='5.0'}", reviewTheatre.toString());
        reviewTheatre.removeMovie("Primal Fear");
        assertEquals("Theater{theaterName='jarash', reviews=[Review{body='great', author='marah', stars=5}], movies=[Don't Breath], numOfStars='5.0'}", reviewTheatre.toString());

        AddReview MyRev = new Shop("newShop", "good", 4);
        Review r = new Review("body","tala",3);
        MyRev.addReview(r);
        assertEquals("Shop{name='newShop', description='good', numOfDollars=4.0'reviews=[Review{body='body', author='tala', stars=3}]}", MyRev.toString());

    }

    @Test
    void ReviewToString() {
        Review rev4 = new Review("not good","marah",7);
        String result = "Review{body='not good', author='marah', stars=7}";
        assertEquals(result, rev4.toString());
    }

    @Test public void AddReviewMethod(){
        // the instance
        Restaurant res1 = new Restaurant("pizza",5,4);
        Review rev1 = new Review("nice","mais",5);
        res1.addReview(rev1);
        String out =  "Restaurant{name='pizza', stars=5.0, priceCategory=$$$$, reviews=[Review{body='nice', author='mais', stars=5}]}";

        assertEquals(out,res1.toString(),"call addReview, the association is created between the Restaurant and the " +
                "Review");
    }



}



