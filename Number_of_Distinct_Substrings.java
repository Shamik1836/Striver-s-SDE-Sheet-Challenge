// Trie Approach
public class Number_of_Distinct_Substrings
{
    static class Node{
         Node links[]=new Node[26];
         public Node(){
             
         }
         boolean containsKey(char ch){
             return (links[ch-'a'] != null);
         }
         Node get(char ch){
             return links[ch-'a'];
         }
         void put(char ch,Node node){
             links[ch-'a']=node;
         }
     }
     public static int distinctSubstring(String word) {
         // Write your code here.
         Node root=new Node();
         int n=word.length();
         int cnt=0;
         for (int i=0;i<n;i++){
              Node node=root;
             for (int j=i;j<n;j++){
                 if (!node.containsKey(word.charAt(j))){
                     node.put(word.charAt(j),new Node());
                     cnt++;
                 }
                 node=node.get(word.charAt(j));
             }
         }
         return cnt;
     }
 }
 