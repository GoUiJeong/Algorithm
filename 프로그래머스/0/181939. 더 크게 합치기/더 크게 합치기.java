class Solution {
    public int solution(int a, int b) {
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s11 = s1 + s2;
        String s22 = s2 + s1;
        int answer = Math.max(Integer.parseInt(s11), Integer.parseInt(s22));
        return answer;
    }
}