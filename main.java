public class main {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.modelo = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2010;

        Carro c2 = new Carro();
        c2.modelo = "Gol Quadrado";
        c2.marca = "Volkswagen";
        c2.ano = 1994;

        System.out.println("Modelo: " + c1.modelo +" Marca: " + c1.marca + " Ano: " + c1.ano);
        System.out.println("Modelo: " + c2.modelo +" Marca: " + c2.marca + " Ano: " + c2.ano);
    }

}