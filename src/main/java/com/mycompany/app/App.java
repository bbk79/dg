package com.mycompany.app;

import javax.crypto.Cipher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    private void foo() {
        bar("DES"); // this should create a warning
    }
    
    private void bar(String s) {
        final Cipher c = Cipher.getInstance(s);
        c.doFinal();        
    }
}
