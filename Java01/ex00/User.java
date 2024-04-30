package ex00;

public class User {
	
	
	private int identifier;
	private String name;
	private int balance;


	
	
	public User ()
	{
		
	}
	
	
	public User (String name, int balance)
	{
		this.name = name;
		this.identifier = (int)(Math.random() * 9999 + 1000);
		
		if (balance < 0)
		{
			System.err.println("Il saldo iniziale non puo' essere  negativo");
			return ;
		}
		else
		{
			this.balance = balance;
		}
	}

	
	
	
	
	public int getIdentifier() {
		return identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
}
