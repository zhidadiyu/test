
public class Mythread0 implements Runnable {
	long minPrime;
	PrimeRun(long minPrime){
		this.minPrime = minPrime;
	}
	
	public void run() {
		System.out.println(minPrime);
	}
}