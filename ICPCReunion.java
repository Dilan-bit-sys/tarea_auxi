import java.util.Scanner;

public class ICPCReunion {
     static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();  
        int K = sc.nextInt();  
        
        int maxTiempoDiscurso = (K - (N - 1)) / N;
        
        System.out.println(maxTiempoDiscurso);
    }
}

