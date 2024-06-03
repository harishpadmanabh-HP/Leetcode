package strings;

/**
 * 1678. Goal Parser Interpretation
 * Easy
 * Topics
 * Companies
 * Hint
 * You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
 *
 * Given the string command, return the Goal Parser's interpretation of command.
 *
 *
 *
 * Example 1:
 *
 * Input: command = "G()(al)"
 * Output: "Goal"
 * Explanation: The Goal Parser interprets the command as follows:
 * G -> G
 * () -> o
 * (al) -> al
 * The final concatenated result is "Goal".
 * Example 2:
 *
 * Input: command = "G()()()()(al)"
 * Output: "Gooooal"
 * Example 3:
 *
 * Input: command = "(al)G(al)()()G"
 * Output: "alGalooG"
 */
public class GoalParserInterpretation {
    public static String interpret(String command) {
      StringBuilder result = new StringBuilder();
      char[] input = command.toCharArray();
      int i = 0;
        System.out.println(command.length());
      try {
          while (i<=command.length()-1){
              if(input[i]=='G'){
                  result.append("G");
                  i++;
              } else if (input[i]=='(') {
                  if(input[i+1]==')'){
                      result.append("o");
                      i+=2;
                  }else if(input[i+1]=='a'){
                      result.append("al");
                      i+=3;
                  }
              }
          }
      }catch (Exception e){
          System.out.println(e);
      }

      return result.toString();
    }
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }
}
