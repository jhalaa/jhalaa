import com.sun.tools.doclets.internal.toolkit.util.SourceToHTMLConverter;

import java.text.DecimalFormat;
import java.util.*;
/**
 * Created by jhalaac on 24/08/15.
 */
public class jhalaa {
    int t =0;
    String[] itemname;
    float[] itemprice;
    boolean[] imported;
    int[] quantity;
    boolean[] istaxable;
    int i=0;
     void accept()
    {

        Scanner s=new Scanner(System.in);
        System.out.println("tell us about your list");
        while(t==0)
        {

            System.out.printf("item name:");
            itemname[i]=s.nextLine();
            System.out.printf("item price:");
            itemprice[i]=s.nextFloat();
            System.out.printf("item quantity:");
            quantity[i]=s.nextInt();
            System.out.println("is it taxable,ie,is it book or food or medical stuff");
            istaxable[i]=s.nextBoolean();
            System.out.printf("is it imported?:");
            imported[i]=s.nextBoolean();
            i++;
            System.out.println("press 0 to continue or 1 to print the bill");
            t=s.nextInt();

        }
        }
    void printdetails()
    {
        for(int j=0;j<i;j++)
        {
            DecimalFormat df=new DecimalFormat("#.##");
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
