package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger[] logger= {new DatabaseLogger(),new FileLogger(),new SmsLogger(),new EmailLogger()};
		
		
		CustomerManager customerManager=new CustomerManager(logger);
		Customer Engin = new Customer(1,"Engin","Demiroğ");
		
		customerManager.Add(Engin);
	}



}
