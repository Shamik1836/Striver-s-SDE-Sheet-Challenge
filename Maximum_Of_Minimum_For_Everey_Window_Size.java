

import java.util.Stack;
public class Maximum_Of_Minimum_For_Everey_Window_Size
{
    public static int[] maxMinWindow(int[] arr, int n) 
    {

        int[] answer = new int[n];
        
        for (int i = 0; i < n; ++i) 
        {
            answer[i] = Integer.MIN_VALUE;
        }

      
        int[] next = nextSmaller(arr, n);


        int[] prev = previousSmaller(arr, n);

        for (int i = 0; i < n; i++) 
        {
          
            int length = next[i] - prev[i] - 1;
      
            answer[length - 1] = Math.max(answer[length - 1], arr[i]);
        }
      
        for (int i = n - 2; i >= 0; i--) 
        {
            answer[i] = Math.max(answer[i], answer[i + 1]);
        }

        return answer;
    }

    private static int[] previousSmaller(int[] arr, int n) 
    {
        int[] prev = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < n; i++) 
        {
            while (!s.empty() && arr[s.peek()] >= arr[i]) 
            {
                s.pop();
            }
            
            if (s.empty()) 
            {
                prev[i] = -1;
            } 
            else 
            {
                prev[i] = s.peek();
            }
            
            s.push(i);
        }
        
        return prev;
    }

    private static int[] nextSmaller(int[] arr, int n) 
    {
        Stack<Integer> s = new Stack<>();
        int[] next = new int[n];
    
        for (int i = n - 1; i >= 0; i--) 
        {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) 
            {
                s.pop();
            }
            
            if (s.empty()) 
            {
                next[i] = n;
            } 
            else 
            {
                next[i] = s.peek();
            }
            
            s.push(i);
        }
        
        return next;
    }

}
