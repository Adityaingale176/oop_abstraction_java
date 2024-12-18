package pl_java.interface_.exercise_3;

import pl_java.interface_.exercise_3.rule.AdditionRule;
import pl_java.interface_.exercise_3.rule.GameRule;
import pl_java.interface_.exercise_3.rule.MaxRule;
import pl_java.interface_.exercise_3.rule.MultiplicationRule;
import pl_java.interface_.exercise_3.rule.SumCube;

class Main {
    public static void main(String[] args) {
      int[] input = new int[]{3, 3 , 2};
      Player player = new Player(input);
      GameRule[] rules = new GameRule[]{new AdditionRule(), new MaxRule(), new MultiplicationRule()};
      GameRule gameRule = player.findBest(rules);
      System.out.println(gameRule);
    }
  }
