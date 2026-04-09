import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Uno","Fiat",2005));
        carros.add(new Carro("Corola","Toyota",2022));
        carros.add(new Carro("S10","Fiat",2011));

        for(Carro c :carros){
            c.exibir();
        }
    }    
}