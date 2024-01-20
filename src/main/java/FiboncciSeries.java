public class FiboncciSeries {

    public void seriesPrint() {

        int num1 = 0;
        int num2 = 1;
        int i;

        System.out.print(num1 + " " + num2);

        for (i = 2; i < 10; i++) {
            int num3 = num1 + num2;
            num2 = num3;
            num1 = num2;
            System.out.print(" " + num3);
        }
    }
}
