package miniproject;

import java.util.*;
import java.text.*;
class SimpleDateFormatDemo
{
    static int n;
   static String s1;
	void date()
	{
		Date d = new Date();

		//Calendar c = Calendar.getInstance();
		//System.out.println(c);

		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.UK);
		String s = df.format(d);
               
		

		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd/MMM/yyyy");
		s = sdf.format(d);
                System.out.println("DATE: "+s);
                
                 sdf.applyPattern("hh:mm");
                 s = sdf.format(d); 
		System.out.println("TIME: "+s);
                
               sdf.applyPattern("hh");
                s = sdf.format(d);
              
               this.n = Integer.parseInt(s);
               sdf.applyPattern("mm");
                this.s1 = sdf.format(d);
               //System.out.println("TIME: "+(n+1));	
	}
        void d()
        {
            System.out.println("Delivery time="+(n+1)+":"+s1);
        
        }
}