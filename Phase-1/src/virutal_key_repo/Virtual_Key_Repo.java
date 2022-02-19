package virutal_key_repo;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class Virtual_Key_Repo {

	

		
		static String path="//Users//apple//Desktop//MPHASIS CERTIFICATIONS";
		public static void main(String[] args) throws IOException {
			System.out.println("\n****************************************************\n");
			System.out.println("\tVIRTUAL KEY REPOSITORY  \n");
			System.out.println("\t\t	-Developed by bhargav X  \n");
			System.out.println("****************************************************");
			try {	
				optionsSelection();
			} catch (Exception e) {
				System.out.println("Error in the program please standby");
				closeApp();
			}
		}


		private static void optionsSelection() {
			String[] arr = { "1. I wish to Retrieve my FileNames in Ascending Order", "2. I wish to add a new file",
					"3. I wish to delete a file from a location", "4. I wish to search a file from a directory",
					"5. Close the application" };
			int[] arr1 = { 1, 2, 3, 4, 5 };
			int slen = arr1.length;
			for (int i = 0; i < slen; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("\nEnter your choice:\t");
			Scanner sc = new Scanner(System.in);
			int options = sc.nextInt();
					switch (options) {
					case 1:
						System.out.println("Your Sorted Files are here!");
						sortFile();
						optionsSelection();
						break;
					case 2:
						System.out.println("Please specify the file you want to add");
						addFile();
						optionsSelection();
						break;
					case 3:
						System.out.println("Performing the deletion operation");
						deleteFile();
						optionsSelection();
						break;
					case 4:
						System.out.println("Enter the directory to search a file");
						searchFile();
						optionsSelection();
						break;
					case 5:
						closeApp();
						break;
					default:
						System.out.println("You have given invalid choice\nTry again!!! ");
						optionsSelection();
						break;
					}
				
		}
		
		private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
		private static void sortFile() {
			File fileDir = new File(path);
			if (fileDir.isDirectory()) {
				List listFile = Arrays.asList(fileDir.list());
				System.out.println("Listing files unsorted");
				for (Object s : listFile) {
					System.out.println(s);
				}
				System.out.println("\n\n\n");
				Collections.sort(listFile);
				System.out.println("---------------------------------------");
				System.out.println("Sorting by filename in ascending order");
				for (Object s : listFile) {
					System.out.println(s);
				}
				System.out.println("\n\n\n");
			} else {
				System.out.println(fileDir.getAbsolutePath() + " is not a directory");
			}
		}
		

		private static void addFile() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the file name: \n");
			String name=sc.next();
			
			File f = new File(path+"\\"+name);

			if (f.exists()) {
				System.out.println("File already exists");
			} else {
				try {
					f.createNewFile();
					System.out.println("File " + name + " was created");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		private static void deleteFile() {
			// check first if supplied file name is a folder
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the file name: \n");
			String name=sc.next();
			
			try  
			{         
			File f= new File(path+"\\"+name);           
			//file to be delete  
			if(f.delete())                      
				//returns Boolean value  
			{  
			System.out.println(f.getName() + " deleted");   
			//getting and printing the file name  
			}  
			else  
			{  
			System.out.println("File not found,"
					+ "Please give the correct name");  
			}  
			}  
			catch(Exception e)  
			{  
			e.printStackTrace();  
			}  

		}

		private static void searchFile() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the file name: \n");
			String name=sc.next();
			File f1 = new File(path+"\\"+name);
			if (f1.exists()) {

				System.out.println("File " + name + " is Found");
			} else {
				System.out.println("We cannot find your file");
			}

		}
	}

