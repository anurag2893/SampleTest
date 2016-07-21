package com.test;

import java.io.FileWriter;
import java.io.IOException;



public class GeneralActions {

	public static void returnAssert() throws IOException
	{
	String[] word=Utility_input.input();
	if(word[0].equals(word[1]))
	{
		Utility_output.output("equal words");
	}
	else
		Utility_output.output("not equal");
	
		
	}
	private static final String NEW_LINE_SEPARATOR = "\n";
	public static void primeOrNot() throws IOException
	{
		String[] num=Utility_input.input2();
		for(int i=0;i<num.length;i++){
			int number=Integer.parseInt(num[i]);
			
			
		
			int j,m=0,flag=0;      
			  
			m=number/2;    
			  
			for(j=2;j<=m;j++)
			{    
			   
				if(number%j==0)
					{    
						//System.out.println("Number is not prime");    
						flag=1;    
						break;    
					}    
			}    
			      
			  
				  FileWriter fileWriter = null;
		 	       
		 	        try {
		 	        	 fileWriter = new FileWriter("test_2_output.csv");
		 	            String prime="Prime number";
		 	            String notprime="Not a Prime number";
		 	            if(flag==0)
		 	            	{
		 	            		fileWriter.append(String.valueOf(prime));
		 
		 	            		fileWriter.append(NEW_LINE_SEPARATOR);
		 	            	}
		 	            else if(flag==1)
		 	            	{
		 	            		fileWriter.append(String.valueOf(notprime));
		 	      	 
		 	            		fileWriter.append(NEW_LINE_SEPARATOR);
		 	            	}
		 	        
		 	            System.out.println("CSV file was created successfully !!!");
		 
		 	             
		 
		 	        }
		 	    	catch (Exception e) 
		 	        {
		 
		 	            System.out.println("Error in CsvFileWriter !!!");
		 
		 	            e.printStackTrace();
		 
		 	        } 
		 	        finally 
		 	        {
		 	        	try {
							//fileWriter.flush();
							fileWriter.close();
						} catch (IOException e) {
							
							e.printStackTrace();
						}
		 	        	
		 	        }		
		}
	}
	
	
}
