import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double xa , xb ,ya, yb;
        System.out.println("Digite O X do A");
        xa = scanner.nextDouble();
        
        System.out.println("Digite O X do B");
        xb = scanner.nextDouble();
        
        System.out.println("Digite o Y do A");
        ya = scanner.nextDouble();
        
        System.out.println("Digite o Y do B");
        yb = scanner.nextDouble();
        
        
        double distancia = CalcularDistancia(xa,xb,ya,yb);
        
        System.out.println("Valor Da Distancia entre A e B: " + distancia);
        
    }
    public static double CalcularDistancia(double xa , double xb , double ya, double yb){
        double distancia;
        distancia = Math.sqrt(Math.pow(xb-xa , 2) + Math.pow(yb-ya , 2));
        return distancia;
    }
}

