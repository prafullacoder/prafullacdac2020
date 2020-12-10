package miniproject;

import java.util.*;
class Node
{
    int n1;
     int prize;
     String s;
     String name;
     long mob;
    
    Node next;
    Node(int n1,String name,long mob,int prize,String s)
    {
        this.n1=n1;
        this.name=name;
        this.mob=mob;
       this.prize=prize;
       this.s=s;
        next=null;
    }
}

class LinkList
{
   static Node start;
    static int length;
   // LinkList()
    //{
        //start=null;
        //length=0;
    //}
    //==================================================
    static void insertEnd(int n1,String name,long mob,int prize,String s)
    {
        Node nd=new Node(n1,name,mob,prize,s);
        if(start==null)
        {
            start=nd;
        }
        else
        {
            Node n=start;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=nd;
            
        }
        length++;
    }
     //======================================================
      static void display()
    {
        Node n=start;
        if(length==0)
        {
            System.out.println("EMPTY ORDERED LIST");
        }
        else
        {
        while(n.next!=null)
        {
            System.out.println("ORDERED ID="+n.n1);
            System.out.println("CUSTOMER NAME="+n.name);
            System.out.println("CUSTOMER MOBILE NO="+n.mob);
            System.out.println("PAYABLE AMMOUNT="+n.prize+"Rs");
            System.out.println(n.s);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            n=n.next;
        }
          System.out.println("ORDERED ID="+n.n1);
          System.out.println("CUSTOMER NAME="+n.name);
          System.out.println("CUSTOMER MOBILE NO="+n.mob);
          System.out.println("PAYABLE AMMOUNT="+n.prize+"Rs");
          System.out.println(n.s);
          System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
       //=========================================================
      static void deletBeg()
       {
           Node n=start;
           if(length==0)
           {
               System.out.println("EMPTY ORDERED LIST");
           }
           else
           {
               if(length==1)
               {
                   start=null;
               }
               else
               {
                    start=n.next;
               }    
           }
           length--;
       }
       //===============================================================
}