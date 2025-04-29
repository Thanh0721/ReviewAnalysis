import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(Review[] reviews) 
    {
        allReviews = reviews;
    }

    public double getAverageRating() 
    {
        int sum = 0;
        for (int i = 0; i < allReviews.length; i++) 
        {
            sum += allReviews[i].getRating();
        }
        return (double) sum / allReviews.length;
    }

    public ArrayList<String> collectComments() 
    {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < allReviews.length; i++) 
        {
            String comment = allReviews[i].getComment();
            if (comment.contains("!")) 
            {
                char lastChar = comment.charAt(comment.length() - 1);
                if (lastChar != '.' && lastChar != '!') 
                {
                    comment += ".";
                }
                result.add(i + "-" + comment);
            }
        }
        return result;
    }
}