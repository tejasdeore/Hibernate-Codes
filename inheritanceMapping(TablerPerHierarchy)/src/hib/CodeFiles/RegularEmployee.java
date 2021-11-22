package hib.CodeFiles;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="regemp")

public class RegularEmployee extends Employee
{

	private float esal;
	private float bonus;


	public RegularEmployee()
	{
		
	}


	public RegularEmployee(float esal, float bonus) 
	{
		super();
		this.esal = esal;
		this.bonus = bonus;
	}


	public float getEsal() {
		return esal;
	}


	public void setEsal(float esal) {
		this.esal = esal;
	}


	public float getBonus() {
		return bonus;
	}


	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
}
