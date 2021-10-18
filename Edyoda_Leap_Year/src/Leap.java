import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Enter a number");
     Scanner sc=new Scanner(System.in);
     int number= sc.nextInt();
     if(number%4==0)
     {
    	 System.out.println("Given number is Leap Year");
     }
     
     else
     {
    	 System.out.println("Given number is not a Leap Year"); 
     }
     
    	 
	}

}
