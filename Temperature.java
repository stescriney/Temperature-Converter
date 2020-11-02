import java.util.Scanner;
public class Temperature{
	
	
	public static void main(String args[]){
		
		
	System.out.println("-----Temparture Converter-----");
	System.out.println("------------------------------");
	
	Scanner sc = new Scanner(System.in);
		
	double fah;
	double cel;
	String response;
	
	
		do{
	
		System.out.println("Would you like fah or cel?");
		String choice = sc.next();
	
			if(choice.equals("fah")){
		
				System.out.println("enter temperature in cel");
				cel = sc.nextDouble();
		
				fah = cel*(9.0/5.0) + 32;
			
				System.out.println("temperature in fah is "+ fah);
			
			}//close if
			else if (choice.equals("cel")){
			
			
				System.out.println("enter temperature in fah");
				fah = sc.nextDouble();
			
				cel = (fah - 32)/(9.0/5.0);
			
				System.out.println("temperature in cel is "+ cel);
			
			
			}//close else if
		
				System.out.println("Would you like to start again?");
				response = sc.next();
	
			}//close do
			while(response.equals("Y"));
	
			System.out.println("Goodbye");
	
	}//close main
	
	
}//close class