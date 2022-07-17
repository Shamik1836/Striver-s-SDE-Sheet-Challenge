
import java.util.*;
class meet{
    int meetingID;
    int startTime;
    int endTime;
    public meet(int val){
        this.meetingID=val;
        this.startTime=val;
        this.endTime=val;
    }
}
public class Maximum_Meetings {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        int n=start.length;
        List<meet> meeting=new ArrayList<meet>();
        for (int i=0;i<n;i++){
            meet temp=new meet(0);
            temp.meetingID=i+1;
            temp.startTime=start[i];
            temp.endTime=end[i];
            meeting.add(temp);
        }
        meeting.sort(new Comparator<meet>(){
            public int compare(meet o1,meet o2){
                if (o1.endTime==o2.endTime){
                    return o1.meetingID-o2.meetingID;
                }
                return o1.endTime-o2.endTime;
            }
        });
        List<Integer> res=new ArrayList<Integer>();
        res.add(meeting.get(0).meetingID);
        int curr=meeting.get(0).endTime;
        for (int i=1;i<n;i++){
            if (meeting.get(i).startTime>curr){
                res.add(meeting.get(i).meetingID);
                curr=meeting.get(i).endTime;
            }
        }
        return res;
    }
}