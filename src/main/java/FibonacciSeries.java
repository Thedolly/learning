import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FibonacciSeries {

    public void seriesPrint() {

        int num1 = 0;
        int num2 = 1;

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
        System.out.println();
        Random random = new Random();
        int index =random.nextInt(0,17);
        System.out.println(list.get(index));

    }
}
