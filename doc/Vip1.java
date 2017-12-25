/**
 * 
 * @authors ${author} (${email})
 * @date    2017-12-25
 * @version $Id$
 */
public class Vip1{
public double discount(int i,double money,double dMoney){
	switch (i) {
		case 1://这是为至尊级
			System.out.println("您的会员等级为至尊");
			dMoney = money*0.75;
			break;
			case 2:
			System.out.println("您的会员等级为砖石");
			dMoney = money*0.8;
			break;
			case 3:
			System.out.println("您的会员等级为铂金");
			dMoney = money*0.85;
			case 4:
			System.out.println("您的会员等级为黄金");
			dMoney = money*0.9;
			default:
				System.out.println("您输入错误请重新输入！");
	}
	return dMoney;
	}
}