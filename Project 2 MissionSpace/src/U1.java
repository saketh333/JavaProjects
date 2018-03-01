public class U1 extends Rocket {
    @Override
    public boolean launch() {
       if ((Math.random() - ((0.05 * getCurrentWeight()) / getMaxWeight())) > 0.1) return true;
       else return false;
    }

    @Override
    public boolean land() {
        if ((Math.random() - ((0.01 * getCurrentWeight()) / getMaxWeight())) > 0.1) return true;
        else return false;
    }

    /* default constructor for U1 rocket */
    U1(){
        setCurrentWeight(0);
        setMaxWeight(18*1000);
        setCost(60*1000000);
    }
}
