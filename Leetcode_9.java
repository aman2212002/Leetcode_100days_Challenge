class Solution {
    public boolean isPalindrome(int x) {
    String a=Integer.toString(x);
    StringBuilder sc =new StringBuilder(a);
    String b=sc.reverse().toString();
    if(a.toLowerCase().equals(b.toLowerCase())){
        return true;
    }else{
        return false;
    }
    }
}