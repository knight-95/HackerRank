import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(longestEven("hey"));
        int[] nums = {31,15,7,3,2};
        List <Integer> list = new ArrayList<Integer>();
        list.add(31);
        list.add(15);
        list.add(7);
        list.add(3);
        list.add(2);


//        sortByBits(nums);
        cardinalitySort(list);
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
}