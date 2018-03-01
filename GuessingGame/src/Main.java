import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        // generating a random number [0 - 100]
        int randomNumber = (int) (Math.random()*100);

        // creating a scanner object
        Scanner scanner = new Scanner(System.in);

        // instructions
        System.out.println("I will choose a Number randomly between 1 - 100");
        System.out.println("Try to guess it.");

        for(int i = 10; i > 0; i--){

            System.out.println("you Currently have " + i + " guess(es) left choose again:");

            // taking user input
            int guess = scanner.nextInt();

            if (guess > randomNumber){
                System.out.println("It's smaller than: " + guess + " try again.");
            }else if (guess < randomNumber){
                System.out.println("It's bigger than: " + guess + " try again.");
            } else{
                System.out.println("You Win! " + guess);
                break;
            }
        }
    }
}
