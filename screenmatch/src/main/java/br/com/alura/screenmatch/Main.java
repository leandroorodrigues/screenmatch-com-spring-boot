package br.com.alura.screenmatch;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //1 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.
        /*List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);*/
        //2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
