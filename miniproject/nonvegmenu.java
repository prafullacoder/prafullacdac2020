package miniproject;

import java.util.*;
class NonVeg
{
    Scanner sc=new Scanner(System.in);
    void displayMenu()
    {
        int choice;
        do
        {
            System.out.println("**NONVEGETARIAN MENU**");
            System.out.println("1 = TANDOORICHICKEN : prize=360\n2 = BUTTERCHICKEN : prize:300\n3 = CHICKENHANDI : prize:350\n4 = CHICKENTANGRI : prize:250\n5 = MUTTONKORMA : prize:280\n6 = MUTTONKABAB : prize:250\n7 = EGGCURRY : prize:140\n8 = FISHCURRY : prize:300\n9 = FISHSURMAI : prize:330 \n10 = FISHPAMPHLET : prize:350\n0 = EXIT");
            System.out.println("$$ENTER YOUR CHOICE$$");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    
                    TANDOORICHICKEN it1=new TANDOORICHICKEN();
                    it1.display();
                    it1.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                case 2:
                   
                    BUTTERCHICKEN it2=new BUTTERCHICKEN();
                    it2.display();
                    it2.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 3:
                   
                    CHICKENHANDI it3=new CHICKENHANDI();
                    it3.display();
                    it3.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 4:
                  
                    CHICKENTANGRI it4=new CHICKENTANGRI();
                    it4.display();
                    it4.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 5:
                  
                    MUTTONKORMA it5=new MUTTONKORMA();
                    it5.display();
                    it5.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 6:
                  
                    MUTTONKABAB it6=new MUTTONKABAB();
                    it6.display();
                    it6.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                
                case 7:
                  
                    EGGCURRY it7=new EGGCURRY();
                    it7.display();
                    it7.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 8:
          
                    FISHCURRY it8=new FISHCURRY();
                    it8.display();
                    it8.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
             
                case 9:
                    
                    FISHSURMAI it9=new FISHSURMAI();
                    it9.display();
                    it9.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 10:
                  
                    FISHPAMPHLET it10=new FISHPAMPHLET();
                    it10.display();
                    it10.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
            }
        }while(choice!=0 && choice!=100);
    }
}