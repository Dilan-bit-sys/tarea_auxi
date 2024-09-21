import java.util.*;

public class BorderlandsLoot {
    
    private static final String[] TIPOS = {"Arma", "Escudo", "Modificador"};
 
    private static final String[] RAREZAS = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
    
    public static Map<String, Object> generarBotin(Random random) {
        Map<String, Object> botin = new HashMap<>();
        
        String tipo = TIPOS[random.nextInt(TIPOS.length)];
        botin.put("tipo", tipo);

        String rareza = RAREZAS[random.nextInt(RAREZAS.length)];
        botin.put("rareza", rareza);
        

        switch (tipo) {
            case "Arma":
                int dano = random.nextInt(101) + 50;  
                botin.put("atributo_1", "Daño: " + dano);
                break;
            case "Escudo":
                int absorcion = random.nextInt(201) + 100;  
                botin.put("atributo_1", "Capacidad de absorción: " + absorcion);
                break;
            case "Modificador":
                int mejoraHabilidad = random.nextInt(21) + 5;  
                botin.put("atributo_1", "Mejora de habilidad: +" + mejoraHabilidad + "%");
                break;
        }
        
        return botin;
    }
    
     void mostrarBotin(Map<String, Object> botin) {
        System.out.println("¡Has encontrado un botín!");
        System.out.println("Tipo: " + botin.get("tipo"));
        System.out.println("Rareza: " + botin.get("rareza"));
        System.out.println("Atributos:");
        System.out.println(botin.get("atributo_1"));
        System.out.println("-------------------------");
    }
    
     void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        List<Map<String, Object>> botinObtenido = new ArrayList<>();
        
        System.out.println("¡Bienvenido al sistema de botín de Borderlands!");
        
        boolean seguirJugando = true;
        
        while (seguirJugando) {
            Map<String, Object> botin = generarBotin(random);
            mostrarBotin(botin);
            botinObtenido.add(botin);
            
            System.out.print("¿Quieres seguir enfrentándote a enemigos para obtener más botín? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                seguirJugando = false;
            }
        }
        
        System.out.println("\nResumen del botín obtenido:");
        for (Map<String, Object> botin : botinObtenido) {
            mostrarBotin(botin);
        }
        
        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}
