public class Rocket implements SpaceShip {
    private int currentWeight;
    private int maxWeight;
    private int cost;

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getCost() {
        return cost;
    }

    public boolean launch(){
        return true;
    }

    public boolean land(){
        return true;
    }

    public final boolean canCarry(Item item){
        return ((getCurrentWeight() + item.getWeight()) <= (getMaxWeight()));
    }

    public final void carry(Item item){
        setCurrentWeight(getCurrentWeight() + item.getWeight());
    }

}