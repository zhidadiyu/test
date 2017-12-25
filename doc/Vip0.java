/**
 * 
 * @authors ${author} (${email})
 * @date    2017-12-25
 * @version $Id$
 */
import java.util.*;
public  class Vip0{


	public static void main(String[] args) {
		//这个是客户需要输入的金额
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入金额:");
		//这个是需要输出客户等级
		double money = sc.nextDouble();
		System.out.println("请问您的会员等级：");

		int i = sc.nextInt();
		Vip1 j = new Vip1();
		double dMoney = 0;
		System.out.println("打折后金额您是需要的值为"+j.discount(i,money,dMoney));

}

		
	}
