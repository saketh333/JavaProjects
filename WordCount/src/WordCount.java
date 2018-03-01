import java.util.Scanner;
import java.io.File;

public class WordCount {
    public static void main(String [] args) throws Exception{
        File file = new File("this.txt");
        Scanner scanner = new Scanner(file);

        int wordsCount = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            wordsCount += line.split(" ").length;
        }
        System.out.println("This file has: " + wordsCount);
    }
}
