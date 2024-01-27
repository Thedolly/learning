package searching;

public class LinearSearchTest {


    public static int linearSearch() {

        int[] arr = {50, 40, 50, 20, 19};

        int key = 19;

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

}