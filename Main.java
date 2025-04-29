import java.util.ArrayList;

public class Main {
    public static void main(String[] args) 
    {
        Review[] reviews = {
            new Review(5, "Great site!"),
            new Review(3, "It was okay"),
            new Review(4, "Loved it! Will come back"),
            new Review(2, ""),
            new Review(3, "Not bad")
        };

        ReviewAnalysis analysis = new ReviewAnalysis(reviews);

        double average = analysis.getAverageRating();
        System.out.println("Average rating: " + average);

        ArrayList<String> comments = analysis.collectComments();
        System.out.println("Collected comments:");
        for (String comment : comments) 
        {
            System.out.println(comment);
        }
    }
}