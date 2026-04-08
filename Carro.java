public class Carro {
    int contador;
    String marca;
    String modelo;
    int ano;


    public void exibir(){
        System.out.println("Marca: " + marca +" : " + modelo + " Ano: " + ano);
    }

    public int idadeDoCarro(){
        return 2026 - ano;
    }
}
