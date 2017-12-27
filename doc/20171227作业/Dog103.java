public class Dog103{
	public int Dog103(int[] ary){
		int max = ary[0];
		for (int i = 1;i<ary.length-i ;i++ ) {
			if (ary[i]>max) {
				max = ary[i];
			}
		}
		return max;
	}
}
	

