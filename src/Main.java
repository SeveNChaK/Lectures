import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, Integer> maxSubarray(int[] array) {
        int answer = 0, left = 0, right = 0, minus_pos = -1, sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum > answer) {
                answer = sum;
                left = minus_pos + 1;
                right = i;
            }

            if (sum < 0) {
                sum = 0;
                minus_pos = i;
            }
        }
        Map<String, Integer> result = new HashMap<>();
        if (answer != 0) {
            result.put("left", left);
            result.put("right", right);
        }
        return result;
    }
}
