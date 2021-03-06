package cn.zhou.work3;

public class Example3 {
		
	public static void main(String[] args) {
		Square square = new Square();
		System.out.println("area="+square.area(2));
		
		Circle circle = new  Circle();
		System.out.println("area="+circle.area(3));
	}
}


interface Shape{
	public double area(double x);
}


//求正方形的面積
class Square implements Shape{

	@Override
	public double area(double x) {
		
		return x*x;
	}
	
}

//求圓形的面積
class Circle implements Shape{

	@Override
	public double area(double x) {
		return x*x*3.14;
	}
	
}