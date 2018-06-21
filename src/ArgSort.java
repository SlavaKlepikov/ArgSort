
import java.util.*;

public class ArgSort {
    public static void main (String[] args) {
        int argLength=args.length;
        if (argLength > 0){
            int[] arr = new int[argLength];
            for (int i =0; i<argLength; i++){
                arr[i] =  Integer.parseInt(args[i]);}
            Arrays.sort(arr);
            for (String s: args) {
                System.out.print(s + " ");
            }
            System.out.println();
            for (int i: arr) {
                System.out.print(i + " ");
            }
        }
    }
}
