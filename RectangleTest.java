/*
  让用户输入长方形的长和宽,
  求长方形的周长和面积
 */
import java.util.Scanner;

class Rectangle {
	//the member variables of class Rectangle are the length and the width
	private double length;
	private double width;

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	//create a method to calculate the perimeter
	public double perimeter() {
		return length + width;
	}
	//create a method to calculate the area
	public double area() {
		//因为两个数字的乘积有可能有很多小数,所以使用下面代码来保留两位小数
		double area = Math.round(length*width*100);
		double area1 = area/100;
		return area1;
	}
}

class RectangleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle a = new Rectangle();

		System.out.println("Input a number as length:");
		double length = sc.nextDouble();
		a.setLength(length);

		System.out.println("Input a number as width:");
		double width =sc.nextDouble();
		a.setWidth(width);
		System.out.println();

		System.out.println("Perimeter:" + a.perimeter());
		System.out.println("-------------------");
		System.out.println("Area(accurate to the second decimal place):" + a.area());
	}
}