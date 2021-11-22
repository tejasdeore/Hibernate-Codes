package practice.Project;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration().configure();
		SessionFactory factory =cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		
		Book b1 = new Book(0001,"The 5 AM Club",209);
		
		session.save(b1);
		transaction.commit();
		session.close();
		
		System.out.println("success");
	}

}
