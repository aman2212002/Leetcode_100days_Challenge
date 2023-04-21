class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean a=false;
        if(s.length()!=t.length()){
            return a;
        }
        Map<Character,Character> map=new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char s2=t.charAt(i);
            if(map.containsKey(s1)){
                if (map.get(s1) != s2){
                 return a;
                }
			}
            else{
  			    if (set.contains(s2)){
                return a;
                  }
				map.put(s1,s2);
				set.add(s2);
			}
       
        }
        return true;

    }
}