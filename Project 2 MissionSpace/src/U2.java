public class U2 extends Rocket {
    @Override
    public boolean launch() {
        if ((Math.random() - ((0.04 * getCurrentWeight()) / getMaxWeight())) > 0.1) return true;
        else return false;
    }

    @Override
    public boolean land() {
        if ((Math.random() - ((0.08 * getCurrentWeight()) / getMaxWeight())) > 0.1) return true;
        else return false;
    }

    /* default constructor for U1 rocket */
    U2(){
        setCurrentWeight(0);
        setMaxWeight(29*1000);
        setCost(120*1000000);
    }
}
