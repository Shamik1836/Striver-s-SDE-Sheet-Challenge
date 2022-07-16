
}
import java.util.*;
import javafx.util.*;
public class Maximum_Activities {
    public static int maximumActivities(List<Integer> start, List<Integer> finish) {
        int n = start.size();
        List<Pair<Integer, Integer>> activity = new ArrayList<Pair<Integer, Integer>>();

        for (int i = 0; i < n; i++){   
            Pair <Integer, Integer> temp =  new Pair <Integer, Integer> (finish.get(i), start.get(i)); 
            activity.add(temp);
        }

   
        activity.sort(new Comparator<Pair<Integer, Integer>>() {    

            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());  
            }               
        });

        int maxActivity = 1;
        int currentTime = activity.get(0).getKey();

        for(Pair<Integer, Integer> p: activity) {
           
            if (p.getValue() >= currentTime) {
                maxActivity++;
                currentTime = p.getKey();
            }
        }
        return maxActivity;
    }

}