
public class Home_work2 {

	public static void main(String[] args) {
		
		
		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) {
		         if (a[i] % 2== a2[i ] % 5)  {
		                  sum += i * i;
		         }
		}
		System.out.println("sum = " + sum);
		
		
		
		int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		for ( int index= 0 ; index < 5 ; index++ ) {
		       System.out.print( egArray[ index ] + " " );
		}

		char array_variable [] = new char[10];
		for (int i = 0; i < 10; ++i) {
		         array_variable[i] = 'i';
		         System.out.print(array_variable[i] + " ");
		}
		
		

	

}}
