package quizes;

public class Quiz1 {
	public static void main(String[] args) {
		try {
			comparingNumber(9);
		} catch (Exception e) {
			
		System.out.println(e.getMessage());	
		}

	}

	static void comparingNumber(int number) throws Exception {
	     if (number>10){
	       System.out.println("Number is greater that 10");
	     }
	     else{
	       throw new ArithmeticException("Number is less then 10");
	     }
	}
	   
}