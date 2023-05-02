import java.util.*;
import java.lang.Character;
class Solution {
    public boolean isAnagram(String s, String t) {
        
         char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
          arr[i]=s.charAt(i);
        }
        Arrays.sort(arr);
        char arr1[]=new char[t.length()];
        for(int i=0;i<t.length();i++){
            arr1[i]=t.charAt(i);
        }
         Arrays.sort(arr1);
        if(Arrays.equals(arr1,arr)){
            return true;
        }else{
            return false;
        }
        
        
    }
}