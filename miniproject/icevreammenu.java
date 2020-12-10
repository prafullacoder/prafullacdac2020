package miniproject;

import java.util.*;
class ICECREAM
{
    Scanner sc=new Scanner(System.in);
    void displayMenu()
    {
        int choice;
        do
        {
            System.out.println("**ICECREAM MENU**");
            System.out.println("1 = VANILLA : prize=70\n2 = STRAWBERRY : prize:70\n3 = BUTTERSCOTCH : prize:90\n4 = CHOCOLATE : prize:90\n5 = BLACKCURRANT : prize:90\n6 = KESARPISTA : prize:100\n0 = EXIT");
            System.out.println("$$ENTER YOUR CHOICE$$");
            choice=sc.nextInt();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            switch(choice)
            {
                case 1:
                    
                    VANILLA it1=new VANILLA();
                    it1.display();
                    it1.sent();
                    System.out.println("*$$ ADD ITEMS IN ICECREAM MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 2:
                         
                    STRAWBERRY it2=new STRAWBERRY();
                    it2.display();
                    it2.sent();
                    System.out.println("*$$ ADD ITEMS IN ICECREAM MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 3:
                   
                    BUTTERSCOTCH it3=new BUTTERSCOTCH();
                    it3.display();
                    it3.sent();
                    System.out.println("*$$ ADD ITEMS IN ICECREAM MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                case 4:
                  
                    CHOCOLATE it4=new CHOCOLATE();
                    it4.display();
                    it4.sent();
                    System.out.println("*$$ ADD ITEMS IN ICECREAM MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 5:
                  
                    BLACKCURRANT it6=new BLACKCURRANT();
                    it6.display();
                    it6.sent();
                    System.out.println("*$$ ADD ITEMS IN ICECREAM MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
               
                case 6:
                  
                    KESARPISTA it10=new KESARPISTA();
                    it10.display();
                    it10.sent();
                    System.out.println("*$$ ADD ITEMS IN ICECREAM MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
            }
        }while(choice!=0 && choice!=100);
    }
}