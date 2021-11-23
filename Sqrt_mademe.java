/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagedemo;

import java.util.Scanner;

/**
 *
 * @author Shivam
 */
public class Sqrt_mademe {
  
    // double num;
    //public void setDim( double n){
    //     num=n;
        
    
    public void sqrtMethod()
    {
        double num;
        double d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14;
        double d15;
       System.out.println("Enter the num = ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextDouble();
        d1=num/2;
        d2=num/d1;
        d3=(d2+d1)/2;
        d4=d1-d3;
        d5=num/d3;
        d6=(d5+d3)/2;
        d7=d3-d6;
        d8=num/d6;
        d9=(d8+d6)/2;
        d10=d6-d9;
        d11=num/d9;
        d12=(d11+d9)/2;
        d13=d9-d12;
        d14=num/d12;
        d15=(d14+d12)/2;
        
        System.out.println(+num+ " sqrt of = "+d15);
    }
}

