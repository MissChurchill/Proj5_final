
public class Wiki extends ServiceCommunicator {
    public static void main(String[] args)  {
        System.out.println(new Wiki("Muhammad_Ali").get());
    }

    Wiki(String search) {
        super("https://en.wikipedia.org/w/api.php?action=query&list=search&srsearch=" + search + "&format=json");

    }
}