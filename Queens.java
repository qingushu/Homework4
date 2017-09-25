import java.util.*;
public class Queens {


    public static void place(int[] q, int k) {
        int n = q.length;
        if (k == n) printQueens(q);
        else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (canPlace(q, k)) place(q, k+1);
            }
        }
    }

 public static boolean canPlace(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n])             return false;
            if ((q[i] - q[n]) == (n - i)) return false;
            if ((q[n] - q[i]) == (n - i)) return false;
        }
        return true;
    }

   public static void printQueens(int[] q) {
        int n = q.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (q[i] == j) System.out.print("q ");
                else           System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter an integer for N Queen problem");
        int n = in.nextInt();
        int[] a = new int[n];
        place(a, 0);
    }

}
