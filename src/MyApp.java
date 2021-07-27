import java.util.Scanner;


public class MyApp {
    public static void main(String[] args) {
        String request;
        while (true) {
            request = getRequest("");        // System.in
            if (validateRequest(request)) {
                doRequest(request);
            } else {
                displayError();
            }
        }
    }
    public static String getRequest(String request) {
        System.out.println("Tell us your request, what would you like to search for zip code, music, tv show, or wiki information?");
        System.out.print("Command> ");
        Scanner input = new Scanner(System.in);
        request = input.next();
        System.out.println("Your request was for " + request);
        return request.toLowerCase();
    }
    public static boolean validateRequest(String request) {
        if (request == "zip code" || request.equalsIgnoreCase("zip")) {
            return true;
        } else if (request.equalsIgnoreCase("music") || request.equalsIgnoreCase("song")) {
            return true;
        } else if (request.equalsIgnoreCase("tv show")
                || request.equalsIgnoreCase("television")
                || request.equalsIgnoreCase("tv")
                || request.equalsIgnoreCase("show")) {
            return true;
        } else if (request.equalsIgnoreCase("wiki") || request.equalsIgnoreCase("search")) {
            return true;
        }
        else if (request.equalsIgnoreCase("quit") || (request.equalsIgnoreCase("end")
                || request.equalsIgnoreCase("exit"))) {
            System.out.println("Thank you for using the Search Tool!");
            System.exit(1);
            return true;
        }
        else  if (request.equalsIgnoreCase("help")) {
            System.out.println("Please type in your command selection of zip code or zip, music or song, tv show or television, wiki or search, or quit/exit/end to end program. " +
                    "\n After the command is entered, you will be prompted to enter the exact search term. If the term is more than one word dashes may be needed to return the requested information.");
            return true;
        }
        else return false;
    }
    public static void doRequest(String request)  {
        if (request.equalsIgnoreCase("zip code") || request.equalsIgnoreCase("zip")) {
            System.out.println("Enter zip code");
            Scanner userinput = new Scanner(System.in);
            String input = userinput.next();
            ZipCode zip = new ZipCode(input);
            zip.get();
            //return json city and state values
        } else if (request.equalsIgnoreCase("music") || request.equalsIgnoreCase("song")) {
            System.out.println("Enter name of song");
            Scanner userinput = new Scanner(System.in);
            String input = userinput.next().replaceAll("\\s", "-");
            //code to replace spaces with dashes for all: String replaceString = userInput.replaceAll("\\s", "-")
            Music song = new Music(input);
            song.get();
            //return json key values for song name, artist name, release date, genre, link to the song
        } else if (request.equalsIgnoreCase("tv show") || request.equalsIgnoreCase("television")
                || request.equalsIgnoreCase("tv") || request.equalsIgnoreCase("show")) {
            System.out.println("Enter name of tv show");
            Scanner userinput = new Scanner(System.in);
            String input = userinput.next().replaceAll("\\s", "-");;
            Television tv = new Television(input);
            tv.get();
            //return json key values to be show title, premiere date, # of seasons, is still running, category, stars of the show, network
        } else if (request.equalsIgnoreCase("wiki") || request.equalsIgnoreCase("search")) {
            System.out.println("Enter wiki search topic");
            Scanner userinput = new Scanner(System.in);
            String input = userinput.next().replaceAll("\\s", "-");;
            Wiki wiki = new Wiki(input);
            wiki.get();
            //return json key value wiki link
        }
    }
    public static void displayError() {
        System.out.println("Info is not a valid command. Please try again.");
    }
        }

