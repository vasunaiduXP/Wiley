
public class Fib {
void fib(long n) {
	int a=0, b=1, c, i=0;
	
	System.out.print(a+" "+b+" ");
	
	while(i<n-2) {
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		
		++i;
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fib o = new Fib();
		o.fib(5);
	}

}
