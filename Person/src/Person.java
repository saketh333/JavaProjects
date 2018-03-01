public class Person {

    int localCount;
    static int globalCount;

    Person(){
        this.localCount++;
        this.globalCount++;
    }
}
