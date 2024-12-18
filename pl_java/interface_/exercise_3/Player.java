package pl_java.interface_.exercise_3;

import pl_java.interface_.exercise_3.rule.GameRule;

public class Player {
    private int[] values;

    public Player(int[] values){
        this.values = values;
    }
    
    //TODO
    // Implement this method
    // find the rule that produces the largest result.
    public GameRule findBest(GameRule[] rules){
        
        int max = 0;
        GameRule bestRule = null;

        for (GameRule gm : rules){
            int result = gm.calculateResult(values);
            if (result>max){
                max = result;
                bestRule = gm;
            }
        }
        return bestRule;
    }
}
