public class Carro {
    String modelo;
    String marca;
    int ano;


    public Carro(String modelo, String marca, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }   

    public void exibir(){
        System.out.println("Marca: " + this.marca +" |Modelo: " + this.modelo + " |Ano: " + this.ano);
    }

    public int idadeDoCarro(){
        return 2026 - ano;
    }
}
