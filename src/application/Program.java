package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Integer> list = Arrays.asList(3, 5, 9, 6, 8, 15, 16, 42);
		
		System.out.println("Print de original stream");
		Stream<Integer> stream = list.stream();
		System.out.println(Arrays.toString(stream.toArray()));
		
		System.out.println("\nMultiply stream by 20");
		Stream<Integer> stream01 = list.stream().map(func -> func * 20);
		System.out.println(Arrays.toString(stream01.toArray()));

		
		Stream<String> stream02 = Stream.of("Rafael", "Angela", "Marcelo", "Marcus");
		System.out.println("\nStream of Strings:  " + Arrays.toString(stream02.toArray()));
	
		System.out.println("\nStream using iteration function");
		// first element, lambda function that generation the other elements, limit(define the limit of elements)
		Stream<Integer> stream03 = Stream.iterate(0, func -> func + 6);
		System.out.println(Arrays.toString(stream03.limit(50).toArray()));

		
		System.out.println("\nArithmetic Progression ratio equal to 3");
		Stream<Integer> stream04 = Stream.iterate(3, x -> x + 3);
		System.out.println(Arrays.toString(stream04.limit(50).toArray()));

	
		System.out.println("\nFibonacci Sequence");
		Stream<Long> streamFibonacci = Stream.iterate(new Long[] { 0L, 1L }, x -> new Long[] { x[1], x[0] + x[1] })
				.map(x -> x[0]);
		System.out.println(Arrays.toString(streamFibonacci.limit(50).toArray()));

	}

}
