package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (idade >= 18) {
            System.out.println("Autorizado a comprar bebida alcolica");
        } else {
            System.out.println("Não Autorizado a comprar bebida");
        }



        if(!isAutorizadoComprarBebida == false){
            System.out.println("Não Autorizado a comprar bebida");
        }

        boolean c = false;
        if(c == true){
           System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
