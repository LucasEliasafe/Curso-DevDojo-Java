package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        double salarioAnual = 4500;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.36 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            salarioAnual = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34712 && salarioAnual <= 68587) {
            salarioAnual = salarioAnual * segundaFaixa;
        } else {
            salarioAnual = salarioAnual * terceiraFaixa;
        }
        System.out.println(salarioAnual);
    }
}
