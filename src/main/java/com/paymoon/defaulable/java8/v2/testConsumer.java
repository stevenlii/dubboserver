package com.paymoon.defaulable.java8.v2;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class testConsumer {
	/**
	 * @param args
	 * https://my.oschina.net/u/576554/blog/535010
	 */
	public static void main(String[] args) {

		testCustomLamda();

	}

	public static void testPredicate() {
		Predicate<String> predicate = (x) -> x.length() > 0;
		System.out.println(predicate.test("String"));
	}

	public void testConsumer() {
		Consumer<String> consumer1 = (x) -> System.out.print(x);
		Consumer<String> consumer2 = (x) -> {
			System.out.println(" after consumer 1");
		};
		consumer1.andThen(consumer2).accept("test consumer1");
	}

	public static void testCustomLamda() {
		Consumer<String> consumer = (x) -> {
			System.out.println("test" + x);
		};
		CustomLamda<String> customLamda = (x) -> {
			x.accept("6");
			return "6";
		};
		customLamda.testCustomFunction(consumer);
	}
}
