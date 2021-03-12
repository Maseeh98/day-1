import java.util.Arrays;
import java.util.List;

public class Accounts {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private float balance;
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "{name="+this.name+ ",balance=" +this.balance +"}";
		
	}
	
	public static void main(String[] args) {
			String[] Account = new String[10];
			List AccountList = Arrays.asList(Account);
			
			System.out.println(AccountList);
			
			
			
			
	}
		
		
		
		
		
	

}
