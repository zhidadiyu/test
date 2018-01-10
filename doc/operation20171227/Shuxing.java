/**
 * Description: <br/>
 * Date: 2017年12月27日 下午6:07:43 <br/>
 * 
 * @author Zhengheyang
 * @version
 * @see
 */
public class Shuxing{
private String name = "Zheng";
private int age = 11;
private char sex = '男';
//存名字
public void setName(String name){
	this.name = name;
	System.out.println(this.name);
}
//取名字
public String getName(){
	return name;
}
//存年龄
public void setAge(int age){
	this.age = age;
	System.out.println(this.age);
}
//取年龄
public int getAge(){
	return age;
}
//存性别
public void setSex(int age){
	this.sex = sex;
	System.out.println(this.sex);
}
//取性别
public char getSex(){
	return sex;
}
}