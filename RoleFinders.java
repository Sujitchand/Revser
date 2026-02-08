import java.io.*;
class RoleFinders{

    public static void main(String[]args) throws Exception{
	InputStreamReader itr=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(itr);
		System.out.println("Enter the number");
		String str=br.readLine();
		    int exp=Integer.parseInt(str);
         // int exp=1;
        if(exp>=0 && exp<=2){
          System.out.println("Associate Engineer");
        }else if(exp>=3 && exp<=5){
         System.out.println("Software Engineer"); 
        }else if(exp>=6 && exp<=7){
          System.out.println("Sr software Engineer");
        }else if(exp>=8 && exp<=10){
 	System.out.println("Manager");
        }else{
	System.out.println(" Role is not find ");

       }
    }
}