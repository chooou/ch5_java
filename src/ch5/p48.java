package ch5;

public class p48 {
	public static void main(String[] args) {
		Car48 car481 = new Car48("1號車");
		car481.start();
		try {
			car481.join();
		}
		catch(InterruptedException e){
			
		}
		System.out.println("結束main()的處理工作");
	}
}

class Car48 extends Thread{
	private String name;
	public Car48(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}