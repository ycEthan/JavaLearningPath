/*
  这是一个猜数程序,
  计算机生成一个随机数,让用户键盘录入一个数,由计算机判断是否猜中.
  步骤:
       计算机生成一个随机数,范围在0~10之间
	   用户输入一个数,范围在0~10之间
	   计算机判断输入的数字:大了,小了,猜中
	   若大了或者小了,则让用户继续猜,直到猜到为止
*/
import java.util.Scanner;

class GuessNumber1to10 {
	public static void main(String[] args) {
		
		// 让计算机生成一个0~10之间的数字
		int generatenumber = (int)(Math.random()*10);
		
		System.out.println("这是一个猜数程序,请猜0到10的一个整数");
		System.out.println("----------------------------------");

		/*计算机判断用户输入的整数与生成整数的对比情况
		  先判断用户输入的数字是否符合规定
		  再判断是否与随机数相同
		  如果大了,输出"大了",让用户再猜,反之输出"小了",让用户猜
		  因为不知道用户猜几次才能猜对,所以使用while循环,如果猜对就break.
		  PS:for循环通常用于确定次数的循环
		*/
		while(true) {
			// 引导用户输入一个0~10之间的数字
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个0~10之间的整数:");
			int inputnumber = sc.nextInt();
			// 判断用户输入的数字是否合规
			if(inputnumber<0 || inputnumber>10) {
				System.out.println("你输入的数字不符合规定!请重新输入:");
			} else if(inputnumber == generatenumber) {
				System.out.println("恭喜你答对了!");
				break;
			} else if(inputnumber > generatenumber) {
				System.out.println("大了!");
			} else {
				System.out.println("小了");
			}
		}
	}
}