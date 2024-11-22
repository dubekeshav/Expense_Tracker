import java.util.Map;

public class TestPattern {

    public static void main(String[] args) {

        // int j = 0;
        // int i = 3, k = 3;
        // while (j < 4) {

        //     System.out.println(i + " " + k);
        //     while (i >= 0) {
        //         System.out.print(" ");
        //         i--;
        //     }
        //     while (4-k > 0) {
        //         System.out.print("*");
        //         k++;
        //     }
        //     System.out.println();
        //     j++;
        //     i--;
        //     k--;
        // }

        Map<Integer, Integer> map = new HashMap<>() {
        {
                put(1, 6);
                put(2, 4);
                put(3, 5);
            }
        };


}
}
