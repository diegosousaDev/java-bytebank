package gerenciador;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TesteIterator {
    public static void main(String[] args){

        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");

//        letras.forEach(letra -> {
//            System.out.println(letra);
//        });

        Iterator<String> iterator = letras.iterator();
        while(iterator.hasNext()){
            String letra = iterator.next();
            System.out.println(letra);
        }

    }

}
