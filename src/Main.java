import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(longestEven("hey"));
        int[] nums = {31,15,7,3,2};
//        List <Integer> list = new ArrayList<Integer>();
//        list.add(31);
//        list.add(15);
//        list.add(7);
//        list.add(3);
//        list.add(2);


//        sortByBits(nums);
//        cardinalitySort(list);

//        int arr[] = {4, 5, 6} ;
//        int n = arr.length;
//        System.out.println("Sum of SubArray " +
//                SubArraySum(arr, n));

        maximumIndex(2,1);
    }
    public static String longestEven(String sentence){
        String longestWord="";
        String noSuccess="00";
        int count = 0;

        String array1[] = sentence.split(" ");
        for(int i=0;i< array1.length;i++){
            if(array1[i].length()%2==0 && array1[i].length()>longestWord.length()){
                longestWord = array1[i];
                count++;
            }
        }
        if(count==0){
            return noSuccess;
        }
        return longestWord;
    }
    public static int[] sortByBits(int[] arr) {
        Integer[] wrappedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(wrappedArr, (a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b));
        Arrays.stream(wrappedArr).mapToInt(Integer::intValue).toArray();

        for(int i=0;i< wrappedArr.length;i++){
            System.out.println(wrappedArr[i]);
        }
        return Arrays.stream(wrappedArr).mapToInt(Integer::intValue).toArray();
    }

    public static List<Integer> cardinalitySort(List<Integer> nums){
        Collections.sort(nums, (a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b));

        for(int i=0;i< nums.size();i++){
            System.out.println(nums.get(i));
        }
        return nums;
    }
    //given-array-integers-find-sum-elements-subarray
    public static long SubArraySum( int arr[] , int n )
    {
        long result = 0;

        // computing sum of subarray using formula
        for (int i=0; i<n; i++)
            result += (arr[i] * (i+1) * (n-i));

        // return all subarray sum
        return result ;
    }

    public static void maximumIndex(int N, int B)
    {
        int max_index = 0;

    // Calculate maximum possible
    // index that can be reached
        for (int i = 1; i <= N; i++)
        {
            max_index += i;
        }

        int current_index = max_index,
                step = N;

        while (true)
        {
            // Check if current index
            // and step both are greater
            // than 0 or not
            while (current_index > 0 &&
                    N > 0)
            {
                // Decrement current_index
                // by step
                current_index -= N;

                // Check if current index
                // is equal to B or not
                if (current_index == B)
                {
                    // Restore to previous
                    // index
                    current_index += N;
                }

                // Decrement step by one
                N--;
            }

            // If it reaches the 0th index
            if (current_index <= 0)
            {
                // Print result
                System.out.print(max_index + "\n");
                break;
            }

            // If max index fails to
            // reach the 0th index
            else
            {
                N = step;

                // Store max_index - 1 in
                // current index
                current_index = max_index - 1;

                // Decrement max index
                max_index--;

                // If current index is
                // equal to B
                if (current_index == B)
                {
                    current_index = max_index - 1;

                    // Decrement current index
                    max_index--;
                }
            }
        }
//        Hope for the best
    }
}