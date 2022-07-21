
/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/
public class The_Celebrity_Problem
{
    public static int findCelebrity(int n) {

        int p = 0, q = n - 1; 

        while(p < q) {
            if(Runner.knows(p, q)) {
   
                p++;  
            }
            else {

                q--; 
            }
        }

        int celebrity = p;
        boolean knowAny = false, knownToAll = true;

   
        for(int i = 0; i < n; i++) {
            if(Runner.knows(celebrity, i)) {
                knowAny = true;
                break;
            }
        }

       
        for(int i = 0; i < n; i++) {
            if(i != celebrity && !Runner.knows(i, celebrity)) {
                knownToAll = false;
                break;
            }
        }

        if(knowAny || !knownToAll) {

            celebrity = -1;
        }

        return celebrity;
    }
}
  