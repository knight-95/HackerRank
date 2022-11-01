import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestEven("hey"));
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
    public int[] sortByBits(int[] arr) {
        Integer[] wrappedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(wrappedArr, (a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b));
        return Arrays.stream(wrappedArr).mapToInt(Integer::intValue).toArray();
    }
}