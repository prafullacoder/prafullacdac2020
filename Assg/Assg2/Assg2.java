/*
//Pyramid pattern (1)....
class F3
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=9 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print(""+c);
				k++;
				System.out.print(" ");
			}
			for(int m=2 ; m<=i ; m++)
			{
				System.out.print(c);
				m++;
				System.out.print(" ");
			}
			c++;
			System.out.println();
		}
	}
}*/

/*
//Pyramid pattern (2)....
class F3
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=9 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			int c=1;
			for(int m=1 ; m<=i ; m++)
			{
				System.out.print(c);
				m++;
				System.out.print(" ");
				c++;
			}
			for(int k=2 ; k<=i ; k++)
			{
				System.out.print(c);
				k++;
				System.out.print(" ");
				c++;
			}
			System.out.println();
		}
	}
}*/

/*
//Pyramid pattern (3)....
class F3
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=9 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int m=1 ; m<=i ; m++)
			{
				System.out.print("*");
				m++;
				System.out.print(" ");
			}
			for(int k=2 ; k<=i ; k++)
			{
				System.out.print("*");
				k++;
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
*/
/*
//pyramid pattern (4)....
class F3
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=9 ; j>=i ; j--)
			{
				System.out.print("  ");
			}
			int c=1;
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print(" "+c);
				c++;
				
			}
			c=i-1;
			for(int m=2 ; m<=i ; m++ )
			{
				System.out.print(" "+c);
				c--;
			}
			System.out.println();
		}
	}
}*/

/*
//Pyramid pattern (5)....

class F3
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=9 ; j>=i ; j--)
			{
				System.out.print("  ");
				int c=10-i;
			}
			int c=10-i;
			for(int m=1 ; m<=i ; m++)
			{
				System.out.print(" "+c);
				c++;
			}
			int p=8;
			for(int k=2 ; k<=i ; k++)
			{
				System.out.print(" "+p);
				p--;
			}
			System.out.println();
		}
		
	}
}*/


/*
//Inverted pyramid pattern (6)....
class F3
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
			System.out.print(" ");
			}
		
			for(int m=9 ; m>=i ; m--)
			{	
				System.out.print("*");
				m--;
				System.out.print(" ");
			}
			for(int k=9 ; k>i ; k--)
			{
				System.out.print("*");
				k--;
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}*/


/*
//Inverted pyramid pattern (7)....
class F3
{
	public static void main(String args[])
	{
		int c=9;
		for(int i=1 ; i<=9 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
			System.out.print(" ");
			}
			
			for(int m=9 ; m>=i ; m--)
			{	
				System.out.print(c);
				m--;
				System.out.print(" ");
			}
			for(int k=9 ; k>i ; k--)
			{
				System.out.print(c);
				k--;
				System.out.print(" ");
			}
			c--;
			System.out.println();
		}
	}
}*/

/*
//Half Pyramid....
class F3
{
	public static void main(String args[])
	{
	for(int i=1 ; i<=6 ; i++)
	{
		for(int j=1 ; j<=i ; j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	}
}*/


/*
//Inverted half pyramid....
class F3
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=6 ; i++)
		{
			for(int j=6 ; j>=i ; j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}*/


/*
//Full pyramid
class F3
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=6 ; i++)
		{
			for(int j=6 ; j>=i ; j--)
			{
				System.out.print("  ");
			}
			for(int m=1 ; m<=i ; m++)
			{
				System.out.print("*");
				m++;
				System.out.print("   ");
			}
			for(int k=2 ; k<=i ; k++)
			{
				System.out.print("*");
				k++;
				System.out.print("   ");
			}
			System.out.println();
		}
	}
}*/






/*
//inverted full pyramid....
class F3
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=6 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
			System.out.print("  ");
			}
		
			for(int m=6 ; m>=i ; m--)
			{	
				System.out.print("*");
				m--;
				System.out.print("   ");
			}
			for(int k=6 ; k>i ; k--)
			{
				System.out.print("*");
				k--;
				System.out.print("   ");
			}
			System.out.println();
		}
	}
}*/

