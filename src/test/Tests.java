package test;

public class Tests implements Runnable{
	int val = 0;
	public void run() {
		synchronized (this) {
			val = val + 1;
		}
		System.out.println(val);
	}
}
