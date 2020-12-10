package miniproject;
import java.util.*;
class Veg
{
    Scanner sc=new Scanner(System.in);
    void displayMenu()
    {
        int choice;
        do
        {
            System.out.println("**VEGETARIAN MENU**");
            System.out.println("1 = DALMAKHANI : prize=160\n2 = DALTADKA : prize:140\n3 = SHAHIPANEER : prize:200\n4 = PANEERTIKKA : prize:200\n5 = MULAIKOfTA : prize:200\n6 = MIXEDVEG : prize:200\n7 = MUSHROOMTIKKA : prize:180\n8 = HARABHARAKABAB : prize:160\n9 = AALOOGOBHI : prize:140 \n10 = SOYACHAP : prize:160\n0 = EXIT");
            System.out.println("$$ENTER YOUR CHOICE$$");
            choice=sc.nextInt();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            switch(choice)
            {
                case 1:
                    
                    DALMAKHANI it1=new DALMAKHANI();
                    it1.display();
                    it1.sent();
                    System.out.println("*$$ ADD ITEMS IN VEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                case 2:
                   
                    DALTADKA it2=new DALTADKA();
                    it2.display();
                    it2.sent();
                    System.out.println("*$$ ADD ITEMS IN VEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 3:
                   
                    SHAHIPANEER it3=new SHAHIPANEER();
                    it3.display();
                    it3.sent();
                    System.out.println("*$$ ADD ITEMS IN VEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 4:
                  
                    PANEERTIKKA it4=new PANEERTIKKA();
                    it4.display();
                    it4.sent();
                    System.out.println("*$$ ADD ITEMS IN VEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 5:
                  
                    MULAIKOfTA it5=new MULAIKOfTA();
                    it5.display();
                    it5.sent();
                    System.out.println("*$$ ADD ITEMS IN VEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 6:
                  
                    MIXEDVEG it6=new MIXEDVEG();
                    it6.display();
                    it6.sent();
                    System.out.println("*$$ ADD ITEMS IN VEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                
                case 7:
                  
                    MUSHROOMTIKKA it7=new MUSHROOMTIKKA();
                    it7.display();
                    it7.sent();
                    System.out.println("*$$ ADD ITEMS IN NONVEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 8:
          
                    HARABHARAKABAB it8=new HARABHARAKABAB();
                    it8.display();
                    it8.sent();
                    System.out.println("*$$ ADD ITEMS IN VEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
             
                case 9:
                    
                    AALOOGOBHI it9=new AALOOGOBHI();
                    it9.display();
                    it9.sent();
                    System.out.println("*$$ ADD ITEMS IN VEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
                    
                case 10:
                  
                    SOYACHAP it10=new SOYACHAP();
                    it10.display();
                    it10.sent();
                    System.out.println("*$$ ADD ITEMS IN VEG MENU SELECT CHOICE FROM MENUCARD$$\n$$ ADD ITEMS IN DIFFERENT MENU SELECT 100$$* \n !!!FOR SUBMIT PRESS 0!!!");
                    System.out.println("========================================");
                    break;
            }
        }while(choice!=0 && choice!=100);
    }
}