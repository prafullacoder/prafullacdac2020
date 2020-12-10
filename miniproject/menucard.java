package miniproject;
import java.util.*;

class Menu
{
    void menu(int n1)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO **FOOD** WORLD");
        System.out.println("**************************************************************************");
        int choice;
        do
        {
            System.out.println("$$$ MENU CARD $$$");
            System.out.println("1 = VEGETARIAN FOOD\n2 = NONVEGETARIAN FOOD\n3 = ICE CREAM\n0 = FOR SUBMIT AND GENERATE BILL");
            System.out.println("ENTER YOUR $$CHOICE$$");
            choice=sc.nextInt();
            System.out.println("========================================================================");
            switch(choice)
            {
                case 1:
                    Veg v =new Veg();
                    v.displayMenu();
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    break;
                case 2:
                    NonVeg Nv = new NonVeg ();
                    Nv.displayMenu();
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    break;
                case 3:
                    ICECREAM ice = new ICECREAM ();
                    ice.displayMenu();
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    break;
            }
        }while(choice!=0);
                     System.out.println("####Enter Your no:####");
                     long mob=sc.nextLong();
                 System.out.println("####Enter Your Name:####");
                    sc.nextLine();
                    String s = sc.nextLine();
                   
                    Display d=new Display();
                     d.display(s,mob,n1);
                     Display d1=new Display(0);
                
                  
    }
}