import com.sun.tools.doclets.internal.toolkit.util.SourceToHTMLConverter;

import java.text.DecimalFormat;
import java.util.*;
/**
 * Created by jhalaac on 24/08/15.
 */
public class jhalaa {
    boolean t =true;
    String[] itemname=new String[10];
    float[] itemprice=new float[10];
    boolean[] imported=new boolean[10];
    int[] quantity=new int[10];
    boolean[] istaxable=new boolean[10];
    int i=0;
     void accept()
    {

        Scanner s=new Scanner(System.in);
        System.out.println("tell us about your list");
        while(t)
        {

            System.out.println("item name:");
            itemname[i]=s.nextLine();
            System.out.println("item price:");
            itemprice[i]=s.nextFloat();
            System.out.println("item quantity:");
            quantity[i]=s.nextInt();
            System.out.println("is it taxable,ie,is it book or food or medical stuff");
            istaxable[i]=s.nextBoolean();
            System.out.printf("is it imported?:");
            imported[i]=s.nextBoolean();
            i++;
            System.out.println("do you want to add another item?true/false");
            t=s.nextBoolean();
            //System.out.println(t+" "+i);

        }
        }
    void printdetails()
    {
        for(int j=0;j<i;j++)
        {
            //DecimalFormat df=new DecimalFormat("#.##");
            double totprice;
            double tax1=0;
            double tax2=0;
            totprice=itemprice[j]*quantity[j];
            if(istaxable[j]){
                tax1=1.1*totprice;
                //tax1=df.format(tax1);

            }
            if(imported[j])
            {
                tax2=0.5*totprice;
            }
            totprice=totprice+tax1+tax2;
            System.out.println(quantity[j]+itemname[j]+":"+totprice);
        }
    }

    public static void main(String[] args) {
        jhalaa j=new jhalaa();
        j.accept();
        j.printdetails();
    }
}
