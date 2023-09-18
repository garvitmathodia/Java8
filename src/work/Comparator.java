package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
 public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(12);
	list.add(14);
	list.add(13);
	list.add(15);
	
    Collections.sort(list,(a,b)->b-a);
    
    System.out.println(list);
}
	
}
