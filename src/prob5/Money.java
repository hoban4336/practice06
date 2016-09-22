package prob5;

public class Money {
	private int amount;

	public Money(int i) {
		this.amount = i;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add( Money money ) {
		Money tmp = new Money(this.amount + money.getAmount());
		return tmp;
    }
    public Money minus( Money money ) {
		Money tmp = new Money(this.amount -money.getAmount());
    	return tmp;
    }
    public Money multiply( Money money ) {
		Money tmp = new Money(this.amount * money.getAmount());
    	return tmp;
      }
    public Money devide( Money money ) {
		Money tmp = new Money(this.amount / money.getAmount());
    	return tmp;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
    
    
}
