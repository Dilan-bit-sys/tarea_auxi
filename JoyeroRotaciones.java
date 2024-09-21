import java.util.Scanner;

public class JoyeroRotaciones {

    public static int[][] rotar90Antihorario(int[][] matriz, int N) {
        int[][] rotada = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotada[N - j - 1][i] = matriz[i][j];
            }
        }
        return rotada;
    }
    public static boolean sonIguales(int[][] matriz1, int[][] matriz2, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] joyero = new int[N][N];

        // Leer la matriz (joyero)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                joyero[i][j] = scanner.nextInt();
            }
        }

        int[][] original = new int[N][N];
        for (int i = 0; i < N; i++) {
            System.arraycopy(joyero[i], 0, original[i], 0, N);
        }

        for (int rotaciones = 0; rotaciones < 4; rotaciones++) {
            if (sonIguales(joyero, original, N)) {
                System.out.println(rotaciones);
                return;
            }
            joyero = rotar90Antihorario(joyero, N);
        }
    }
}
