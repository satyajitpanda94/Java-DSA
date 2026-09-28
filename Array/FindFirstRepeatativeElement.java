import java.util.Arrays;
import java.util.stream.*;

public class FindFirstRepeatativeElement {
    public static void main(String[] args) {
        int[] arr={24,15,36,78,25,39,84,54,24,15,78};

        System.out.println(findFirstDuplicate(arr));
    }

	private static int findFirstDuplicate(int[] arr) {
		return Arrays.stream(arr)
        .boxed()
        .collect(Collectors.groupingBy(n->n, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(n->n.getValue()>1)
        .mapToInt(n->n.getKey())
        .findFirst()
        .orElse(0);
	}
}
