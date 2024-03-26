import java.util.*;
import java.util.Map.Entry;

public class BasicHashOperations {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,5,3,6,6,4,6,8,4,5,6,5,3};
        Map<Integer,Integer> frequencyMap = frequencyCounter(arr);
        System.out.println(frequencyMap.toString());

        List<Integer> maxFrequencyElements = maxFrequencyElements(arr);
        System.out.println(maxFrequencyElements.toString());
    }

    static Map<Integer,Integer> frequencyCounter(int[] arr){
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for (int n : arr){
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);
        }

        return frequencyMap;
    }

    static ArrayList<Integer> maxFrequencyElements(int[] arr){
        Map<Integer,Integer> frequencyMap = frequencyCounter(arr);
        int max = Collections.max(frequencyMap.values());
        ArrayList<Integer> res = new ArrayList<>();
        for (Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            if (entry.getValue() == max){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
