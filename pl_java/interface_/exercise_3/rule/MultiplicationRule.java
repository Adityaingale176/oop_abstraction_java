package pl_java.interface_.exercise_3.rule;

import java.util.Arrays;

public class MultiplicationRule implements GameRule {

    //TODO
    // This rule multiplies all the items in the input array and returns the final result.
    @Override
   public int calculateResult(int[] input) {
        int m = 1;
        for (int inte : input){
            m = m * inte;
        }
        return m;
    }

     public String toString() {
		return "MultiplicationRule"; 
	}
}
