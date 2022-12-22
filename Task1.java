import java.util.Arrays;
import java.util.HashSet;
public class Task1 {
    public static void main (String[] args) {
        int[] arrayOfInts = InitArray();
        String arrayToString = Arrays.toString(arrayOfInts);
        System.out.println(arrayToString);
        double percent = GetPercentUniqueValues(arrayOfInts);
        System.out.println(percent);
    }
    public static int[] InitArray(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 25));
        }
        return array;
    }
    public static double GetPercentUniqueValues(int[] array){
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        for (var arrValue: array) {
            myHashSet.add(arrValue);
        }
        int uniquesCount = 0;
        for (var hashSetValue: myHashSet) {
            int currentElementCount = 0;

            for (var arrValue: array) {
                if (hashSetValue == arrValue) {
                    currentElementCount += 1;
                }
            }

            if (currentElementCount == 1) uniquesCount +=1;
        }
        double percent = uniquesCount * 100 / array.length;
        return percent;
    }
}

