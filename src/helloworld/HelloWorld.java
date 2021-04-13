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
        //Min2();        
        //GetPair1_15();
        //GetPT8();
        PrintStrNumTime();
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
    
    //виведеня парних чисел від 1 до 15
    private static void GetPair1_15()
    {        
        int i;        
        for(i=1; i<=15; i++){
            if (i%2 == 0)
                System.out.print(i+" ");
        }
    }
    
    //прямокутний трикутницк з 8
    private static void GetPT8()
    {
        int r, c;
        
        for(r=1; r<=10; r++){
            for(c=1; c<=r; c++)
                System.out.print("8");
            System.out.println("");
        }
    }
    
    //виведення вказного рядка вказану кількість разів
    private static void PrintStrNumTime()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str=sc.nextLine();
        
        System.out.print("Enter number: ");
        int number=sc.nextInt();
        
        if (number>0 && number<5){  
            int i=1;
            do{
                System.out.println(str);
                i++;
            } while(i<=number);
        }else
            System.out.println(str);                        
    }
    
}