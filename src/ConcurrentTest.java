import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentTest {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new Vector<>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(100);
		list.add(150);
		
		for (Integer value : list) {
			System.out.println(value);
		//	list.add(5000);
		}
		
		System.out.println(list);
		
	}

}
