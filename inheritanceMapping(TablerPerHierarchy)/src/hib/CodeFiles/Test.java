package hib.CodeFiles;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();

		Transaction transaction =session.beginTransaction();
		
		Employee e1= new Employee("Tejas");
		
		RegularEmployee rg1= new RegularEmployee(8000,88);
		rg1.setEname("Riya");
	
		ContractEmployee c1= new ContractEmployee(500,6.6f);
		c1.setEname("vinit");
		
		session.save(e1);
		session.save(rg1);
		session.save(c1);
		
		transaction.commit();
		
		session.close();
		
	}

}
