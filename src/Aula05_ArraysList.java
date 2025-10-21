import java.util.ArrayList;

public class Aula05_ArraysList {
    public static void main(String[] args) {
        //O ArrayList é uma classe que nos permite criar uma lista dinamica de elementos
        //A utilidade dele é que não nessescita declarar previamente o tamanho da lista
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Flavio");

        System.out.println(nomes.get(2));

        nomes.remove(0);
        System.out.println(nomes.get(2));

    }
}
