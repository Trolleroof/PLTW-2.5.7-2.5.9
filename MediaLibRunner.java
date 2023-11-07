/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

//step 15

System.out.println("You have a NEW Library");
MediaLib myLib2 = new MediaLib();

Book newBook = new Book("To Kill a Mockingbird", "Lee");
myLib2.addBook(newBook);
System.out.println(myLib2);
newBook = new Book("1984", "Orwell");
System.out.println(myLib2);


  }
}