package ch5;

public class p50 {
	public static void main(String[] agrs) {
		Car50 car501 = new Car50("1號車");
		Thread th1 = new Thread(car501);
		th1.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car50 implements Runnable{
	private String name;
	public Car50(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理");
		}
	}
}