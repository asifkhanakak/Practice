
public class Home_work1 {

	public static void main(String[] args) {
		
		int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;

		for (int i = 0; i < 3; ++i) {

		   for (int j = 0; j < 3; ++j) {

		       sum = sum + array_variable[i][j];

		   }

		}

		System.out.print(sum / 5);
		System.out.println();
		System.out.println("_______________________________________________________");
		
		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];

		        }

		}

		System.out.println(what);
		System.out.println("-------------------------------------------------------------");
		
		
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );
		
		
		
		
		
		
		
		
		
		

	

}}
