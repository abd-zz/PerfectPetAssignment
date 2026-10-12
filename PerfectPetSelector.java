import java.util.Scanner;

public class PerfectPetSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WHAT COLOR DO YOU LIKE? Say red or blue...(or green)");
        String colorFavorite = scanner.nextLine();
        while(!checkString(colorFavorite, "red") && !checkString(colorFavorite, "blue") && !checkString(colorFavorite, "green")) {
            System.out.println("That is not an option. Choose again");
            colorFavorite = scanner.nextLine();
        }
        System.out.println("What is your favorite season?");
        String seasonFavorite = scanner.nextLine();
        while(!checkString(seasonFavorite, "winter") && !checkString(seasonFavorite, "summer") && !checkString(seasonFavorite, "fall") && !checkString(seasonFavorite, "fall")) {
            System.out.println("That is not an option. Choose again (refer to autumn as fall)");
            seasonFavorite = scanner.nextLine();
        }
        System.out.println("NOW...YOUR OWN NAME");
        String name = scanner.nextLine();
        while(name.length() == 0 || "qwertyuiopasdfghjklzxcvbnm".indexOf(name.toLowerCase().substring(0,1)) == -1) {
            System.out.println("Your name starts with a letter. MAYBE SOMEDAY YOU WILL LEARN HOW TO SPELL YOUR OWN NAME (try again)");
        name = scanner.nextLine();
        }
        if (colorFavorite.toLowerCase().equals("red")) {
            if("aeiouAEIOU".indexOf(name.substring(0, 1)) != -1) {
            System.out.println("You got a PANDA!");
            } else {
                System.out.println("You got a PORCUPINE");
            }
        } else if(colorFavorite.toLowerCase().equals("green")) {
            if (checkString(seasonFavorite, "winter") && "aeiouAEIOU".indexOf(name.substring(0, 1)) == -1) {
                System.out.println("You got a GIRAFFE!");
            } else if (!checkString(seasonFavorite, "fall")) {
                System.out.println("You got a DOG!");
            } else {
            System.out.println("You got a ROCK!");
        }
        } else if(colorFavorite.toLowerCase().equals("blue")) {
            if (checkString(seasonFavorite, "fall")) {
                System.out.println("You got a ALLIGATOR!");
            } else if (checkString(seasonFavorite, "spring")) {
                System.out.println("You got a OSTRITCH!");
            } else if (!checkString(seasonFavorite, "summer") && "aeiouAEIOU".indexOf(name.substring(0, 1)) == -1 ) {
                System.out.println("You got a AXOLOTL!");
            } else {
            System.out.println("You got a ROCK!");
        }
        } else {
            System.out.println("You got a ROCK!");
        }
        scanner.close();
    }
    public static boolean checkString(String check, String against) {
        return check.toLowerCase().equals(against.toLowerCase());
    }
}