/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  public static String owner = "PLTW";
  public static int numEntries = 0;
  public static int numSongs = 0;
  public static int numBooks = 0;
  public static int numMovies = 0;
  public static int dateTimeStr = 2;

  public void addBook(Book b)
  {
    if (book != null) {
      System.out.println("You cannot add more than one book.");
    } else {
      book = b;
      numEntries += 1;
      numBooks += 1;
    }
    
  }
  
  public void addSong(Song s)
  {
    if (song != null) {
      System.out.println("You cannot add more than one song.");
    } else {
      song = s;
      numEntries += 1;
      numSongs += 1;
    }
    
  }
  public void addMovie(Movie m)
  {
    if (movie != null) {
      System.out.println("You cannot add more than one movie.");
    } else {
      movie = m;
      numEntries += 1;
      numMovies += 1;
    }
  }

  public String toString() 
  {
    String info = "Book: " + book + "\n" + "Movie: " + movie + "\n"+ "Song: " + song;
    
    return info;
  }

  public static String getOwner() {
    return owner;
  }

  public static void changeOwner(String newOwner) {
    owner = newOwner;
  }
  public static int getNumEntries() {
    // System.out.println("Test: Owner is " + owner);
    // System.out.println("Test: Book is " + book);
    // System.out.println("Test: Movie is " + movie);
    // System.out.println("Test: MediaLib is " + this.book);
    return numEntries;
  }
}