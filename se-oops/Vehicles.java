interface Functions
{
	public abstract void GearChange(int a);
	public abstract void SpeedUp(int a);
	public abstract void Brake(int a);
}
class Bicycle implements Functions
{
	int gear=1,speed=0;
	public void GearChange(int a)
	{
		if(a==1)
		{
			gear+=1;
		}
		else if (a==0)
		{
			gear-=1;
		}
		else
		{
			System.out.println("Invalid input");
		}
		System.out.println("Current gear of Bicycle is "+this.gear);
	}
	
	public void SpeedUp(int a)
	{
		if(a==1)
		{
			speed+=10;
		}
		else
		{
			System.out.println("Speed same");
		}
		System.out.println("The current speed of Bicycle is "+this.speed);
	}
	
	public void Brake(int a)
	{
		if(a==1)
		{
			System.out.println("Bicycle stopped");
		}
		else
		{
			System.out.println("Bicycle is in motion");
		}
	}
}
class Car implements Functions
{
	int gear=1,speed=0;
	public void GearChange(int a)
	{
		if(a==1)
		{
			gear+=1;
		}
		else if (a==0)
		{
			gear-=1;
		}
		else
		{
			System.out.println("Invalid input");
		}
		System.out.println("Current gear of car "+this.gear);
	}
	
	public void SpeedUp(int a)
	{
		if(a==1)
		{
			speed+=10;
		}
		else
		{
			System.out.println("Speed same");
		}
		System.out.println("The current speed of car is "+this.speed);
	}
	
	public void Brake(int a)
	{
		if(a==1)
		{
			System.out.println("Car stopped");
		}
		else
		{
			System.out.println("Car is in motion");
		}
	}
}
class Bike implements Functions
{
	int gear=1,speed=0;
	public void GearChange(int a)
	{
		if(a==1)
		{
			gear+=1;
		}
		else if (a==0)
		{
			gear-=1;
		}
		else
		{
			System.out.println("Invalid input");
		}
		System.out.println("Bike gear is "+this.gear);
	}
	
	public void SpeedUp(int a)
	{
		if(a==1)
		{
			speed+=10;
		}
		else
		{
			System.out.println("Speed is same");
		}
		System.out.println("The current speed of bike "+this.speed);
	}
	
	public void Brake(int a)
	{
		if(a==1)
		{
			System.out.println("Bike stopped");
		}
		else
		{
			System.out.println("Bike is in motion");
		}
	}
}
public class Vehicles 
{
	public static void main(String args[])
	{
		Bicycle b=new Bicycle();
		b.GearChange(1);
		b.SpeedUp(1);
		b.Brake(1);
		
		Bike bk=new Bike();
		bk.GearChange(1);
		bk.SpeedUp(1);
		bk.Brake(1);
		Car c=new Car();
		c.GearChange(1);
		c.SpeedUp(1);
		c.Brake(1);
	}
}

