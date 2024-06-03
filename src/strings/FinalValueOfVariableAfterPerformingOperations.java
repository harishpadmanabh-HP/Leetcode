package strings;

/**
 * 2011. Final Value of Variable After Performing Operations
 * <p>
 * There is a programming language with only four operations and one variable X:
 * <p>
 * ++X and X++ increments the value of the variable X by 1.
 * --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 * <p>
 * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: operations = ["--X","X++","X++"]
 * Output: 1
 * Explanation: The operations are performed as follows:
 * Initially, X = 0.
 * --X: X is decremented by 1, X =  0 - 1 = -1.
 * X++: X is incremented by 1, X = -1 + 1 =  0.
 * X++: X is incremented by 1, X =  0 + 1 =  1.
 */
public class FinalValueOfVariableAfterPerformingOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int finalValue = 0;
        for(String operation : operations){
            if(operation.contains("++"))
                finalValue++;
            else
                finalValue--;
        }
        return finalValue;
    }


    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
