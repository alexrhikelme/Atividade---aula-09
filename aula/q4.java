package aula;

import java.util.*;

public class q4{
    public static void main(String[] args){
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Ana");
        nomes.add("Eduardo");

        System.out.println("Nomes: ");
        for (String nome : nomes)   {
            System.out.println(nome);
        }  
    }
}