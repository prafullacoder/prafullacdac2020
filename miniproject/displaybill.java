package miniproject;


class Display extends SimpleDateFormatDemo
{
    
    static int prize;
    static String s1="SELECTED ITEMS\n";
 
    Display()
    {
       
    }
    Display(int prize)
    {
        this.prize=prize;
        s1="SELECTED ITEMS\n";
    }
    void set(int amt,String s1)
    {
        this.prize=this.prize+amt;
        this.s1=this.s1+s1;
    }
    void display(String s,long mob,int n)
    {
        System.out.println("\n\n=================================##BILL##==============================================");
        System.out.println("          $$$  YOUR ORDERED SCESSFULLY DONE  $$$");
        date();
        System.out.println("NAME      ="+s+"\nMOBILE NO="+mob+"\nORDERED ID="+n);
       
        System.out.println(s1);
        
        System.out.println("          \nPayable Ammount="+prize+"Rs");
        d();
       
        System.out.println("\n\n=================================THANK YOU=============================================");
        
            //DoubleLinkList d1=new DoubleLinkList();
        LinkList.insertEnd(n,s,mob,prize,s1);
       
       
    }

}