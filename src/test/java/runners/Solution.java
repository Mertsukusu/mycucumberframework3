package runners;

import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public static int solution(String S) {
        // write your code in Java SE 8
        char [] chars = S.toCharArray();
        double [] result = new double[5];

        for(int i = 0; i < chars.length; i++)
        {
            if(chars[i] == 'B')
            {
                result[0] += 1;
            }
            else if(chars[i] == 'A')
            {
                result[1] += 1;
            }
            else if(chars[i] == 'L')
            {
                result[2] += .5;
            }
            else if(chars[i] == 'O')
            {
                result[3] += .5;
            }
            else if(chars[i] == 'N')
            {
                result[4] += 1;
            }
        }

        Arrays.sort(result);

        return (int)result[0];

    }

    public static void main(String[] args) {
        String S = "BAONXXOLL";
        System.out.println(solution(S));
    }
}
