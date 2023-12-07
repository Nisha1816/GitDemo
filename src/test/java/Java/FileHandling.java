	package Java;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class FileHandling {

		public static void createdirectory(String filepath) {
			File f = new File(filepath);  
	        // check if the directory can be created
	        // using the abstract path name
	        if (f.mkdir()) {
	            // display that the directory is created
	            // as the function returned true
	            System.out.println("Directory is created");
	        }
	        else {
	            // display that the directory cannot be created
	            // as the function returned false
	            System.out.println("Directory cannot be created");
	        }
		}
		
		public static String getabsolutepathforfile(String filename) {
			File file = new File(filename);
			return file.getAbsolutePath();
		}
		
		public static void createfile(String filename) {
			try {
			      File myObj = new File(filename);
			      if (myObj.createNewFile()) {
			        System.out.println("File created: " + myObj.getName());
			      } else {
			        System.out.println("File already exists.");
			      }
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}
		
		public static void writeintofile(String filename, String datatowrite) {
			try {
				
				 FileWriter myWriter = new FileWriter(filename,true);
			     BufferedWriter bufferedWriter = new BufferedWriter(myWriter);
				  myWriter.write(datatowrite);
				  myWriter.write('\n');
				  myWriter.flush();
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}
		
		public static void readfile(String filename) {
			 try {
			      File myObj = new File(filename);
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}

		public static String readfileline(String filename,int linenumber) {
			 String linedata = null;
			 boolean flag = false;
			 int linecounter = 1;
			try {
			      File myObj = new File(filename);
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        if(linecounter==linenumber) {
			        	linedata = data;
			        	flag = true;
			        }
			        //System.out.println(data);
			        linecounter++;
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			if(flag) System.out.println("File line number exists");
			else {
				System.out.println("File line number is not exists");
			    System.out.println("File has only " +(linecounter-1)+ " line(s)");}
			
			return linedata;
		}
		public static String createfileinfolder(String filename) {
			createdirectory("C:\\Users\\Acer\\eclipse-workspace\\AndroidTest\\resources");
			String pathname = getabsolutepathforfile(filename);
			System.out.println("pathname is:"+pathname);
			int index = pathname.indexOf(filename);
			pathname = pathname.substring(0, index-1).concat("\\resources\\").concat(filename);
			System.out.println(pathname);
			createfile(pathname);
			return pathname;
		}
		
		public static void main(String[] args) {
			
		String filename = "vipultxtfile.txt";
		
		String pathname = createfileinfolder(filename);
		
		writeintofile(pathname, "Hello This is Vipul here");
		writeintofile(pathname, "Second Line");
		writeintofile(pathname, "Third Line");
		
		readfile(pathname);
		
		String linedata = readfileline(pathname,10);
		
		System.out.println("Line Data : "+linedata);
		
			//
			// To check that file is readable or not.
			File file = new File(pathname);
			if (file.canRead())
				System.out.println("File is readable");
			else
				System.out.println("File is not readable");

			// To check that file is writable or not.

			if (file.canWrite())
				System.out.println("File is Writable");
			else
				System.out.println("File is not Writable");

			// To check that file is exists or not.
			// To check that name of the file.
			//

			if (file.exists()) {
				System.out.println("File is exists name of the file is : " +file.getName());
				System.out.println("File is exists Path of the file is : " +file.getAbsolutePath());
				}
			else
				System.out.println("File is not exists");
			
			File file1 = new File("C:\\Users\\Acer\\eclipse-workspace\\AndroidTest");
			//Reading the file data through list function.
			//
			String[] filedata = file1.list();
			for(String data : filedata) {
				System.out.println(data);
			}
			//
			//Delete the file 
//			if(file.delete()) {
//				 System.out.println("Deleted the file: " + file.getName());
//			}
//			else
//				System.out.println("Failed to delete the file.");
		}//End of main function
	}//End of Class
