package aula;

import java.util.*;

public class q5 {
    public static void main(String[] args){
        TreeMap<String, Integer> pessoas = new TreeMap<>();

        pessoas.put("Carlos", 40);
        pessoas.put("Amanda", 22);
        pessoas.put("Beatriz", 35);
        pessoas.put("Diego", 28);

        System.out.println("Nomes: ");

        String primeiroNome = pessoas.firstKey();
        String ultimoNome = pessoas.lastKey();

        for (String nome : pessoas.keySet()){
            System.out.println(nome +" "+ pessoas.get(nome));
        }
    }
}
