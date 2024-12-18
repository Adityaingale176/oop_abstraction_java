package pl_java.interface_.exercise_3.rule;

public class SumCube implements GameRule{

    @Override
	public int calculateResult(int[] input) {
        int sum = 0;
        for (int inte : input){
            sum = sum + (inte*inte*inte);
        }
        return sum;
    }

    @Override
    public String toString() {
        return "SumCube";
    }
}
