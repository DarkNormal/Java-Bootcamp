package project_euler;

public class Runner {

    public static void main(String[] args) {
        MultiplesOf multiplesOf3And5 = new MultiplesOf();
        multiplesOf3And5.getMultiples(3,5, 10);
        System.out.println(multiplesOf3And5.getSumOfMultiples());
    }
}
