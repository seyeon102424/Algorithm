import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = new int[8];
        
        for(int i=0; i<survey.length; i++){
            char c = survey[i].charAt(0);
            if (choices[i]==4){score[0] += 0;}
            if(c == 'R' || c == 'T'){
                if(c == 'R'){
                    if(choices[i]==1){score[0] += 3;}
                    else if(choices[i]==2){score[0] += 2;}
                    else if(choices[i]==3){score[0] += 1;}
                    else if(choices[i]==5){score[1] += 1;}
                    else if(choices[i]==6){score[1] += 2;}
                    else if(choices[i]==7){score[1] += 3;}
                }
                else{
                    if(choices[i]==1){score[1] += 3;}
                    else if(choices[i]==2){score[1] += 2;}
                    else if(choices[i]==3){score[1] += 1;}
                    else if(choices[i]==5){score[0] += 1;}
                    else if(choices[i]==6){score[0] += 2;}
                    else if(choices[i]==7){score[0] += 3;}
                }
            }
            else if(c == 'C' || c == 'F'){
                if(c == 'C'){
                    if(choices[i]==1){score[2] += 3;}
                    else if(choices[i]==2){score[2] += 2;}
                    else if(choices[i]==3){score[2] += 1;}
                    else if(choices[i]==5){score[3] += 1;}
                    else if(choices[i]==6){score[3] += 2;}
                    else if(choices[i]==7){score[3] += 3;}
                }
                else{
                    if(choices[i]==1){score[3] += 3;}
                    else if(choices[i]==2){score[3] += 2;}
                    else if(choices[i]==3){score[3] += 1;}
                    else if(choices[i]==5){score[2] += 1;}
                    else if(choices[i]==6){score[2] += 2;}
                    else if(choices[i]==7){score[2] += 3;}
                }
            }
            else if(c == 'J' || c == 'M'){
                if(c == 'J'){
                    if(choices[i]==1){score[4] += 3;}
                    else if(choices[i]==2){score[4] += 2;}
                    else if(choices[i]==3){score[4] += 1;}
                    else if(choices[i]==5){score[5] += 1;}
                    else if(choices[i]==6){score[5] += 2;}
                    else if(choices[i]==7){score[5] += 3;}
                }
                else{
                    if(choices[i]==1){score[5] += 3;}
                    else if(choices[i]==2){score[5] += 2;}
                    else if(choices[i]==3){score[5] += 1;}
                    else if(choices[i]==5){score[4] += 1;}
                    else if(choices[i]==6){score[4] += 2;}
                    else if(choices[i]==7){score[4] += 3;}
                }
            }
            else{
                if(c == 'A'){
                    if(choices[i]==1){score[6] += 3;}
                    else if(choices[i]==2){score[6] += 2;}
                    else if(choices[i]==3){score[6] += 1;}
                    else if(choices[i]==5){score[7] += 1;}
                    else if(choices[i]==6){score[7] += 2;}
                    else if(choices[i]==7){score[7] += 3;}
                }
                else{
                    if(choices[i]==1){score[7] += 3;}
                    else if(choices[i]==2){score[7] += 2;}
                    else if(choices[i]==3){score[7] += 1;}
                    else if(choices[i]==5){score[6] += 1;}
                    else if(choices[i]==6){score[6] += 2;}
                    else if(choices[i]==7){score[6] += 3;}
                }
            }
        }
        
        if(score[0]>score[1]){answer += "R";}
        else if(score[0]<score[1]){answer += "T";}
        else{answer += "R";}
        
        if(score[2]>score[3]){answer += "C";}
        else if(score[2]<score[3]){answer += "F";}
        else{answer += "C";}
        
        if(score[4]>score[5]){answer += "J";}
        else if(score[4]<score[5]){answer += "M";}
        else{answer += "J";}
        
        if(score[6]>score[7]){answer += "A";}
        else if(score[6]<score[7]){answer += "N";}
        else{answer += "A";}
        return answer;
    }
}