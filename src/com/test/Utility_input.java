package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utility_input {
	public static String[] input() throws IOException{
	String csvfile="test_1_input.csv";
	BufferedReader br=null;
	String line="";
	String linesplitby=",";
	String[] word=null;
	try {
		br=new BufferedReader(new FileReader(csvfile));
		while((line=br.readLine())!=null){
		word=line.split(linesplitby);
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	return word;
	}
	public static String[] input2() throws IOException
	{
		String csvfile="test_2_input.csv";
		BufferedReader br=null;
		String line="";
		String linesplitby=",";
		String[] word=null;
		try {
			br=new BufferedReader(new FileReader(csvfile));
			while((line=br.readLine())!=null){
			word=line.split(linesplitby);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		return word;
	}
}
