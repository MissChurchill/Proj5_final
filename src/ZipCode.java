
public class ZipCode extends ServiceCommunicator {
    public ZipCode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);
    }
    public static void main(String[] args)  {
        System.out.println((new ZipCode("90210").get()));
    }

}
