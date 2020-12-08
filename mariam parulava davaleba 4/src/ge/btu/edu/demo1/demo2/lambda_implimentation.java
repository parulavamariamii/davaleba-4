package ge.btu.edu.demo1.demo2;

public class lambda_implimentation {
    public static void main(String[] args) {
        sumable sumable = (x,y) -> x + y;
        System.out.println(sumable.sum(3,45));
    }
}


