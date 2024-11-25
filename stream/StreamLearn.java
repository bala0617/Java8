package stream;

//import java.util.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

    

public class StreamLearn {
//	public int add(int a, int b) {
//        return a + b;
//    }

	public static void main(String[] args) {
		
//		int[] b = {10,2,3,4};
//		System.out.println(b.length);
		
//		int[] b = {10,2,3,4};
//		System.out.println(Arrays.stream(b).count());
//		
		
		//Sorting using Stream:
		int[] ar = { 10, 3, 4, 5 };
		IntStream s = Arrays.stream(ar);
		s=s.filter(null);
		s.forEach(no -> System.out.println(no));
//		
//		StreamLearn calc = new StreamLearn();
//		int result = calc.add( 5,4); // Set a breakpoint here
//        System.out.println("Result: " + result);
		
		
	}
}