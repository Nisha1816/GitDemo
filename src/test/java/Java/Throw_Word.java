package Java;

	public class Throw_Word {

		public void checkAge(int age){
		      if(age<18) {
		         throw new ArithmeticException("Not Eligible for voting");
		         //Remove the comment to see the compiler error
		         //throw new IOException("This is IO Exception");
		         }
		      else
		         System.out.println("Eligible for voting");
		   }
		   public static void main(String args[]){
			   Throw_Word obj = new Throw_Word();
		      obj.checkAge(17);
		      System.out.println("End Of Program");
		      
		      System.out.println("Hello");
		      NullPointerException nullPointer = new NullPointerException();
		      throw nullPointer;
		      //Remove the comment to see the compiler error
		      //System.out.println("How are you");
		   }

	}


