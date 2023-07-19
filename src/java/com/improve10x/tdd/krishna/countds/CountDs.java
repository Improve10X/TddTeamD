package com.improve10x.tdd.krishna.countds;

public class CountDs {

    public int countDsAreThere(String words){
        int result = 0;
        for(int i = 0; i < words.length(); i++){
            char c = words.charAt(i);
            if(c == 'D'){
                result++;
            }else if(c == 'd'){
                result++;
            }
        }
        return result;
    }


}
