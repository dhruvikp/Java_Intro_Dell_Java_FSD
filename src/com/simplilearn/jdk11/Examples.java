package com.simplilearn.jdk11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Examples {

	public static void main(String[] args) throws IOException {

		// isBlank() on string
		String str1 = "";
		System.out.println(str1.isBlank());

		// lines() \n

		String str = "Hello\nSimplilearn!";
		System.out.println(str.lines().collect(Collectors.toList()));

		// strip()
		String str2 = "  Hello Simplilearn! ";
		System.out.println(str2.stripTrailing());

		// Files methods
		Files.writeString(Path.of("example.txt"), "Hello There!");
		System.out.println(Files.readString(Path.of("example.txt")));
		System.out.println(Files.isSameFile(Path.of("example.txt"), Path.of("example.txt")));

		// Pattern recognition methods
		var str5 = Pattern.compile("aba").asMatchPredicate();
		System.out.println(str5.test("aaba"));
		System.out.println(str5.test("aba"));

		// Time unit conversion
		TimeUnit timeUnit = TimeUnit.DAYS;
		System.out.println(timeUnit.convert(Duration.ofHours(48)));

		// Collection to Array
		List<String> sampleList = Arrays.asList("Java", "Kotlin", "Python");

		String[] sampleArray = sampleList.toArray(String[]::new);

		System.out.println(Outer.class.isNestmateOf(Outer.Inner.class));

		Set<String> nestMembers = Arrays.stream(Outer.Inner.class.getNestMembers()).map(Class::getName)
				.collect(Collectors.toSet());

		System.out.println(nestMembers);

		Optional opt = Optional.empty();

		System.out.println(opt.isEmpty());

		Optional opt1 = Optional.of("Simplilearn");
		System.out.println(opt1.isEmpty());
		System.out.println(opt1.isPresent());

		// lambda expressions
		// var keyword inside your lambda
		IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter((var i) -> i % 2 == 0).forEach(System.out::print);

		// Generics
	}

}

class Outer {

	private void test() {

	}

	class Inner {

		void inner() {
			test();
		}
	}
}
