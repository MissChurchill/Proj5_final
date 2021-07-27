
public class Television extends ServiceCommunicator {
    public Television(String tvShowTitle) {
    super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowTitle);

    }

    public static void main(String[] args)  {
        System.out.println(new Television("Martin").get());
    }
}
