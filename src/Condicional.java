//Terceira aula do curso de Java da Alura pt1
public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        //teste para saber se o filme é novo ou antigo
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        //teste para saber o plano do cliente, e se o filme está incluido.
        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else{
            System.out.println("Deve pagar locação");
        }
    }
}
