# Lab06: Inheritance and Interfaces
## Architecture:
The architecture of this application was built using Gradle version 7.1.1 .

* In the src/main/java/inheritance package we have 3 classes:
1. Library (has the main method).
2. Restaurant.
3. Review
* In the src/test/java/inheritance package we have the test file:
* The testing file has the following testing methods:

1. constructorRestaurant: tests if the restaurant class' constructor is instantiating correctly.
2. toStringRestaurant: tests if the restaurant class' toString method is returning correctly.
3. constructorReview: tests if the review class' constructor is instantiating correctly.
4. toStringReview: tests if the review class' toString method is returning correctly.
5. testAddReviewMethod: tests if the adding reviews into a restaurant instance is working and returns the right String value.
## Overview 
### Class Restaurent
should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
Implement a Restaurant constructor for the data and override toString method to get data string.
## Class Review
should have a body, an author, and a number of stars.
Implement a Review constructor for the data and override toString method to get data string.
should be about a single Restaurant

# Lab07: Inheritance and Interfaces part 2

* In the src/main/java/inheritance package we have 5 classes:
1. Library (has the main method).
2. Restaurant.
3. Review
4. Theatre 
5. Shop
6. AddReview (Interface).

## Class Theater(Implements Interface)
should have a name, and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)
Implement a constructor for a Theater.
Implement a reasonable toString method for Theaters.
## Class Shop(Implements Interface)
should have a name, descriptions, number of dollar signs.
Implement a constructor for a Shop.
Implement a reasonable toString method for Shops.
## Class AddReview
Interface class, contains abstract method called AddReview
## Methods
## addReview
Method in restaurent class that take in a Review instance, and associate that review with this Restaurant
## addMovie:
add the name of the movie that we want to have it in the list.
## removeMovie
remove the name of the movie that we want to delete it from the list.

The testing file has the following testing methods:
1. ReviewToString: tests if the review class' toString method is returning correctly.
2. Tests: tests all the methods of addMovie and removeMovie
5. testAddReviewMethod: tests if the adding reviews into a restaurant instance is working and returns the right String value.