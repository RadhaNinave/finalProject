package javaProject;
import java.io.FileWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class LockedMe 
{
	/**
	 * This variable take file path
	 */
	static final String filePath = "C:\\Users\\Radha\\Desktop\\Lockedme";

	public static void Display() {
		System.out.println("*******************************************************************");
		System.out.println("\tWelcome to LockedMe secure Application");
		System.out.println("\tDeveloped By : Radha Santosh Ninave");
		System.out.println("*******************************************************************");
		System.out.println("\t 1 \tDisplay all Files");
		System.out.println("\t 2 \tCreate New File");
		System.out.println("\t 3 \tDelete File");
		System.out.println("\t 4 \tSearch a File");
		System.out.println("\t 5 \tExit");
		System.out.println("*******************************************************************");
	}

	/**
	 * this method will display all the files 
	 */
	public static void getAllFiles() 
	{
		File folder = new File(filePath);
		File[] listOfFiles = folder.listFiles();
		if (listOfFiles.length > 0)
		{
			System.out.println("files are listed below : ");
			for (var l : listOfFiles)
			{

				System.out.println(l.getName());
			}
		} 
		else 
		{
			System.out.println("folder is empty");
		}
	}

	/**
	 * this method creates a new file
	 * for that it will take a input as file name and number of lines in a file from the user and creates a new file in the directory
	 */
	public static void createNewFile()
	{
		//variable declaration
		String fileName;
		int lineCount,i;
		try 
		{
			Scanner obj1 = new Scanner(System.in);
			
			System.out.println("enter file name");
			fileName = obj1.nextLine();

			

			System.out.println("enter how many lines you want in your files");
			lineCount = Integer.parseInt(obj1.nextLine());

			FileWriter fw = new FileWriter(filePath+"\\"+fileName);
			//System.out.println("enter file lines");
			for ( i = 1; i <= lineCount; i++)
			{
				System.out.println("enter file lines");
				fw.write(obj1.nextLine() + "\n");
			}
			System.out.println("file created successfully");
			fw.close();
		} 
		catch (Exception e) 
		{
			System.out.println("exception occured");
		}
	}

	/**
	 * This method will delete the user specific file 
	 */
	public static void deleteFile()
	{
		String fileName;
		try
			{
				Scanner obj = new Scanner(System.in);
				
				System.out.println("enter file name");
				fileName = obj.nextLine();
			// Get all files into a list
				ArrayList<String> allFilesNames = new ArrayList<String>();
				File folder = new File(filePath);
				File[] listOfFiles = folder.listFiles();
				
				if (listOfFiles.length > 0) 
				{
					for (var l : listOfFiles)
					{
						allFilesNames.add(l.getName());
					}
				}

			File f = new File(filePath + "//" + fileName);

			if (allFilesNames.contains(fileName)) 
			{
				f.delete();
				System.out.println("File delete Sucessfully");
			}
		} 
		
		catch (Exception e)
		{
			System.out.println("Unable to delete file");
		}
	}
	
	/**
	 * This method will search a user specific file
	 */
	public static void searchFile() 
	{
		try 
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("enter file name to be search");
			fileName = obj.nextLine();
			ArrayList<String> allFilesNames = new ArrayList<String>();
			File folder = new File(filePath);
			File[] listOfFiles = folder.listFiles();
			if (listOfFiles.length > 0) 
			{
				for (var l : listOfFiles) 
				{
					allFilesNames.add(l.getName());
					
				}
			}

			File f = new File(filePath + "//" + fileName);

			if (allFilesNames.contains(fileName))
			{
				System.out.println("files is in the folder" + fileName);
			}
			else
			{
				System.out.println("file not found");
			}

		} 
		catch (Exception ex) 
		{
			System.out.println("file not found");
		}
	}

}
