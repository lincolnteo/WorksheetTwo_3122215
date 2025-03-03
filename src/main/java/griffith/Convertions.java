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
		if(val.isBlank()){
			return 404;
		}
		int integer = Integer.parseInt(val);
		return integer;
	}
	public String integerToString(int val){
		if(val == 0){
			return "Error";
		}
		String string = Integer.toString(val);
		return string;
	}
	public String switchCase(String str){
		if (str.isBlank()) {
			return "Error";
		}
		if (str.matches("[A-Z]+")){
			return str.toLowerCase();
		}
		if(str.matches("[0-9]+")){
			return "Error";
		}
		return str.toUpperCase();
	}
}
