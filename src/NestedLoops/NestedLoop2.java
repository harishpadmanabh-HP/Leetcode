package NestedLoops;

/**
 * You are given an integer value 'n'. Your task is to execute a series of nested loops to perform certain operations.
 * The loops are defined as follows:
 * <p>
 * Outer Loop:
 * Initializer:
 * int i = n, Endpoint: i > 0, Update: i = i / 2
 * <p>
 * Inner Loop:
 * Initializer:
 * int j = 0, Endpoint: j <= i, Update: j = j+1
 * <p>
 * During each iteration of the 'j-loop', a function 'print()' is called, which takes constant time O(1) to execute.
 */
public class NestedLoop2 {
    public static int cnt = 0;

    public static void print() {
        cnt++;
    }

    public static void solve(int n) {
        for (int i = n; i > 0; i = i / 2) {
            for (int j = 0; j <= i; j++ )
                print();
        }
    }

    public static void main(String[] args) {
        solve(10);
        System.out.println(cnt);
    }
}
