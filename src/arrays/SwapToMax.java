package arrays;

/**
 * You are given two arrays a1,a2,…,an and b1,b2,…,bn. In one operation, you can choose any integer i from 1 to n and swap the numbers a (ith) and b (ith).
 *
 * Determine whether, after using any (possibly zero) number of operations, the following two conditions can be satisfied simultaneously:
 * 1.  a(nth) = max(a1,a2,…,an)
 * 2. b(nth) = max(b1,b2,…,bn)
 * Here max(c1,c2,…,ck) denotes the maximum number among c1,c2,…,ck. For example, max(3,5,4)=5, max(1,7,7)=7, max(6,2)=6
 *
 * Input Format:
 *
 * 1. The first line contains an integer 'n' denoting the length of arrays.
 * 2. The second line contains the elements of array 'a'.
 * 3. The third line contains the elements of array 'b'.
 * Output Format:
 * If the above conditions can be met, print "YES" else print "NO".
 *
 * Sample Input:
 *
 *
 * 3
 *
 * 7 9 7
 *
 * 7 6 9
 *
 * Sample Output:
 *
 * "YES"
 *
 * Explanation: You can swap the numbers a3 and b3 after which the array a becomes equal to [7,9,9] and the array b becomes equal to [7,6,7] and both conditions are met.
 *
 * Constraints:
 *
 * 1≤n≤100
 *
 * 1≤ai≤10^4
 *
 * 1≤bi≤100^4
 */
public class SwapToMax {
   static void solve(int n, int[] a, int[] b) {
       int maxA = a[0];
       int maxB = b[0];

       // Finding maximum elements in both arrays
       for (int i = 1; i < n; i++) {
           if (a[i] > maxA) {
               maxA = a[i];
           }
           if (b[i] > maxB) {
               maxB = b[i];
           }
       }

       // Check if swapping a single pair can satisfy the conditions
       boolean swapped = false;
       for (int i = 0; i < n; i++) {
           if ((a[i] == maxA && b[i] != maxB) || (a[i] != maxA && b[i] == maxB)) {
               int temp = a[i];
               a[i] = b[i];
               b[i] = temp;
               swapped = true;
               break;
           }
       }

       // If swapping was done, recheck conditions
       if (swapped) {
           maxA = a[0];
           maxB = b[0];
           for (int i = 1; i < n; i++) {
               if (a[i] > maxA) {
                   maxA = a[i];
               }
               if (b[i] > maxB) {
                   maxB = b[i];
               }
           }
       }

      if(a[a.length-1]==maxA && b[b.length-1]==maxB)
          System.out.println("YES");
      else
          System.out.println("NO");

    }


    public static void main(String[] args) {
        int[] a={7,9,7}, b={7,6,9};
        solve(3,a,b);
    }
}
