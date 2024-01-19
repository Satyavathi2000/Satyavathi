package comparable;

import java.util.Comparator;

// Movie class
public class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    // Constructor
    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    // Getters
    public int getYearReleased() {

        return yearReleased;
    }

    public double getRating() {

        return rating;
    }

    public double getBudget() {

        return budget;
    }

    public double getCollectionAmount() {

        return collectionAmount;
    }
    public static void main(String[] args){

    }
}

class MovieComparator {
    // Comparator for sorting by rating and profit
    public static Comparator<Movie> ratingAndProfitComparator = Comparator
            .comparingDouble(Movie::getRating)
            .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget());

    // Comparator for sorting by year released and rating
    public static Comparator<Movie> yearAndRatingComparator = Comparator
            .comparingInt(Movie::getYearReleased)
            .thenComparingDouble(Movie::getRating);

    public static void main(String[] args) {
        // Creating an array of movies for testing
        Movie[] movies = {
                new Movie(2005, 8.5, 50.0, 120.0),
                new Movie(2010, 7.8, 80.0, 100.0),
                new Movie(2015, 9.2, 30.0, 200.0)
        };

        // Sorting movies based on rating and profit
        java.util.Arrays.sort(movies, MovieComparator.ratingAndProfitComparator);

        // Displaying sorted movies
        System.out.println("Sorted Movies based on Rating and Profit:");
        for (Movie movie : movies) {
            System.out.println(movie.getYearReleased() + " - Rating: " + movie.getRating()
                    + ", Profit: " + (movie.getCollectionAmount() - movie.getBudget()));
        }

        // Sorting movies based on year released and rating
        java.util.Arrays.sort(movies, MovieComparator.yearAndRatingComparator);

        // Displaying sorted movies based on year and rating
        System.out.println("\nSorted Movies based on Year Released and Rating:");
        for (Movie movie : movies) {
            System.out.println(movie.getYearReleased() + " - Rating: " + movie.getRating());
        }
    }
}