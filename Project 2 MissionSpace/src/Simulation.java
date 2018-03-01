import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    /* this method takes in a file name
    reads the file converts the items into Item objects and stores them into a
    ArrayList and return this list
     */
    public ArrayList<Item> loadItems(String fileName) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File(fileName));
        ArrayList<Item> items = new ArrayList<>();
        while (scanner.hasNextLine()){
            String array[] = ((scanner.nextLine()).split("="));
            items.add(new Item(array[0], Integer.parseInt(array[1])));
        }
        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> u1Rockets = new ArrayList<>();
        int objectCounter = 0;
        int objectInitiation = 0;
        U1 [] u1 = new U1[5];
        for (Item item : items) {
            if (objectInitiation == 0){
                u1[objectCounter] = new U1();
                objectInitiation++;
            }
            if (u1[objectCounter].canCarry(item)) {
                u1[objectCounter].carry(item);
            } else {
                u1Rockets.add(u1[objectCounter]);
                objectCounter++;
                u1[objectCounter] = new U1();
            }
        }
        return u1Rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> u2Rockets = new ArrayList<>();
        int objectCounter = 0;
        int objectInitiation = 0;
        U2 [] u2 = new U2[5];
        for (Item item : items) {
            if (objectInitiation == 0){
                u2[objectCounter] = new U2();
                objectInitiation++;
            }
            if (u2[objectCounter].canCarry(item)) {
                u2[objectCounter].carry(item);
            } else {
                u2Rockets.add(u2[objectCounter]);
                objectCounter++;
                u2[objectCounter] = new U2();
            }
        }
        return u2Rockets;
    }

    public int runSimulation(ArrayList<Rocket> rockets){
        int totalBudget = 0;
        for(int i=0; i<rockets.size(); i++){
            if (rockets.get(i).launch()){
                totalBudget += rockets.get(i).getCost();
                if(rockets.get(i).land()) continue;
                else rockets.add(rockets.get(i));
            }else{
                rockets.add(rockets.get(i));
            }
        }
        return totalBudget;
    }
}