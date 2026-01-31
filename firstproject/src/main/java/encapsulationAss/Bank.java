package encapsulationAss;

public class Bank {
private int pin;


public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}



public void validPins() 
{
	if (pin==1001 || pin==1234 || pin==1212)
	{
				System.out.println("pin is valid!you can withdraw money");
	}else{
	
	           System.out.println("pin is Invalid!Try again");
	}
  }
}
