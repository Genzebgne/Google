package TestClass;

import org.testng.annotations.Test;

import simple.Example;

public class Testone 
{
	@Test
public void LoginTest()
{
		System.out.println("Test passed ==");
	Example exm = new Example();
	exm.google();
}

}
