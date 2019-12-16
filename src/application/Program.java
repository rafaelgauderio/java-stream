package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Integer> list = Arrays.asList(3, 5, 9, 6, 8, 15, 16, 42);

		Stream<Integer> stream01 = list.stream().map(func -> func * 15);
		System.out.println(Arrays.toString(stream01.toArray()));

		Stream<String> stream02 = Stream.of("Rafael", "Angela", "Marcelo", "Marcus");
		System.out.println(Arrays.toString(stream02.toArray()));

		Stream<Integer> stream03 = Stream.iterate(0, func -> func + 6);
		System.out.println(Arrays.toString(stream03.limit(810).toArray()));

		System.out.println();
		System.out.println("Arithmetic Progression ratio equal to 3");
		Stream<Integer> stream04 = Stream.iterate(0, x -> x + 3);
		System.out.println(Arrays.toString(stream04.limit(200).toArray()));

		System.out.println();
		System.out.println("Fibonacci Sequence");

		Stream<Long> stream05 = Stream.iterate(new Long[] { 0L, 1L }, x -> new Long[] { x[1], x[0] + x[1] })
				.map(x -> x[0]);
		System.out.println(Arrays.toString(stream05.limit(50).toArray()));

	}

}
