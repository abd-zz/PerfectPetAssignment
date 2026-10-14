import java.util.*;
//Abdoul-Aziz Diagne
//10/13/2026
//program will evaluate user input and output a corresponding pet based on this
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
        while(!checkString(seasonFavorite, "winter") && !checkString(seasonFavorite, "summer") && !checkString(seasonFavorite, "fall") && !checkString(seasonFavorite, "spring")) {
            System.out.println("That is not an option. Choose again (refer to autumn as fall)");
            seasonFavorite = scanner.nextLine();
        }
        System.out.println("NOW...YOUR OWN NAME");
        String name = scanner.nextLine();
        while(name.length() == 0 || "qwertyuiopasdfghjklzxcvbnm".indexOf(name.toLowerCase().substring(0,1)) == -1) {
            System.out.println("Your name starts with a letter. MAYBE SOMEDAY YOU WILL LEARN HOW TO SPELL YOUR OWN NAME (try again)");
        name = scanner.nextLine();
        }
        switch(colorFavorite.toLowerCase()) {
            case "red":
            if ("aeiouAEIOU".indexOf(name.substring(0,1)) != -1) {
                System.out.println("You got a PORCUPINE!");
                break;
            } else {
                System.out.println("You got a PANDA!");
                break;
            }
            case "blue":
                if (checkString(seasonFavorite, "fall")) {
                    System.out.println("You got an ALLIGATOR!");
                    break;
                } else if (checkString(seasonFavorite, "spring")) {
                    System.out.println("You got an OSTRITCH!");
                    break;
                } else if (!checkString(seasonFavorite, "summer") && "aeiouAEIOU".indexOf(name.substring(0,1)) == -1) {
                    System.out.println("You got an AXOLOTL!");
                    break;
                }
            case "green":
                if ("aeiouAEIOU".indexOf(name.substring(0,1)) == -1 && checkString(seasonFavorite, "winter")) {
                    System.out.println("You got a GIRAFFE!");
                    break;
                } else if (!checkString(seasonFavorite, "fall") && checkString(colorFavorite, "green")) {
                    System.out.println("You got a DOG!");
                    break;
                }
            default:
                if(checkString(seasonFavorite, "summer")) {
                    System.out.println("You got a PONY!");
                } else {
                System.out.println("You got a ROCK!");
                }
        }
        scanner.close();
    }
    public static boolean checkString(String check, String against) {
        return check.toLowerCase().equals(against.toLowerCase());
    }
}