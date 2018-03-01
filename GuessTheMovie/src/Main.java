import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

import static java.lang.System.*;

public class Main {

    public static void main(String [] args) {

        // check to see if the file is present or not
        try {
            Scanner scanner = new Scanner(new File("movies.txt"));
            ArrayList<String> moviesList = new ArrayList<String>();

            while(scanner.hasNextLine()){
                moviesList.add(scanner.nextLine());
            }

            // selecting a random movie from movies list
            String randomMovie = moviesList.get((int) (Math.random()*(moviesList.size() - 1)));
            char [] randomMovies = randomMovie.toCharArray();

            //out.println(randomMovie);
            out.println("In this Game you will be guessing a Movie\nthat I will pick randomly:");
            // displaying _ for the length of movie title

            String output = "";
            for (int i =0; i < randomMovies.length; i++){
                if (randomMovies[i]==' ') {
                  output += " ";
                  continue;
                }
                output += "_";
            }
            System.out.println(output);


            int points = 10;

            while (points > 0){
                out.println("You currently have " + points + " points");
                out.println("Enter a Character:");

                Scanner userInput = new Scanner(System.in);
                String input = userInput.next();

                if(randomMovie.contains(input)) {
                    int index = randomMovie.indexOf(input);
                    while (index >= 0 && index <= randomMovie.length()) {
                        output = output.substring(0,index) + input + output.substring(index+1);
                        index = randomMovie.indexOf(input, index + 1);
                    }
                    System.out.println(output);
                }else{
                    System.out.println("You are incorrect");
                    System.out.println(output);
                    points--;
                }
                if (output.equals(randomMovie)){
                    out.println("you Win");
                    out.println(randomMovie);
                    break;
                }

            }
            if (points == 0) {
                out.println("Better luck next time");
            }

            //out.println(randomMovie.length());
        }catch (FileNotFoundException e) {
            out.println("File Not Found");
        }
    }
}