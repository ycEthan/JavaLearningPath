/*
  ����һ����������,
  ���������һ�������,���û�����¼��һ����,�ɼ�����ж��Ƿ����.
  ����:
       ���������һ�������,��Χ��0~10֮��
	   �û�����һ����,��Χ��0~10֮��
	   ������ж����������:����,С��,����
	   �����˻���С��,�����û�������,ֱ���µ�Ϊֹ
*/
import java.util.Scanner;

class GuessNumber1to10 {
	public static void main(String[] args) {
		
		// �ü��������һ��0~10֮�������
		int generatenumber = (int)(Math.random()*10);
		
		System.out.println("����һ����������,���0��10��һ������");
		System.out.println("----------------------------------");

		/*������ж��û���������������������ĶԱ����
		  ���ж��û�����������Ƿ���Ϲ涨
		  ���ж��Ƿ����������ͬ
		  �������,���"����",���û��ٲ�,��֮���"С��",���û���
		  ��Ϊ��֪���û��¼��β��ܲ¶�,����ʹ��whileѭ��,����¶Ծ�break.
		  PS:forѭ��ͨ������ȷ��������ѭ��
		*/
		while(true) {
			// �����û�����һ��0~10֮�������
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ��0~10֮�������:");
			int inputnumber = sc.nextInt();
			// �ж��û�����������Ƿ�Ϲ�
			if(inputnumber<0 || inputnumber>10) {
				System.out.println("����������ֲ����Ϲ涨!����������:");
			} else if(inputnumber == generatenumber) {
				System.out.println("��ϲ������!");
				break;
			} else if(inputnumber > generatenumber) {
				System.out.println("����!");
			} else {
				System.out.println("С��");
			}
		}
	}
}