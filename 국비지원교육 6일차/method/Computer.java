package method;

public class Computer{
	int sum1(int[] value) {
		int sum=0;
		int i;
		for(i=0;i<value.length;i++) {
			sum+=value[i];
		}
		return sum;
	}
}