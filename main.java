public class main {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.modelo = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2010;

        c1.exibir(); // execulta a ação de imprimir na tela
       c1.idadeDoCarro(); // Devolve o valor da idade do carro
        System.out.println("Idade do Carro: "+ c1.idadeDoCarro()); 
    }

}