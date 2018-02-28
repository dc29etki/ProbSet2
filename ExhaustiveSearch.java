import java.util.*;
/**
 * Accepts int n as input and prints all permutations of integers 1..n.
 * 
 * @author (David Etkin) 
 * @version (Problem Set #2)
 */
public class ExhaustiveSearch
{
    public static void main(String[] args){
        driver(5);
    }
    public static void driver(int n){
        int[] input = array(n);
        permute(0, input);
    }
    public static int[] array(int n){
        int[] arr = new int[n];
        for(int i=1; i<=n; i++){
            arr[i-1] = i;
        }
        return arr;
    }
    public static void permute(int start, int[] in) {
        if (start == in.length) {
            System.out.print("[ ");
            for(int x : in){
                System.out.print(x+" ");
            }
            System.out.print("]");
            System.out.println();
            return;
        }
        for (int i=start; i<in.length; i++) {
            int temp = in[i];
            in[i] = in[start];
            in[start] = temp;
            permute(start + 1, in);
            int temp2 = in[i];
            in[i] = in[start];
            in[start] = temp2;
        }
    }
}
