package ch5;

public class p45 {
	public static void main(String[] args) {
		Car45 car451 = new Car45("1號車");
		car451.start();
		Car45 car452 = new Car45("2號車");
		car452.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car45 extends Thread{
	private String name;
	public Car45(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
			
		}
	}
}