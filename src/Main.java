
public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;
        int c = 3;
        int d = 9;
        int sum1 = a+b;
        int sum2 = c+d;
        boolean result1 = sum1 > sum2;
        System.out.println(result1);
        int increase = ++sum1;
        int decrease = sum2 - 2;
        boolean result2 = increase > decrease;
        System.out.println(result2);
        boolean result3 = (increase %2 == 0) || (decrease %2 == 0);
        System.out.println(result3);



    }

}