import java.util.*;

public class MaxLexicographicSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        int[] a = new int[N]; 
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt(); 
        }

        int[] bitCount = new int[32]; 
        
        for (int num : a) {
            for (int bit = 0; bit < 31; bit++) {
                if ((num & (1 << bit)) != 0) { 
                    bitCount[bit]++;
                }
            }
        }

        int[] result = new int[N];
        for (int bit = 30; bit >= 0; bit--) { 
            for (int i = 0; i < N && bitCount[bit] > 0; i++) {
                if ((result[i] & (1 << bit)) == 0) { 
                    result[i] |= (1 << bit); 
                    bitCount[bit]--; 
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
