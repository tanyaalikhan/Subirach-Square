import java.time.Duration;
import java.time.Instant;

public class Lucas {
    /*
    Write a Java program that accepts as input a value n and writes as output
    the sequence L(0), L(1), . . . , L(n). Your program should compute the values
    recursively with a separate function that uses the definition above.
    Do not use an accumulator; instead, implement the recursion naively with
    the function calling itself twice. You may hardcode the initial conditions.
     */

    public int lucasNumbers(int n) {// need to extend this program
        if (n == 0) {
            return 2;//hard-coding initial condition
        } else if (n == 1) {
            return 1; //hard-coding initial condition
        } else {
            return lucasNumbers(n - 1) + lucasNumbers(n - 2);
        }
    }
    public static int myNumSequence(int n) {// need to extend this program
        if (n == 0) {
            return 2;//hard-coding initial condition
        } else if (n == 1) {
            return 1; //hard-coding initial condition
        } else {
            return myNumSequence(n - 2) + myNumSequence(n - 1);
        }
        //order of growth : O(logn) since it's a recursive algorithm
    }

    public void firstForty() {
        for (int ctr = 0; ctr < 40; ctr++) {
            long start1 = System.nanoTime();
            lucasNumbers(ctr);
            long end1 = System.nanoTime();
            System.out.println("Elapsed Time in nano seconds for each number: (" + ctr + ") " + (end1 - start1));
        }
    }




    // part 1 works --> tested on 11/14 @6:46 PM
    // part 2 works --> tested on 11/17 @4:48 PM

    public static void main(String args[]) {
        Lucas obj = new Lucas();
        //long start1 = System.nanoTime();
        obj.firstForty();
        //long end1 = System.nanoTime();
        //System.out.println("Elapsed Time in nano seconds: " + (end1 - start1));
        //System.out.println(myNumSequence(5));


    }



}
