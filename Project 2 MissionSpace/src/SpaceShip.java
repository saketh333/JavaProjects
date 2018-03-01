/**
 * Structure of the spaceship
 */

public interface SpaceShip {

    // checks the probability of spaceShip launching successfully
    public boolean launch();

    // similar to launch
    public boolean land();

    // checks if spaceShip can carry the item
    public boolean canCarry(Item item);

    // adds the item to the spaceship
    public void carry(Item item);
}
