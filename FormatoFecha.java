import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FormatoFecha {
    public static void main(String[] args) {
      
        Map<String, Integer> meses = new HashMap<>();
        meses.put("enero", 1);
        meses.put("febrero", 2);
        meses.put("marzo", 3);
        meses.put("abril", 4);
        meses.put("mayo", 5);
        meses.put("junio", 6);
        meses.put("julio", 7);
        meses.put("agosto", 8);
        meses.put("septiembre", 9);
        meses.put("octubre", 10);
        meses.put("noviembre", 11);
        meses.put("diciembre", 12);
        
        Map<Integer, Integer> diasPorMes = new HashMap<>();
        diasPorMes.put(1, 31);  
        diasPorMes.put(2, 28);  
        diasPorMes.put(3, 31);  
        diasPorMes.put(4, 30);  
        diasPorMes.put(5, 31);  
        diasPorMes.put(6, 30);  
        diasPorMes.put(7, 31);  
        diasPorMes.put(8, 31);  
        diasPorMes.put(9, 30);  
        diasPorMes.put(10, 31); 
        diasPorMes.put(11, 30); 
        diasPorMes.put(12, 31); 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la fecha (ej: 4 de junio, 2004): ");
        String entrada = sc.nextLine();
        
        String[] partes = entrada.split(" de |, ");
        int dia = Integer.parseInt(partes[0]);
        String mesTexto = partes[1].toLowerCase();
        int anio = Integer.parseInt(partes[2]);
        
        if (!meses.containsKey(mesTexto)) {
            System.out.println("Mes inválido.");
            return;
        }
        
        int mes = meses.get(mesTexto);
        
        if (mes == 2 && esBisiesto(anio)) {
            diasPorMes.put(2, 29); 
        }
        
        if (dia < 1 || dia > diasPorMes.get(mes)) {
            System.out.println("Error: Día inválido para el mes dado.");
        } else {
            System.out.printf("%d / %02d / %d\n", dia, mes, anio);
        }
        
        sc.close();
    }
    
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
