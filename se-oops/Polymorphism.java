import java.util.*;
class Publication 
{
	String title; //Common Data Members
	int price, copies;//Common Data Members
	public  static  int total=0;//Total Sale of Publication
	public int saleCopy()
	{
		System.out.println("Total Sale of Publication is: "+(copies*price));
		return(copies*price);
	}
	public int getcopies()
	{
		return this.copies;
	}
	public int  setcopies(int cp)
	{
		return this.copies=cp;
	}
	public int  setprice(int p)
	{
		return this.price=p;
	}
}
class Book extends Publication
{
	String author;
	int pcopies,price1;//Temporary variables to set the values of price and copies
	public int saleCopy()//Overridden Method
	{
		System.out.println("Total Sale of book is: "+(copies*price));
		total=total+(copies*price);//Calculate total sale of the publication
		return (copies*price);
	}
	public void orderCopies()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the title of the Book to be ordered: ");
		title=in.nextLine();
		System.out.println("Enter the author of the Book to be ordered: ");
		author=in.nextLine();
		System.out.println("Enter the no of copies of the Book to be ordered: ");
		pcopies=in.nextInt();
		System.out.println("Enter the  price of the Book to be ordered: ");
		price1=in.nextInt();
		setcopies(getcopies() + pcopies);
		setprice(price1);
	}
}
class Magazine extends Publication
{
	private int orderQty;
	private String currIssue;
	public String getcurrIssue() 
	{
		return this.currIssue;
	}
	public void setcurrIssue(String issue)
	{
		this.currIssue = issue;
	}
	public int getorderQty()
	{
		return this.orderQty;
	}
	public void setorderQty(int copies)
	{
		this.orderQty = copies;
	}
	public int saleCopy()
	{
		System.out.println("Total Sale of Magazine is: "+(copies*price));
		total=total+(copies*price);
		return (copies*price);
	}
	public void recvNewIssue(String pNewIssue)
	{
		setcopies(orderQty);
		currIssue=pNewIssue;
	}
}
class ExperimentNumber2
{
	public static void main(String args[])
	{
		Book b1=new Book(); //Object for Book1
		b1.orderCopies(); //Order Book1-cust 1
		//b1.orderCopies();//Order Book1-cust2
		System.out.println("Total Copies of the Book1 Ordered: "+b1.copies);
		b1.saleCopy();
		Book b2=new Book();
		b2.orderCopies(); //Order Book2
		System.out.println("Total Copies of the Book2 Ordered: "+b2.copies);
		b2.saleCopy();
		System.out.println("Total Sale of Publication is: "+b1.total);
	}
}

