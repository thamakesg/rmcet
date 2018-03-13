import java.util.Scanner;


public class Admin {
	
private	static StudentSchedular studSch = new StudentSchedular();
private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		showMenu();
	}

	private static void showMenu() {
		int choice;
		while(true)
		{
			System.out.println("1. add student");
			System.out.println("2. show students");
			System.out.println("3. exit");
			System.out.println("Enter your choice");
			choice=Integer.parseInt(sc.next());
			
			switch(choice)
			{
			case 1:acceptStudentDetails();
			       break;
			case 2:showAllStudents();
			       break;
			case 3:System.exit(0);
			}
			}
			
		}

	private static void acceptStudentDetails() {
		System.out.println("Enter roll number");
		int rollNumber = Integer.parseInt(sc.next());
		
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println(studSch.addStudent(rollNumber, name));
		
	}

	private static void showAllStudents() {
		// TODO Auto-generated method stub
		
	}
		
	}


