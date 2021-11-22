package practice.Project;


import java.util.Iterator;
import java.util.Scanner;



import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestForHQL {

	Session session;
	Transaction transaction;
	static Scanner sc;

	public  TestForHQL() 
	{
		session=new Configuration().configure().buildSessionFactory().openSession();
		sc=new Scanner(System.in);
	}
	
	public void createViewOfAuthor()
	{
	transaction =session.beginTransaction();

	String hql ="insert into Author(aid,aname,address)"+"select aid,aname,address";
	

	Query query =session.createQuery(hql);
	query.executeUpdate();
	transaction.commit();
	}
	
	public void insert()
	{
		transaction=session.beginTransaction();
		System.out.println("To Insert Enter Auther's name:");
		String aname   = sc.nextLine();
		System.out.println("To Insert Enter Author's address:");
		String address = sc.nextLine();
		
		Author a1 = new Author(aname,address);
		
		session.save(a1);
		transaction.commit();
	}
	
	public void delete()
	{
		transaction=session.beginTransaction();
		
		System.out.println("To Delete Please Enter Aid ");
		int aid=sc.nextInt();
		
		String hql="delete from Author where aid =: v1";
		
		//@SuppressWarnings({ "rawtypes" })
		Query query=session.createQuery(hql);
		query.setParameter("v1", aid);
		query.executeUpdate();
	
		transaction.commit();
	}
	
	public void update()
	{
	 transaction=session.beginTransaction();
	 
	 System.out.println("To Update Enter Author's ID");
	 int aid=sc.nextInt();
	 System.out.println("To Update Enter Author's Name");
	 String aname=sc.nextLine();
	 System.out.println("To Update Enter Authors's Address");
	 String address=sc.nextLine();
	 
	 String hql="update Author set aname=:v1 ,address=:v2 where aid=:v";
	 


		Query query =session.createQuery(hql);
		
	 query.setParameter("v1",aname);
	 query.setParameter("v2",address);
	 query.setParameter("v", aid);
	 query.executeUpdate();
	 
	 transaction.commit();
	}
	
	public void select()
	{
		 transaction=session.beginTransaction();
		 System.out.println("*********All the Records**********");
		 
		 String hql="from Author";
		
		Query query=session.createQuery(hql);
		 
		 Iterator<Author> i1=query.iterate();
		 
		 while(i1.hasNext())
		 {
			 Author a1=i1.next();
			 
			 System.out.println(a1.getAid()+"\t"+a1.getAname()+"\t"+a1.getAddress());
			 
		 }
		
		 transaction.commit();
	}
	
	public static void main(String[] args) {
		
		TestForHQL tfh =new TestForHQL();
		//tfh.createViewOfAuthor();
		tfh.insert();
		//tfh.delete();
		//tfh.update();
		//tfh.select();
	}

}
