package pl_java.interface_.exercise_3.rule;

import java.util.Arrays;

// TODO 
// inherit from the GameRule interface 
// Overide and implement the calculateResult method as per the mentioned rule.
public class AdditionRule implements GameRule{

	// This rule adds all the items in the input array and returns the final result.
	@Override
	public int calculateResult(int[] input) {
        int m = 0;
        for (int inte : input){
            m = m+inte;
        }
        return m;
    }

  public String toString() {
		return "AdditionRule"; 
	}
}
