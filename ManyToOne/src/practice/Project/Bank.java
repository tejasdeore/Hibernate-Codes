package practice.Project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank3")

public class Bank 
{
	@Id
	private String ifsc;
	private String bankname;
	private String branchname;
	private float irate;
	
	public Bank()
	{
		
	}

	public Bank(String ifsc,String bankname, String branchname, float irate) {
		super();
		this.bankname = bankname;
		this.branchname = branchname;
		this.irate = irate;
		this.ifsc = ifsc;

	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public float getIrate() {
		return irate;
	}

	public void setIrate(float irate) {
		this.irate = irate;
	}
	
	
}
