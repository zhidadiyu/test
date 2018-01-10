
public class ThreadDemo0 {
	
	

	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println("当前线程为"+t.getName());
		t.setName("MyJavaThread");
		System.out.println("当前线程名为"+t.getName());
	}	
}