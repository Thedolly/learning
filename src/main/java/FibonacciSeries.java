import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FibonacciSeries {

    public void seriesPrint() {

        int num1 = 0;
        int num2 = 1;

        List<Integer> list = new ArrayList<>();
        int num3 = num1 + num2;
        list.add(num1);
        list.add(num2);
        while (num3 <= 10000) {
            list.add(num3);
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
        System.out.println("febonacci series " + list);
        Random random = new Random();
        int index = random.nextInt(0, 17);
        System.out.println("random number from fibonacci series " + list.get(index));
        System.out.print("even number from fibonacci series  " + list.stream().filter(i -> (i % 2) == 0).collect(Collectors.toList()));


    }
}
