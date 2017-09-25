import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MainTest {
    @org.junit.Test
    public void maxSubarray() throws Exception {
        Map<String, Integer> test1 = new HashMap<>();
            test1.put("left", 3);
            test1.put("right", 4);
        assertEquals(test1, Main.maxSubarray(new int[]{-1, 1, -5, 1, 1}));
        Map<String, Integer> test2 = new HashMap<>();
            test2.put("left", 0);
            test2.put("right", 2);
        assertEquals(test2, Main.maxSubarray(new int[]{10, 15, 11, -50, -10, -100, 23}));
        Map<String, Integer> test3 = new HashMap<>();
        assertEquals(test3, Main.maxSubarray(new int[]{-10, -15, -11, -50, -10, -100, -23}));
    }

}