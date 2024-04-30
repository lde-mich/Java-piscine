package ex00;

import java.util.UUID;

enum TransferCategory {
	
    DEBITS,
    CREDITS
    
}

public class Transaction {
	
	
	private UUID identifier;
	private User recipient;
	private User sender;
	private TransferCategory transferCategory;
	private int transferAmount;
	
	
	
	
	public Transaction ()
	{
		this.identifier = UUID.randomUUID();
	}
	
	
	public Transaction (User sender, User recipient, TransferCategory transferCategory, int transferAmount)
	{
		this.identifier = UUID.randomUUID();
		
		if (transferCategory == TransferCategory.DEBITS)
		{
			sender.setBalance(sender.getBalance() - transferAmount);
			recipient.setBalance(recipient.getBalance() + transferAmount);
		}
		else if (transferCategory == TransferCategory.CREDITS)
		{
			sender.setBalance(sender.getBalance() + transferAmount);
			recipient.setBalance(recipient.getBalance() - transferAmount);
		}
		else
		{
			System.err.println("Categoria trasferimento non valida");
			return ;
		}
		
		System.out.println("Transazione avvenuta con successo, ID transazione: " + this.identifier);
	}
	
	
	
	
	
	public UUID getIdentifier() {
		return identifier;
	}

	public User getUserRecipient() {
		return recipient;
	}
	
	public void setUserRecipient(User userRecipient) {
		this.recipient = userRecipient;
	}
	
	public User getSender() {
		return sender;
	}
	
	public void setSender(User sender) {
		this.sender = sender;
	}
	
	public int getTransferAmount() {
		return transferAmount;
	}
	
	public void setTransferAmount(int transferAmount) {
		this.transferAmount = transferAmount;
	}

	public TransferCategory getTransferCategory() {
		return transferCategory;
	}

	public void setTransferCategory(TransferCategory transferCategory) {
		this.transferCategory = transferCategory;
	}
	
	
	
	
}
