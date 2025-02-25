class Solution {
    public String solution(String code) {
        String answer = "";
        String tmp = "";
        
        int mode = 0;
        
        for(int idx=0; idx<code.length(); idx++) {
        	
        	tmp = code.substring(idx, idx+1);
        	
        	if(mode == 0) {
        		if( !"1".equals(tmp) && idx % 2 == 0 ) 
        		{
        			answer += tmp;
        		} else if("1".equals(tmp)) mode = 1;
        	}
        	else if(mode == 1) {
        		if( !"1".equals(tmp) && idx %2 != 0 ) {
        			answer += tmp;
        		} else if("1".equals(tmp)) mode = 0;
        	}
        }
        
        if("".equals(answer)) answer = "EMPTY";
        
        return answer;
    }
}
