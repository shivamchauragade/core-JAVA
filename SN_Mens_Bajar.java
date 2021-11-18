/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/**
 *
 * @author Shivam
 */import java.util.Scanner;
class SN_MensBajar
{
     Scanner scan=new Scanner(System.in);
    int sr, i, quantity[]=new int[20];
    String name, item[]=new String[20];
    float price[]=new float[20];
    float amount[]=new float[20];
    float taxAmount, tax, totalAmount, taxTotalAmount;

    SN_MensBajar() 
    {
        
    }
    public void setProductName_price()
    {
        
       System.out.println("Enter the following details:- ");
            System.out.println("\n\nEnter the name of Buyer: ");
            name=scan.nextLine();
            System.out.println("Enter the number of total items purchased(Sr.No.): ");
            sr=scan.nextInt();
            for(i=1; i<=sr; i++){
                System.out.println("Enter the Name of "+i+" item: ");
                item[i]=scan.next();
            }
            for(i=1; i<=sr; i++){
                System.out.println("Enter the Price of \""+item[i]+"\": ");
                price[i]=scan.nextFloat();
            }
            for(i=1; i<=sr; i++){
                System.out.println("Enter the Quantity of \""+item[i]+"\": ");
                quantity[i]=scan.nextInt();
            } 
    }
    public void cal(){
        for(i=1; i<=sr; i++){
            amount[i]=price[i]*quantity[i];
            totalAmount+=amount[i];
        }
        
 }
    public void display(){
        System.out.println("\t\t\t  || श्री गणेशाय नमः ||");
        System.out.println("\t  ============*=*=*SN MENS BAJAR=*=*=*==============");
        System.out.println("\t\tOPP BAIDYANATH BUILDING KOTHARI ARCH \n\t\t\tCOMPLEX MAIN ROAD\n\t\t       AMRAVATI MAHARASHTRA \n\t\t      CONTACT NO 7447320336");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("To :"+name);
        System.out.println("----------------------------------------------------------------------------------------------------");
        
        System.out.println("Sr.No.\tITEM\t\tPrice\t\tQuantity\tAmount");
        for(i=1; i<=sr; i++)
            System.out.println(i+"\t"+item[i]+"\t\t"+price[i]+"\t\t"+quantity[i]+"   \t\t"+amount[i]);
        System.out.println("----------------------------------------------------------------------------------------------------");
        
        System.out.println("\t\t\t\t\t Total:-        "+totalAmount);
        System.out.println("----------------------------------------------------------------------------------------------------");
        
    }
       
                
}
    


public class SN_Mens_Bajar 
{
    public static void main(String[] args)
    {
        while(true){
        SN_MensBajar sc=new SN_MensBajar();
        sc.setProductName_price();
        sc.cal();
        sc.display();
        
        
          
    }
}
}

