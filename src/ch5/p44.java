package ch5;

public class p44 {
	public static void main(String[] args) {
		Car44 car441 = new Car44("1號車");
		car441.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}
class Car44 extends Thread{
	private String name;
	public Car44(String nm) {
		name =nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}