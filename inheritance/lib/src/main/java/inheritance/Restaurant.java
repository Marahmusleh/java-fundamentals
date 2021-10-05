package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private double numOfStars;
    private int priceCategory;
    public List<Review> reviews;

    public Restaurant(String name, double numOfStars, int priceCategory) {
        this.name = name;
        this.numOfStars = numOfStars;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<Review>();
    }


    public String getShopName() {
        return name;
    }

    public void setShopName(String shopName) {
        this.name = shopName;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(double numOfStars) {
        this.numOfStars = numOfStars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) { // prevent duplicates
            reviews.add(review);
            this.numOfStars = (this.numOfStars * (reviews.size()) + review.getNumOStars())/ (reviews.size()+1);

        }
    }
    @Override
    public String toString() {
        // covert priceCategory to dollar signs
        String dollar = "";
        for (int i = 0; i < priceCategory; i++) {
            dollar += "$";
        }

        return "Restaurant{" + "name='" + name + '\'' + ", stars=" + numOfStars + ", priceCategory=" + dollar + ", " +
                "reviews=" + reviews + '}';
    }
}

