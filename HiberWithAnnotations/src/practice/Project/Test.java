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
		
		
		
		Author a1 = new Author("Durjoy Dutta","Dubai");
		
		session.save(a1);
		transaction.commit();
		session.close();
		
		System.out.println("success");
	}

}
