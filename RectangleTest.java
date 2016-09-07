/*
  ���û����볤���εĳ��Ϳ�,
  �󳤷��ε��ܳ������
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
		//��Ϊ�������ֵĳ˻��п����кܶ�С��,����ʹ�����������������λС��
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