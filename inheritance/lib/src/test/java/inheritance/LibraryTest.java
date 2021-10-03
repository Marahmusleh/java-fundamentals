package inheritance;

//import main.java.inheritance.Library;
//import main.java.inheritance.Restaurant;
//import main.java.inheritance.Review;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void constructorRestaurant() {
        Restaurant res = new Restaurant("PizzaHut", 2, 1);
        assertEquals("PizzaHut", res.getName());
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


    }



