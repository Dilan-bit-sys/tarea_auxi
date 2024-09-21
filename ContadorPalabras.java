import java.util.List;

public class ContadorPalabras {
    
    public static int contarPalabrasConLetra(List<String> palabras, char letra) {
        int contador = 0;
        letra = Character.toLowerCase(letra); 
        
        for (String palabra : palabras) {
            if (!palabra.isEmpty() && Character.toLowerCase(palabra.charAt(0)) == letra) {
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        List<String> palabras = List.of("Hola", "Héroe", "huracán", "sol", "luna", "Hamaca");
        char letra = 'h';
        
        int resultado = contarPalabrasConLetra(palabras, letra);
        System.out.println("Palabras que comienzan con '" + letra + "': " + resultado);
    }
}

