package a1;
import java.util.Scanner;

public class student {
 int regno;
 String name,dept;
 Scanner s;
 void input()
 {
	 s=new Scanner(System.in);
	 System.out.println("enter Refno");
	 regno=s.nextInt();
	 System.out.println("enter name");
	 name=s.next();
	 System.out.println("enter dept");
	 dept=s.next();
 }
 void display()
 {
	 System.out.println("regno is:"+regno);
	 System.out.println("name is:"+name);
	 System.out.println("dept is:"+dept);
 }
 public static void main(String[]args)
 {
	 student a=new student();
	 a.input();
	 a.display();
	 
 }

}
