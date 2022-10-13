import java.util.Scanner;      																						//package
interface dress { 																										                                                                                                                     //interface
public void lcheck();
} 		
class login1 implements dress
{
	int i;
    int uid,psw;
	Scanner s=new Scanner(System.in);
	shopping s1=new shopping();
	signup1 si=new signup1();
	  login1()																							                                            //constructor			
	{
	     System.out .println("\n\n--------------------------LOGIN---------------------------------------\n");
	     System.out.println("\n\n already a member??\n enter 1 for yes 0 for no");
		i=s.nextInt();
		if(i==0)
		{
			si.signup2();
          }
		else
		{
			lcheck();
		}
		}
		public void lcheck()
		{
			System.out.println("user id :");
			uid=s.nextInt();
			System.out.println("password :");
			psw=s.nextInt();
			if(uid!=928 || psw!=999){
                                         System.out.println("\n!!user id or password is incorrect please enter again!!");
				lcheck();
			}
		     if(uid==928 || psw==999) 
			{
				s1.shp();
			}
		}
    }

class signup1
{
	Scanner s=new Scanner(System.in);
	shopping s1=new shopping();
	protected void signup2()																	    //access specifiers
	{
		System.out.println("\n\n------------------------SIGN UP--------------------------------\n");
	System.out.print(" User id :");
	String name=s.nextLine();
	System.out.print(" phone number :");
	String phno=s.nextLine();
	System.out.print(" password :");
	int psd=s.nextInt();
	System.out.print(" re enter password:");
	int repsd=s.nextInt();
	if(psd==repsd)
	{
		s1.shp();
		
	}
	else
	{
		System.out.println("\n!!password doesn't match\nenter your details again!!");
		signup2();
	}
	}
}
class A																						//Overriding
{
 void shp()
{
	System.out.println(" ");
}
}
class shopping extends A																			//inheritence
{	
	Scanner s=new Scanner(System.in);
	void res()
	{
		System.out.println("enter customer name :");
		String passno=s.nextLine();
		System.out.println("enter the p.no :");
		String str =s.nextLine();
		
	}
}
class availablebooking extends shopping															
{
       int i=0;
	Scanner s=new Scanner(System.in);
	payment p = new payment();
	void display()
	{
		System.out.println("1 for tops");
		System.out.println("2 for jeans");
            System.out.println("3 for ethenic wear");
		int a;
		p.pay();
		switch(i)
		{
			case 1:  a = 500;
					p.pay(a);
					break;
			case 2: a = 1000;
					p.pay(a);
					break;
                 case 3: a = 2000;
					p.pay(a);
					break;
		}
	}
	
}
final class payment																	//final and overloading 
{
	Scanner s=new Scanner(System.in);
	void pay()
	{
	System.out.println();
	}
	void pay(int a)
	{
		
		       int tax=2;
			int price=a+tax;
			System.out.println("price : "+price);	
		
		
	}
	
}
class MAINCLASS
{
	public static void main(String args[])
	{
		
		login1 l = new login1()	;																		//object			
		availablebooking av=new availablebooking();
		av.display();
		
	}
}

