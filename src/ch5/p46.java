package ch5;

public class p46 {
	public static void main(String[] agrs) {
		Car46 car461 = new Car46("1號車");
		car461.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進尋main()的處理工作");
		}
	}
}

class Car46 extends Thread{
	private String name;
	public Car46(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep(1000);
				System.out.println("正在進行"+name+"的處理工作");
			}
			catch(InterruptedException e) {
			}
		}
	}
}