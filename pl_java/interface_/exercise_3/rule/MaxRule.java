package pl_java.interface_.exercise_3.rule;

// TODO 
// inherit from the GameRule interface 
// Overide and implement the calculateResult method as per the mentioned rule.
public class MaxRule implements GameRule{

   
    public String toString(){
          return "MaxRule"; 
      }

     //This rule returns an item with max value present in the input array.
    @Override
    public int calculateResult(int[] input) {
        int max = 0;
        for (int inte : input){
           if (inte>max){
            max = inte;
           }
        }
        return max;
    }
}
