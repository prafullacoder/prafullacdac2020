package miniproject;
import java.util.*;
class Admin
{
    Scanner sc=new Scanner(System.in);
    int n;
    void admin()
    {
        do
        {
            System.out.println("1=DISPLAY ORDERED LIST\n2=SEND TO DELIVERY\n0=EXIT");
            System.out.println("Enter your choice");
            n=sc.nextInt();
            System.out.println("=====================================================");
            switch(n)
            {
                case 1:
                    System.out.println("###DISPLAY ORDERED LIST :###");
                    LinkList.display();
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    break;
                case 2:
                    System.out.println("###ORDER DELIVER SECESSFULL###");
                    LinkList.deletBeg();
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    break;
            }
        }while(n!=0);
        
    }
}