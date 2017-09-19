
public class main {

    public static void main(String[] args) {
        maxSubarray(new int[]{1, 1});
    }

    public static void maxSubarray(int[] array){
        int answer = array[0], left = 0, right = 0, minus_pos = -1, sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if (sum > answer){
                answer = sum;
                left = minus_pos + 1;
                right = i;
            }

            if (sum < 0){
                sum = 0;
                minus_pos = i;
            }
        }
        System.out.println(left);
        System.out.println(right);
        System.out.println(answer); //Sum
    }
}
