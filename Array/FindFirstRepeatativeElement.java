import java.util.*;
import java.util.stream.*;

public class FindFirstRepeatativeElement {
    public static void main(String[] args) {
        int[] arr={24,15,36,78,25,39,84,54,24,15,78};

        System.out.println(findFirstDuplicate(arr));
        System.out.println(findFirstDuplicateByHasSet(arr));
        System.out.println(findFirstDuplicateByHasMap(arr));
    }

	private static int findFirstDuplicateByHasMap(int[] arr) {
		Map<Integer, Integer> freq=new HashMap<>();

        for (int i : arr) {
            if(!freq.containsKey(i)){
                freq.put(i,1);
            }else{
                return i;
            }
        }

        return 0;
	}

	private static int findFirstDuplicateByHasSet(int[] arr) {
		Set<Integer> unique=new HashSet<>();

        for (int ele : arr) {
            if(!unique.add(ele)){
                return ele;
            }
        }
        
        return 0;
	}

	private static int findFirstDuplicate(int[] arr) {
		return Arrays.stream(arr)
        .boxed()
        .collect(Collectors.groupingBy(n->n, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(n->n.getValue()>1)
        .map(n->n.getKey())
        .findFirst()
        .orElse(0);
	}
}
