 /*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private Double duration;
  private int rating;
  
  /*** Constructor ****/
  public Movie(String t, Double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\"Duration: " + duration;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }

    public void adjustRating(int i) {

    }
}
