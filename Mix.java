import java.util.Scanner;

public class Mix {
	int a,b,c,d,e;
	void input() {
		System.out.println("Enter number");
		c=sc.nextInt();
	}
	void input2() {
	System.out.println("Enter first no");
	a=sc.nextInt();
	System.out.println("Enter Second no");
	b=sc.nextInt();
	}
	void input3() {
	System.out.println("Enter first no");
	a=sc.nextInt();
	System.out.println("Enter Second no");
	b=sc.nextInt();
	System.out.println("Enter Second no");
	e=sc.nextInt();
	}
	void add()
	{
		d=a+b;
		System.out.println(d);
	}
	void sub()
	{
		d=a-b;
		System.out.println(d);
	}
	void multi()
	{
		d=a*b;
		System.out.println(d);
	}
	void div()
	{
		d=a/b;
		System.out.println(d);
	}

	void max()
	{
		if(a>b&&a>e)
			System.out.println(a+" Is greater");
		else if(b>a&&b>e)
			System.out.println(b+" Is greater");
		else
			System.out.println(e+" Is greater");
	}
void fact()
{
	int fact=1;
	for(int i=1;i<=c;i++)
		{fact=fact*i;}
	System.out.println(fact);
}



void evenodd()
{
	if(c%2==0)
		System.out.println(c+"Is even");
	else
		System.out.println(c+"Is odd");
}

	public static void main(String[] args) {
		int ch;
		Mix m=new Mix();
				do {
					System.out.println("\n1.Addition 2.Subraction 3.Division 4.Multiplication 5.Greatest of 3 nos 6.Factorial 7.Even odd 0. Exit");
					System.out.println("Enter your choice");
					ch=m.sc.nextInt();
					switch(ch)
					{
					case 1:
						m.input2();
						m.add();
						break;
					case 2:
						m.input2();
						m.sub();
						break;
					case 3:
						m.input2();
						m.div();
						break;
					case 4:
						m.input2();
						m.multi();
						break;
					case 5:
						m.input3();
						m.max();
						break;
					case 6:
						m.input();
						m.fact();
						break;
					case 7:
						m.input();
						m.evenodd();
						break;
					case 0:
						System.exit(0);
						break;
						default:
						System.out.println("Wrong Choice");
						break;
					}
				}while(ch!=8);
	}

}
