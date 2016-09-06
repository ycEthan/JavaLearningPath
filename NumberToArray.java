import java.util.Scanner;

public class NumberToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number within 6~8 digits:");
		CheckAndChange turn = new CheckAndChange();
		int number = sc.nextInt();
		turn.check(number);
		turn.change(number);
	}
}
class CheckAndChange {
	//判断输入的数字是否合规的方法
	public void check(int number) {
		String digits = Integer.toString(number);
		int numberlength = digits.length();
		if(numberlength < 6 || numberlength > 8) {
			System.out.println("Error!");
			System.exit(0);
		}
	}
//将数字转换为数组并输出的方法;
	public void change(int number) {
		String digits = Integer.toString(number);
		int numberlength = digits.length();
		int[] arr = new int[numberlength];
		for(int x = 0 ; x < arr.length; x++ , number/=10) {
			if(number > 0) {
				arr[arr.length-(x+1)] = number%10;
			}
		}
		System.out.print( "[" );
		for(int y = 0 ; y < arr.length ; y++) {
			if(y == arr.length-1) {
				System.out.print(arr[y] + "]");
			} else {
				System.out.print(arr[y] + ",");
			}
		}
	}
}