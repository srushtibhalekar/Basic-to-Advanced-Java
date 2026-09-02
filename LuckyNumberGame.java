
import java.util.Random;
import java.util.Scanner;

public class LuckyNumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("================================");
        System.out.println("       🍀 LUCKY NUMBER GAME");
        System.out.println("================================");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int luckyNumber = random.nextInt(100) + 1;

        System.out.println();
        System.out.println("Hello " + name + "! 👋");
        System.out.println("Your Lucky Number is: " + luckyNumber);

        if (luckyNumber <= 20) {
            System.out.println("🌟 Today is a calm day!");
        } 
        else if (luckyNumber <= 40) {
            System.out.println("💪 Keep working hard!");
        } 
        else if (luckyNumber <= 60) {
            System.out.println("🚀 Good things are coming!");
        } 
        else if (luckyNumber <= 80) {
            System.out.println("🔥 You are on a lucky streak!");
        } 
        else {
            System.out.println("🏆 Super Lucky Day!");
        }

        System.out.println();
        System.out.println("================================");
        System.out.println("        Have a great day! 😊");
        System.out.println("================================");

        sc.close();
    }
}

