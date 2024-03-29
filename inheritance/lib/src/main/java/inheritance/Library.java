/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {
        Restaurant res = new Restaurant("turbo",5,10);
        System.out.println(res);
        Review review = new Review("bad","march",5);
        Review rev2 = new Review("Nice", "Marah", 4);
        res.addReview(review);
        res.addReview(rev2);
        System.out.println(rev2.toString());
        System.out.println(res.toString());

//        --------------------------Lab7----------------------

        Shop ShopRev = new Shop("glasses", "Good", 12);
        System.out.println("Shop Rating Reviews");
        System.out.println("Shop Reviews");
        System.out.println(ShopRev.toString());
        System.out.println("Enter rating not between 0 and 5");
        Review rev4 = new Review("not good","marah",7);
        ShopRev.addReview(rev4);
        System.out.println(rev4.toString());
        System.out.println(ShopRev.toString());

        Theater reviewTheatre = new Theater("jarash",5);
        System.out.println(reviewTheatre.toString());
        Review rev5 = new Review("great","marah",5);
        reviewTheatre.addReview(rev5);
        reviewTheatre.addMovie("Don't Breath");
        reviewTheatre.addMovie("Primal Fear");
        System.out.println(reviewTheatre.toString());
        reviewTheatre.removeMovie("Primal Fear");
        System.out.println(reviewTheatre.getMovies());
        System.out.println(reviewTheatre.toString());


        AddReview MyRev = new Shop("newShop", "good", 4);
        Review r = new Review("body","tala",3);
        MyRev.addReview(r);
        System.out.println(MyRev.toString());
    }
}
