import com.sun.tools.doclets.internal.toolkit.util.SourceToHTMLConverter;
import java.util.*;
/**
 * Created by jhalaac on 24/08/15.
 */
public class jhalaa {
    int t =0;
    String itemname[10];
    float itemprice[10];
    boolean imported[10];
    int quantity[10];
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
            float totprice;
            
            System.out.println(quantity[j]+itemname[j]+":"+totprice);
        }
    }
}
