    package miniproject;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int n1=1;
        do
        {
            System.out.println("1 = CUSTOMER ORDER\n2 = ADMIN\n0 =CLOSE PROGRAMME");
            System.out.println("ENTER YOUR CHOICE");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                    Menu m=new Menu();
                    m.menu(n1);
                  
                    n1++;
                    System.out.println("****************************************");
                    
                    break;
                case 2:
                    System.out.println("ENTER PASSWORD");
                    long password=sc.nextInt();
                    if(password == 2020)
                    {
                        Admin ad=new Admin();
                        ad.admin();
                    }
                    else
                    {
                        System.out.println("WRONG PASSWORD");
                    }
                    System.out.println("****************************************");
                    break;
              
            }
        }while(n!=0);
        System.out.println("PROGRAMME CLOSED");
    }
}