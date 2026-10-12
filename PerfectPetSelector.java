import java.util.Scanner;

public class PerfectPetSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WHAT COLOR DO YOU LIKE? Say red or blue...(or green)");
        String colorFavorite = scanner.nextLine();
        System.out.println("What is your favorite season?");
        String seasonFavorite = scanner.nextLine();
        System.out.println("NOW...YOUR OWN NAME");
        String name = scanner.nextLine();
        if (colorFavorite != null && colorFavorite.toLowerCase().equals("red")) {
            if(colorFavorite.equals("[aeiouAEIOU]") == false) {
            System.out.println("You get a PANDA");
            }
        }
        
        scanner.close();
    }
}