package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements AddReview{
    private String shopName;
    private String description;
    private double numOfDollars;
    private double numOfStars;
    public List<Review> reviews = new ArrayList<>();

    public Shop(String shopName, String description, double numOfDollars) {
        this.shopName = shopName;
        this.description = description;
        this.numOfDollars = numOfDollars;
    }

    public String getShopName() {
        return shopName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNumOfDollars() {
        return numOfDollars;
    }

    public String getDescription() {
        return description;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setNumOfDollars(double numOfDollars) {
        this.numOfDollars = numOfDollars;
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
        return "Shop{" +
                "name='" + shopName + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollars=" + numOfDollars + '\'' +  "reviews=" + reviews +
                '}';
    }


}
