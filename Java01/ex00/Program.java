package ex00;

public class Program {

	public static void main(String[] args) {
		
		
		
		User u = new User("lde-mich", 0);
		User u2 = new User("dcastagn", 0);
		
		System.out.println("Saldo " + u.getName() + "(id: " +u.getIdentifier() + ")" + ": " + u.getBalance());
		System.out.println("Saldo " + u2.getName() + "(id: " +u2.getIdentifier() + ")" + ": " + u2.getBalance());
		
		Transaction t = new Transaction(u, u2, TransferCategory.CREDITS, 1000);
		
		System.out.println("Saldo " + u.getName() + "(id: " +u.getIdentifier() + ")" + ": " + u.getBalance());
		System.out.println("Saldo " + u2.getName() + "(id: " +u2.getIdentifier() + ")" + ": " + u2.getBalance());
		
		Transaction t2 = new Transaction(u, u2, TransferCategory.DEBITS, 1000);
		
		System.out.println("Saldo " + u.getName() + "(id: " +u.getIdentifier() + ")" + ": " + u.getBalance());
		System.out.println("Saldo " + u2.getName() + "(id: " +u2.getIdentifier() + ")" + ": " + u2.getBalance());
		
		
	}

}
