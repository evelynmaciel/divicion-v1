import java.util.Scanner;

class MainDivision{
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);

        System.out.print("Ingresa un valor: ");
        double n1 = na.nextDouble();

        System.out.print("Ingresa otro valor: ");
        double n2 = na.nextDouble();

        Division d1 = new Division();

        d1.setN1(n1);
        d1.setN2(n2);

        d1.dividir();
        d1.mostrarResultado();

        System.out.println(d1.toString());
    }
}