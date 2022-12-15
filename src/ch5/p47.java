package ch5;

public class p47 {
	public static void main(String[] agrs) {
		Car47 car471 = new Car47("1號車");
		car471.start();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("正在執行main()的處理工作");
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}

class Car47 extends Thread{
	private String name;
	public Car47(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}