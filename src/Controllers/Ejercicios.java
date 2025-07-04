package Controllers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicios {
    public Ejercicios(){
        System.out.println("Ejercicio 1:");
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println();

        System.out.println("Ejercicio 2");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));
        System.out.println();

        System.out.println("Ejercicio 3");
        String texto = "La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?" +
                    "Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente." +
                    "En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.";
        System.out.println(contarPalabrasUnicas(texto));
        System.out.println();

        System.out.println("Ejercicio 4");
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        Set<String> palabras1 = obtenerPalabrasUnicas(texto1);
        Set<String> palabras2 = obtenerPalabrasUnicas(texto2);

        System.out.println("Texto 1: " + palabras1.size() + " palabras únicas");
        System.out.println("Texto 2: " + palabras2.size() + " palabras únicas");
        System.out.println("Cuántas palabras comunes: " + contarPalabrasComunes(texto1, texto2));
        System.out.println("Coincidencia léxica:" + calcularCoincidenciaLexica(texto1, texto2)+ "%");
        System.out.println("Solo en el texto 1: " + palabrasSoloEnTexto1(texto1, texto2));
        System.out.println("Solo en el texto 2: " + palabrasSoloEnTexto2(texto1, texto2));
        System.out.println();

    }

    public boolean tieneDuplicados(int [] numeros){
        Set<Integer> set = new HashSet<>();
        for(int num : numeros){
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra){
        Set<Character> set = new HashSet<>();
        for(char plbr : palabra.toCharArray()){
            if (!set.add(plbr)) {
                return true;
            }
        }
        return false;
    }

    public int contarPalabrasUnicas(String texto) {
        return obtenerPalabrasUnicas(texto).size();
    }

    public Set<String> obtenerPalabrasUnicas(String texto) {
        texto = texto.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "");
        String[] palabras = texto.split("\\s+");
        Set<String> set = new LinkedHashSet<>();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                set.add(palabra);
            }
        }
        return set;
    }

    public int contarPalabrasComunes(String texto1, String texto2) {
        Set<String> set1 = obtenerPalabrasUnicas(texto1);
        Set<String> set2 = obtenerPalabrasUnicas(texto2);

        Set<String> comunes = new HashSet<>(set1);
        comunes.retainAll(set2); 
        return comunes.size();
    }


    public Set<String> palabrasSoloEnTexto1(String texto1, String texto2) {
        Set<String> set1 = obtenerPalabrasUnicas(texto1);
        Set<String> set2 = obtenerPalabrasUnicas(texto2);
        set1.removeAll(set2);
        return set1;
    }

 
    public Set<String> palabrasSoloEnTexto2(String texto1, String texto2) {
        Set<String> set1 = obtenerPalabrasUnicas(texto1);
        Set<String> set2 = obtenerPalabrasUnicas(texto2);
        set2.removeAll(set1); 
        return set2;
    }

    public double calcularCoincidenciaLexica(String texto1, String texto2) {
        Set<String> set1 = obtenerPalabrasUnicas(texto1);
        Set<String> set2 = obtenerPalabrasUnicas(texto2);
        Set<String> interseccion = new HashSet<>(set1);
        interseccion.retainAll(set2); 

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2); 

        if (union.isEmpty()) return 0;

        return (interseccion.size() / (double) union.size()) * 100;
    }
}
