public class Compare_Version_Numbers
{
    public static int compareVersions(String a, String b) 
    {


        a = removeZerosFromEnd(a);
        b = removeZerosFromEnd(b);


        int start1 = 0, start2 = 0, end1 = 0, end2 = 0;


        while (true) 
        {

       
            while (end1 < a.length() && a.charAt(end1) != '.')
            {
                end1++;

            }


            while (end2 < b.length() && b.charAt(end2) != '.') 
            {
                end2++;
            }

            // Finding the greater one among end1 and end2
            if (end1 > end2) 
            {
                return 1;
            } 
            else if (end1 < end2) 
            {
                return -1;
            }

            
            for (int i = start1; i < end1; i++) 
            {
                if (a.charAt(i) > b.charAt(i)) 
                {
                    return 1;
                } 
                else if (b.charAt(i) > a.charAt(i))
                {
                    return -1;
                }

            }

            if (end1 == a.length() && end2 == b.length()) 
            {
                return 0;
            }

     
            if (end1 == a.length()) 
            {
                return -1;
            }

      
            if (end2 == b.length()) 
            {
                return 1;
            }
            
            
            start1 = end1;
            start2 = end2;
            end1++;
            end2++;

        }
    }


    private static String removeZerosFromEnd(String a) 
    {

        int p = a.length() - 1;

        for (int i = a.length() - 1; i >= 1; i -= 2) 
        {

          
            if (a.charAt(i) == '0' && a.charAt(i - 1) == '.') 
            {
                p -= 2;
            }

          
            else 
            {
                break;
            }

        }

      
        return a.substring(0, p + 1);
    }
}