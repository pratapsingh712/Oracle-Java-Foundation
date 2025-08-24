package inheritance;

public class AdvanceCalculator extends Calculator{

    public int getMul(int n1, int n2){
        return n1*n2;
    }

    public double getDiv(int n1, int n2){
        return (double) (n1/(double)n2);
    }
}
