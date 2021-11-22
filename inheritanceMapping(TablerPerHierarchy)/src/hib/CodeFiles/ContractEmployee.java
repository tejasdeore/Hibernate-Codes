package hib.CodeFiles;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="contremp")

public class ContractEmployee extends Employee
{

	private float pph;
	private float duration;

	public ContractEmployee()
	{
		
	}

	public ContractEmployee(float pph, float duration)
	{
		super();
		this.pph = pph;
		this.duration = duration;
	}

	public float getPph() {
		return pph;
	}

	public void setPph(float pph) {
		this.pph = pph;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	
}
