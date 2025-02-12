class Solution {
    public int solution(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        int result1 = 2*a*b;
        int result2 = Integer.parseInt(str1+str2);
        
        if (result1 >= result2) {
            return result1;
        } else {
            return result2;
        }
    }
}