/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author VSA
 */
public class HelloWorld {
    private static int MAX_C_ARR=20;
    
    public static void main(String[] args) {
        Min2();        
    }
    
    //пошук другого мінімального числа 
    //тут рішення далеко від оптимального, є кращі, але це перше на що мене вистачило :)
    private static void Min2(){
        // TODO code application logic here                
        Scanner sc=new Scanner(System.in);
        
        int min    = Integer.MAX_VALUE;
        int min2   = Integer.MAX_VALUE;                       
        
        int buf[];
        int i=0, cEl;
        
        buf = new int[MAX_C_ARR];
        
        while (sc.hasNextInt() && i<MAX_C_ARR){
            buf[i]=sc.nextInt();
            if (buf[i]<min)                
                min=buf[i];                       
            i++;
        }
        cEl=i-1;
        i=0;
        while (i<cEl){
            if (buf[i]<min2 && buf[i]!=min)
                min2=buf[i];  
            i++;
        }
        
        System.out.println(min2);
    }
    
    //
    
}
