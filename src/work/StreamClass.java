package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {
	
	public static void main(String[] args) {
//		int arr[] = {1,2,3,4,5,6};
//		int sum1 = Arrays.stream(arr).filter(n->n%2==0).sum();
//		System.out.println(sum1);
//		
//		List<Integer> list = Arrays.asList(1,2,3,4);
//		Stream stream = list.stream();
//		
		Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(100);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,12,334,455,0,2,4,6,4);
		
		List<Integer> filteredList = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(filteredList);
		
		List<Integer> mappedList = filteredList.stream().map(x->x/2).distinct().collect(Collectors.toList());
		System.out.println(mappedList);
		
		List<Integer> sorted = mappedList.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		
	}
	
	 

}
