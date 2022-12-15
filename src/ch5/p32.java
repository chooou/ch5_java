package ch5;

public class p32 {
	public static void main(String[] agrs)throws CarException32{
		Car32 car321 = new Car32();
		car321.setCar(1234,-10.0);
		car321.show();
	}
}
class CarException32 extends Exception{
	
}
class Car32{
	private int num;
	private double gas;
	public Car32() {
		num=0;
		gas=0.0;
		System.out.println("已生產了汽車");
	}
	public void setCar(int n,double g)throws CarException32{
		if(g<0) {
			CarException32 e = new CarException32();
			throw e;
		}else {
			num=n;
			gas=g;
			System.out.println("將車號設為"+num+"，汽油量設為"+gas);
		}
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}