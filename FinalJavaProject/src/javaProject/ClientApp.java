package javaProject;

import java.util.Scanner;

public class ClientApp 
{
	public static void main(String args[])
	{
		int ch;
		Scanner obj=new Scanner(System.in);
	
		do
		{
			LockedMe.Display();
			System.out.println("Enter your choice");
			ch=Integer.parseInt(obj.nextLine());
			
			switch(ch)
			{
				case 1 :LockedMe.getAllFiles();
						break;
				case 2 :LockedMe.createNewFile();
						break;
				case 3 :LockedMe.deleteFile();
						break;
				case 4 :LockedMe.searchFile();
						break;
				case 5 :System.exit(0);
						break;
				default : System.out.println("Invalid Option");
				
			}
			
		}
		while(ch>0);
		obj.close();
		
	}
}

