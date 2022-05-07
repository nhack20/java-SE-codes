public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public int multiple(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
    public double square(double a) {
        return a * a;
    }
    public int added(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }
}
