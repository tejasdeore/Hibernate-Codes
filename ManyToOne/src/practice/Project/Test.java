package practice.Project;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	
	public static void main(String[] args) 
	{
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Bank b1=new Bank("00001","SBI","Nashik",6.2f);
		
		Customer c1=new Customer(4220063,"Tejas Deore","saving","College rd",b1);
		Customer c2=new Customer(4220064,"Nitya Joshi","current","Gangapur rd",b1);
		
		
		session.save(b1);
		session.save(c1);
		session.save(c2);
	
		
		/*String hql="from Customer";
		Query query =session.createQuery(hql);
		
		List<Customer> custlist=query.list();
		
		for(Customer c1:custlist)
		{
			Bank b1=c1.getBank();
			if(b1.getBankname().equals("SBI") && b1.getBranchname().equals("Nashik"))
			{
				System.out.println(b1.getIfsc()+"\t"+b1.getBankname()+"\t"+b1.getBranchname()+"\t"+b1.getIrate());
				System.out.println(c1.getAccno()+"\t"+c1.getAcctype()+"\t"+c1.getCustname()+"\t"+c1.getAddress());

			}
		}
		*/
		transaction.commit();
		session.close();
	}

}
