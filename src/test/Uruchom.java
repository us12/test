package test;

public class Uruchom {

	public static void main(String[] args) {
		Tests tests = new Tests();
		(new Thread(tests)).start();
	}
}
