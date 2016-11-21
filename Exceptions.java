package TeachingExample;

//Where all the Exceptions will be held
public class Exceptions {

	//Inner Classes
	protected class YearToLowException extends Exception{
		//Main Exception Throw
		protected YearToLowException(){
			super();
		}
		//String Exception Throw
		protected YearToLowException(String s){
			super(s);
		}
	}

	protected class PriceToLowException extends Exception{
		//Main Exception Throw
		protected PriceToLowException(){
			super();
		}
		//String Exception Throw
		protected PriceToLowException(String s){
			super(s);
		}
	}

	protected class NegativeSeatsException extends Exception{
		//Main Exception Throw
		protected NegativeSeatsException(){
			super();
		}
		//String Exception Throw
		protected NegativeSeatsException(String s){
			super(s);
		}
	}
}