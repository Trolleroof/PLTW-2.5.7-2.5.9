public class MediaLibRunnerStatic {  
      public static void main(String[] args)
      {
        System.out.println(MediaLib.getOwner() + "'s Library");
        MediaLib.changeOwner("Sky");
        MediaLib.owner = "Nikhil";
        System.out.println(MediaLib.getNumEntries());

        MediaLib library1 = new MediaLib();
        MediaLib library2 = new MediaLib();
        Book book1 = new Book("Hunger Games", "Collins");
        Movie movie1 = new Movie("Pacific Rim", 2.1);
        Song song1 = new Song("Hello");
        library1.addBook(book1);
        library1.addSong(song1);
        library2.addMovie(movie1);
        library1.addMovie(movie1);
        System.out.println(MediaLib.getNumEntries());
        System.out.println(library1);
        

      }
    }
