package interfaces;

public class CustomerManager {
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	
	public void Add(Customer customer) {
		System.out.println("Müşteri Eklendi  "+customer.getFirstName());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
	
	
	
	public void Delete(Customer customer){
		System.out.println("Müşteri Silindi"+customer.getFirstName());
			
			Utils.RunLoggers(loggers, customer.getFirstName());
	
	}
}
