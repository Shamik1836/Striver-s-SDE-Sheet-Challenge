public class Complete_String{
    public TrieNode[] children = new TrieNode[26];
    public boolean isEnding = false;
  }
  
  class Solution {
  
    private static TrieNode root = new TrieNode();
  
    public static String completeString(int n, String[] a) {
  
      
      String ans = "";
  
      root=new TrieNode();
  
      
      for (final String word: a) {
        insert(word);
      }
  
     
      for (final String word: a) {
        
        if (!allPrefixed(word)) {
           continue;
        }
      
        if (ans.length() < word.length()) {
          ans = word;
        }
    
        else if (ans.length() == word.length() && ans.compareTo(word) > 0) {
          ans = word;
        }
      }
  
     
      if (ans.length() == 0) {
        ans = "None";
      }
  
     
      return ans;
    }
  
    
    private static void insert(final String word) {
      TrieNode node = root;
      for (final char c: word.toCharArray()) {
        final int i = c - 'a';
        
        if (node.children[i] == null) {
          node.children[i] = new TrieNode();
        }
        node = node.children[i];
      }
      
      node.isEnding = true;
    }
  
    private static boolean allPrefixed(final String word) {
      TrieNode node = root;
      for (final char c: word.toCharArray()) {
        final int i = c - 'a';
        node = node.children[i];
        
        if (!node.isEnding) {
          return false;
        }
      }
      
      return true;
    }
  }