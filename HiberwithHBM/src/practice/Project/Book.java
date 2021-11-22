package practice.Project;

public class Book {

	private int isbn;
	private String bname;
	private float bprice;
	
		public Book()
			{
		
			}

		public Book(int isbn, String bname, float bprice) 
			{
				super();
				this.isbn = isbn;
				this.bname = bname;
				this.bprice = bprice;
			}

		public int getIsbn() 
			{
					return isbn;
			}

		public void setIsbn(int isbn) 	
			{
				this.isbn = isbn;
			}

		public String getBname() 
		{
			return bname;
		}

		public void setBname(String bname) 
		{
			this.bname = bname;
		}

		public float getBprice() 
		{
			return bprice;
		}

		public void setBprice(float bprice)
		{
			this.bprice = bprice;
		}
	
	

}
