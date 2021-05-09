package tw.archerwn.firstApp.model;

public class Calculator {

    private int sum;

    public Calculator() {sum=0;}

    public int getSum() {
        return sum;
    }

    public void add() {
        this.sum++;
    }

    public void min() {
        this.sum--;
    }
}
