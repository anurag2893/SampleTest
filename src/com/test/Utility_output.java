package com.test;

import java.io.FileWriter;
import java.io.IOException;

public class Utility_output {
	
	
	
	 
	 	    private static final String NEW_LINE_SEPARATOR = "\n";
	 
	 	    public static void output(String result) 
	 	    {
	 
	 	         FileWriter fileWriter = null;
	 	       
	 	        try {
	 	        	 fileWriter = new FileWriter("test_1_output.csv");
	 	            
	 	          
	 	            if(result.equals("equal words"))
	 	            	{
	 	            		fileWriter.append(String.valueOf(result));
	 
	 	            		fileWriter.append(NEW_LINE_SEPARATOR);
	 	            	}
	 	            else if(result.equals("not equal"))
	 	            	{
	 	            		fileWriter.append(String.valueOf(result));
	 	      	 
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
						fileWriter.flush();
						fileWriter.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
	 	        	
	 	        }
	 	        
	 	      }
}
