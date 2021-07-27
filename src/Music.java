
public class Music extends ServiceCommunicator {

    public Music(String songTitleOrArtistName) {
        super("https://itunes.apple.com/search?term=" + songTitleOrArtistName + "&limit=1");
    }

    public static void main(String[] args)  {
        System.out.println(new Music("Thriller").get());
        }
    }