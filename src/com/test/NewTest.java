package com.test;


//import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;


public class NewTest {

	
  @Test
  public void firstTest() throws IOException 
  {
	  GeneralActions.returnAssert(); 
  }
  
  
  @Test
  public void secondTest() throws IOException
  {
	  GeneralActions.primeOrNot();
  }
 

}
