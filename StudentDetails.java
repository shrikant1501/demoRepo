import java.util.Scanner;

class StudentDetails 
{
	   int roll_no;
	   String name, cl;

	void input() 
	{

	Scanner sc = new Scanner(System.in);  

	System.out.print("Enter Roll Number: ");

	roll_no = sc.nextInt();  
	sc.nextLine(); 
	System.out.print("Enter Name: ");
	name = sc.nextLine();

	System.out.print("Enter class: ");
	cl = sc.nextLine();

	}

}