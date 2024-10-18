import java.util.Scanner;
public class Triangulo {
    
    private int x, y, z; 

    public Triangulo(int um, int dois, int tres) {
        x = um; 
        y = dois; 
        z = tres; 
    }

    public boolean verificaSeEhTriangulo() { 
        
        boolean resultado = false; 
        if (x < y + z) { 
            if (y < x + z) { 
                if (z < x + y) { 
                    resultado = true; 
                }
            }
        }
        return resultado; 
    }

    public String tipoDeTriangulo() { 
        if (x == y && y == z) {
            return "Tipo A"; 
        } else if (x == y || y == z || x == z) {
            return "Tipo B"; 
        }
        return "Tipo C"; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int a, b, c; 

        System.out.print("lado 1: "); 
        a = sc.nextInt(); 
        System.out.print("lado 2: "); 
        b = sc.nextInt(); 
        System.out.print("lado 3: "); 
        c = sc.nextInt(); 

        Triangulo t = new Triangulo(a, b, c); 

        if (t.verificaSeEhTriangulo()) { 
            String tipo = t.tipoDeTriangulo(); 
            System.out.printf("lados 3, 4 e 5  formam um triângulo escaleno", a, b, c, tipo);
        } else {
            System.out.printf("lados 3, 4 e 5 não formam um triângulo", a, b, c); 
        }

        sc.close(); 
    }
}
