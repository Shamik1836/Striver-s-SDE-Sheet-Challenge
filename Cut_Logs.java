
import java.util.*;

public class Cut_Logs
{ 
    static ArrayList < ArrayList < Integer > > dp = new ArrayList < ArrayList < Integer > > ();
    static int s = 1;

    public static void preComp() 
    {
        for (int a = 0; a < 15; a++) 
        {
            dp.add(new ArrayList < Integer > ());
            dp.get(a).add(0, 0);
        }

        int index = 1;
        int stop = 1;
        
        for (int i = 0; stop <= 1; i++) 
        {
            int cur = dp.get(3).get(i) + (i * (i + 1)) / 2 + 1;
            dp.get(3).add(index, cur);
            index++;
             
      
            if (cur > 10000) 
            {
                break;
            }
        }

        s = index;

        for (int i = 4; i <= 14; i++) 
        {
            index = 1;
            
            for (int j = 0; stop <= 1; j++) 
            {
                int cur = dp.get(i).get(j) + dp.get(i - 1).get(j) + 1;
                dp.get(i).add(index, cur);
                index++;
                
                if (cur > 10000) 
                {
                    break;
                }
            }
        }
    }

    public static int cutLogs(int k, int n) 
    {    
      
        if (k == 1) 
        {
            return n;
        }
        

        if (k == 2) 
        {
            return (int) Math.ceil((-1.0 + Math.sqrt(1 + 8 * n)) / 2.0);
        }

        if (s == 1) 
        {
            preComp();
        }
        
     
        k = Math.min(k, 14);

        int diff = 1000000, fin = -1;

        int ind = 0;

        for (int x = 0; x < dp.get(k).size(); x++)
        {

            if (dp.get(k).get(x) - n >= 0) 
            {
                if (dp.get(k).get(x) - n < diff) 
                {
                    diff = dp.get(k).get(x) - n;
                    fin = ind;
                }
            }

            ind++;
        }

        int ans = fin;
        return ans;
    }
}