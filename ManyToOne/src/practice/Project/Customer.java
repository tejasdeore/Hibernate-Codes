package practice.Project;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cust3")
public class Customer {
	
	@Id
	private long accno;
	private String custname;
	private	String acctype;
	private String address;

	@ManyToOne (cascade= CascadeType.ALL)
	private Bank bank;
	public Customer()
	{
		
	}

	public Customer(long accno, String custname, String acctype, String address,Bank bank) {
		super();
		this.accno = accno;
		this.custname = custname;
		this.acctype = acctype;
		this.address = address;
		this.bank=bank;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
