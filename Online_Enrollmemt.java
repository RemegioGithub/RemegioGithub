import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int num;
		int[] id = new int[50];
		String[] name = new String[50];
		String[] course = new String[50];
		String[] school = new String[50];
		Scanner obj = new Scanner(System.in);
		System.out.println("\n\t     ======== ENROLLMENT SYSTEM ========\n");
		System.out.print("Enter Number of Student : ");
		num=obj.nextInt();
		for(int i = 0; i < num; i++){
			System.out.println("Student"+ +i);
			System.out.print("Student Number : ");
			id[i] = obj.nextInt();
			System.out.print("Enter Name : ");
			name[i] = obj.next();
			System.out.print("Course : ");
			course[i] = obj.next();
			System.out.print("School : ");
			school[i] = obj.next();
		}
		System.out.println(" \n\t   ======== SCHOOL RECORD SYSTEM ========");
		System.out.println("Student Number     Student Name\t      Course \t School");
		System.out.println("----------------------------------------------------------");
		for(int i = 0; i<num; i++){
		System.out.println(id[i] + "\t           "   +   name[i] + "\t       " + course[i] + "\t   " +  school[i]);	
		}
	}
}