import java.io.*;
public class WeekDays{

public static void main(String[]args)throws Exception{
         InputStreamReader itr=new InputStreamReader(System.in);
               BufferedReader br= new BufferedReader(itr);
               System.out.println("Enter the number");
                 String str=br.readLine();
	       int  num	=Integer.parseInt(str);
       switch(num){

		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("wednesday");
		break;
		case 4:System.out.println("Thuresday");
		break;
		case 5:System.out.println("friday");
		break;
		case 6:System.out.println("saturday");
		break;
		case 7:System.out.println("saturday");
		break;
		default:System.out.println("Day not found");
		
      }
   }
}