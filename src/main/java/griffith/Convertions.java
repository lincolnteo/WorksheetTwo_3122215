package griffith;

public class Convertions {
	public double euroToDollar(double euro){
		if (euro == 0 ) {// if euro == 0 it will be error as you cant convert nothing
			return 404;
		}
		double dollar = euro * 1.2;// assuming the exchange rate is 1.2 dollar per euro
		return dollar;
	}
	public double dollarToEuro(double dollar){
		if (dollar == 0 ) {// if dollar == 0 it will be error as you cant convert nothing
			return 404;
		}
		return dollar * 0.8;// assuming this exchange rate is 0.8 euro per dollar
	}
	public int stringToInteger(String val){
		if(val.isBlank()){// if the val is null it will return 404 as error
			return 404;
		}
		int integer = Integer.parseInt(val);// converting string to integer
		return integer;// return converted
	}
	public String integerToString(int val){
		if(val == 0){// if value == 0 it will return as an error
			return "Error";
		}
		String string = Integer.toString(val);//  int to string convertion
		return string;// return converted
	}
	public String switchCase(String str){
		if (str.isBlank()) {// if str == blank it will return as an error
			return "Error";
		}
		if (str.matches("[A-Z]+")){// if the str is in uppercase it will convert it to a lower case
			return str.toLowerCase();
		}
		if(str.matches("[0-9]+")){// if the str has numbers it will be returned as an error because
			return "Error";// numbers has no only one form
		}
		return str.toUpperCase();// else it will return as upper case
	}
}
