// 上机题（2）
// 编写程序，输出如下类似矩形，宽高通过键盘输入。
// *+*+*+*+*+*+*
// +*+*+*+*+*+*+
// *+*+*+*+*+*+*
import java.util.*;
public class Test2{
	public static void main(String[] args) {
		System.out.println("请输入长度：");
		Scanner a = new Scanner(System.in);
		int a1 = a.nextInt();
		System.out.println("请输入宽度：");
		int b1 = a.nextInt();
		String[] ary = new String[b1];//宽度
		String[] ary0 = new String[a1];//长度
		for (int b2 = 0;b2<b1 ;b2++ ) {
			if (b2%2==0) {
				for (int a2 = 0;a2<a1 ;a2++ ) {
					if (a2%2==0) {
						ary[a2] = "*";

					}else{
						ary[a2] = "+";
					}
				System.out.print(ary[a2]);
				}

			}else if(b2%2==1){
				for (int a2 = 0;a2<a1 ;a2++ ) {
					if (a2%2==0) {
						ary0[a2] = "+";

					}else{
						ary0[a2] = "*";
					}
					System.out.print(ary0[a2]);
			}
		}
System.out.println();
	}
}
}