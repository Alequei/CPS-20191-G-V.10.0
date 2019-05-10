package com.tecsup.lab10.suma;

import org.junit.Assert;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest{

	@Test
    public void testApp()
    {
		
        Assert.assertTrue( true );
    }
	
	@Test
	public void testSuma(){
		int valor = 10;
		int n1=4;
		int n2=6;
		App app=new App();
		int suma=app.sumar(n1,n2);
		Assert.assertEquals(valor, suma);
		
	}
	
}
