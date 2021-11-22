package practice.Project;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test1 {
	
	Session session;
	Transaction transaction;
	
	
	public Test1(){
		
	session	=new Configuration().configure().buildSessionFactory().openSession();
	
	}
	
	public void insert()
	{
		transaction=session.beginTransaction();
		Author a1=new Author("Vishwas Patil","Mumbai");
		session.persist(a1);
		transaction.commit();
	}
	
	public void delete()
	{
		transaction=session.beginTransaction();
		Author a1=new Author();
		a1.setAid(5);
		session.delete(a1);
		transaction.commit();
	}
	
	public void update()
	{
		transaction=session.beginTransaction();
		Author a1= new Author();
		a1.setAid(3);
		a1.setAddress("Delhi");
		a1.setAname("Arundhati Roy");
		session.update(a1);
		transaction.commit();
	}
	
	@SuppressWarnings("deprecation")
	public void select(@SuppressWarnings("rawtypes") Class Author)
	{
		transaction=session.beginTransaction();
	Criteria criteria = session.createCriteria(Author);
	    
		
		
		
		@SuppressWarnings("unchecked")
		List<Author> alist=criteria.list();
	    
	    for(Author a1:alist) 
	    {
	    	System.out.println(a1.getAid()+"\t"+a1.getAname()+"\t"+a1.getAddress());
	    }
	    transaction.commit();
		
	}
	
	public static void main(String[] args) {
	
			Test1 t1 = new Test1();
			//t1.insert();
			//t1.delete();
			//t1.update();
			t1.select(Author.class);
	}

}
