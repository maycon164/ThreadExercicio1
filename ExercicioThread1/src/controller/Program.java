
package controller;

public class Program {

	public static void main(String[] args) {
		for(int x = 0; x < 5; x++) {
			Thread t = new idThread();
			t.start();
		}

	}

}