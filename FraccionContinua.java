import java.util.Scanner;  

public class FraccionContinua {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    
        int N = sc.nextInt(); 
        sc.close();  


        int a = 1, b = 1;

        for (int i = 2; i <= N; i++) {
            int temp = a;   
            a = a + b;      
            b = temp;       
        }

        System.out.println(a);  
    }
}
