package com.alam.GitProj;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data1,String data2) {
		if(data1.equalsIgnoreCase(Constant.DATA_TYPE)) {
		System.out.println("your data1 is "+data1);
		}
		else {
		System.out.println("your data2 is "+data2);
		}
		
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Changes in main method " );
	    System.out.println( "Some Changes in main method from reomte " );
	    
    }
}
