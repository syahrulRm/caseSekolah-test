/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.math.BigDecimal;

 class test {
     public static void main(String[] args) {
        
         int x;
         double f = 0.33 ;
         char c = 'a';
         String s = "abcd";
         x  = 55 ;
         System.out.println( x);
         System.out.println( f);
         System.out.println( c);
         System.out.println( s);
         
         BigDecimal r = BigDecimal.ZERO;
         
         x = 34 ;
        int y = 0x3ef ;
         int z = 0772 ;
         long m = 240395922L ;
         
         System.out.println( "y :"  + y);    //hexadecimal
         System.out.println( "z :"+ z);     //octal
         System.out.println( "m :" + m);    // long
         
        double d = 6.28;
        float ff = 6.28F;
        
        System.out.println( "d :"+ d);     
        System.out.println( "ff :" + ff);
        
        char t = 'a' ;
        char g ='\n' ;
        char n = '\u2122' ;
        
        System.out.println( t );
        System.out.println( g );
        System.out.println( n );
        
        boolean ready = true;
        boolean late = false ;
        
        System.out.println(ready);
        System.out.println(late);
        
        final double pi = 3.1415;
        final int maxSize = 100;
        final char lastLetter = 'z';
        final String word = "Hello";
        
        System.out.println(pi);
        System.out.println( maxSize );
        System.out.println( lastLetter );
        System.out.println( word );
    }
}
