/**
 * this class allows to create an item
 * with its name and weight
 */

public class Item {

    private String name;
    private int weight;

    // default constructor takes the name and weight of the item
    Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

}
