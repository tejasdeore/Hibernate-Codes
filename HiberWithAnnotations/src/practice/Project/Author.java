package practice.Project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="author")

public class Author 
{
@Id
@GeneratedValue

@Column(name="AID")
private int aid;
@Column(name="ANAME")
private String aname;
@Column(name="ADDRESS")
private String address;

	public Author() {
		
		}

	public Author( String aname, String address) {
		super();
		//this.aid = aid;
		this.aname = aname;
		this.address = address;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
