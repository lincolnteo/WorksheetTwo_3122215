package griffith;

public class Convertions {
	public double euroToDollar(double euro){
		if (euro == 0 ) {
			return 404;
		}
		double dollar = euro * 1.2;
		return dollar;
	}
	public double dollarToEuro(double dollar){
		if (dollar == 0 ) {
			return 404;
		}
		return dollar * 0.8;
	}
	public int stringToInteger(String val){

		return 0;
	}
	public String integerToString(int val){
		return null;
	}
	public String switchCase(String str){
		return null;
	}
}
