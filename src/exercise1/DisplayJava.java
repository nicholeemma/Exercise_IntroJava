package exercise1;

public class DisplayJava {
	public static void main(String[] args) {
		System.out.println("1.1 Welcome to Jva, Welcome to Computer Science, Programming is fun");
		
		System.out.println("1.2");
		for(int i=0;i<=4;i++) 
		{
			System.out.println("Welcome to Java");
		}
	
		System.out.println("1.3");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("J");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("A");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("V");
		for (int i=0;i<=4;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("V");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("A");
		//2nd line
		System.out.println();
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("J");
		for (int i=0;i<=1;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("A");
		System.out.print(" A");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("V");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("V");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("A A");
		//3rd line
		System.out.println();
		System.out.print("J");
		for (int i=0;i<=1;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("J");
		System.out.print(" ");
		for (int i=0;i<=4;i++) 
		{
		System.out.print("A");
		}
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("V V");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("AAAAA");
		//4th line
		System.out.println();
		System.out.print(" J  A");
		for (int i=0;i<=4;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("a");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("V");
		for (int i=0;i<=2;i++) 
		{
		System.out.print(" ");
		}
		System.out.print("a");
		for (int i=0;i<=4;i++) 
		{
		System.out.print(" ");
		}
		System.out.println("a");
		
		//1.3
		System.out.println("1.3");
		System.out.printf("%-10s%-10s%-10s", "a","a^2","a^3");
		System.out.println();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++) 
			{   double j1=(double)j;
			    double i1=(double)i;
			    //pow(double a,double b) cast into int is fine
			    int result=(int)Math.pow(i1, j1);
				System.out.printf("%-10d",result);
			}
			System.out.println();
		}
		System.out.println("1.5  result:"+(9.5*4.5-2.5*3)/(45.5-3.5));
		
		System.out.println("1.6");
		int sum=0;
		for (int i=1;i<=9;i++) 
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		System.out.println("1.7");
		double s=0.0;
		for (int i=1;i<=7;i++)
			{
			double r=(double)i/(2*i-1);
			s=s+Math.pow(-1.0, (double)i+1)*r;
			}
		System.out.println(s*4);
		
		System.out.println("1.11");
		double population=312032486.0;
		for (int i=1;i<=5;i++)
		{
			double change=(365*24*60*60)/7+(365*24*60*60)/45-(365*24*60*60)/13;
			population=population+change;
			System.out.println(i+" "+population);
		}
	}
}
