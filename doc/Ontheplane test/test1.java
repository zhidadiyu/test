
// 编写一个计算器程序：通过键盘输入，获取两待计算的数据，
// 再通过键盘输入+-*/,来进行相应计算，并返回结果值输出到控制台。
// 若键盘输入了 q,则退出程序。
import java.util.*;
public class test1{
	public static void main(String[] args) {
		while (true) {
		System.out.println("请输入第一个数字：");
		Scanner a = new Scanner(System.in);
		int a1 = a.nextInt();
		System.out.println("请输入+-*/");
		Scanner b = new Scanner(System.in);
		String b1 = b.next();
		char b2 = b1.charAt(0);
		System.out.println("请输入第二个数字*/");
		Scanner c = new Scanner(System.in);
		int c2 = c.nextInt();
		
		if (b2 == '+') {
			int A=a1+c2;
			System.out.println("您的计算结果为"+A);
			continue;
		}else if (b2 == '-') {
			int B=a1-c2;
			System.out.println("您的计算结果为"+B);
			continue;
		}else if (b2 == '*') {
			int C=a1*c2;
			System.out.println("您的计算结果为"+C);
			continue;
		}else if(b2 == '/'){
			int D=a1/c2;
			System.out.println("您的计算结果为"+D);
			continue;
		}else if (b2 == 'q') {
			break;
		}
}
}
}
			
		