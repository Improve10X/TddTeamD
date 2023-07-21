package com.improve10x.tdd.team.scoring;

public class Scoring {
    public int[] calculateScores(String score) {
        int[] result = new int[3];
        if(score != null) {
            for (int i = 0; i < score.length(); i++) {
                char c = score.charAt(i);
                if (c == 'A') {
                    result[0] = 1;
                }
            }
        }
        return result;
    }
}
