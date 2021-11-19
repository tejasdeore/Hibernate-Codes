package hib.Project;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) 
	{
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction transaction =session.beginTransaction();
		
		Student s1=new Student( "Atharva","XII");
		Student s2=new Student("Ved","X");
		
		List<Student> list=new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		
		School school= new School(007,"Don Bosco","Nashik",list);
		
		session.save(s1);
		session.save(s2);
		session.save(school);
		
	transaction.commit();
	session.close();
	}

}
