import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Passo 1
        List<Integer> lista = new ArrayList<>(5);

        for(int i = 1 ; i<=5 ; i++){
            lista.add(i);
        }

        List<Integer> pilha =new ArrayList<>(5);

        pilha.addAll(lista);
        lista.clear();

        System.out.println("Pilha:" + pilha);

        ArrayDeque fila = new ArrayDeque<>(10);
        for (int i = 0 ; i < pilha.size() ; i++){
            fila.push(pilha.get(i));
        }
        pilha.clear();

        System.out.println("Fila: " + fila);

        for(int i = 1 ; i<=5 ; i++) {
            lista.add(5 + i);
        }
        System.out.println("Lista: " + lista);

        pilha.addAll(lista);
        lista.clear();

        for (int i = 0 ; i < pilha.size() ; i++){
            fila.push(pilha.get(i));
        }
        pilha.clear();

        System.out.println("Fila: " + fila);
    }

}