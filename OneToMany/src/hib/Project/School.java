package hib.Project;



import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="school")
public class School {
	
	@Id
	private int regino;;
	private String name;
	private String address;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Student> studlist=new LinkedList<Student>();
	
	public School()
	{
		
	}

	public School(int regino, String name, String address, List<Student> studlist) {
		super();
		this.regino = regino;
		this.name = name;
		this.address = address;
		this.studlist = studlist;
	}

	public int getRegino() {
		return regino;
	}

	public void setRegino(int regino) {
		this.regino = regino;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Student> getStudlist() {
		return studlist;
	}

	public void setStudlist(List<Student> studlist) {
		this.studlist = studlist;
	}
	
}
