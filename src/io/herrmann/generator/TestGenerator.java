package io.herrmann.generator;

public class TestGenerator {

	public static void main(String args[]) {
	
		Generator<Integer> simpleGenerator = new Generator<Integer>() {
		    public void run() throws InterruptedException {
		        yield(1);
		        // Some logic here...
		        yield(2);
		    }
		};
		for (Integer element : simpleGenerator)
		    System.out.println(element);
		// Prints "1", then "2".
		
		System.out.println("test");
	}
}
