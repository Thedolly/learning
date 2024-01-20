import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    public void seriesPrint() {

        int num1 = 0;
        int num2 = 1;

        /*System.out.print(num1 + " " + num2);

        for (i = 2; i < 10; i++) {
            int num3 = num1 + num2;
            num2 = num3;
            num1 = num2;
            System.out.print(" " + num3);
        }*/
        List<Integer> list = new ArrayList<>();
        int num3 = num1 + num2;
        list.add(num1);
        list.add(num2);
        while(num3<=1000){
            list.add(num3);
            num1 = num2;
            num2 = num3;
            num3=num1+num2;
        }
        System.out.print(" "+list);
        /*  System.out.print(" "+num3);*/
    }
}
