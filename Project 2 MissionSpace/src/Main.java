import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Simulating U1 & U2 rocket with Phase-1 and Phase-2 items
        Simulation simulation1 = new Simulation();

        // reading items from file
        ArrayList<Item> itemsPhase1 = simulation1.loadItems("phase-1.txt");
        ArrayList<Item> itemsPhase2 = simulation1.loadItems("phase-2.txt");
        itemsPhase1.addAll(itemsPhase2);

        // loading items onto rocket U1
        ArrayList<Rocket> loadingU1 = simulation1.loadU1(itemsPhase1);

        System.out.println("Total Budget for launching U1 rocket with Phase-1 & Phase -2 items:" +
                "\n" + (simulation1.runSimulation(loadingU1)) + "$");

        // loading items onto rocket U1
        ArrayList<Rocket> loadingU2 = simulation1.loadU2(itemsPhase1);

        System.out.println("Total Budget for launching U1 rocket with Phase-1 & Phase -2 items:" +
                "\n" + (simulation1.runSimulation(loadingU2)) + "$");

    }
}