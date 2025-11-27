package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    // Ejercicio 1
    public static void ejercicio1() {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");

        frutas.add(2, "Uva");
        System.out.println("Primera fruta: " + frutas.get(0));

        frutas.set(3, "Kiwi");

        System.out.println("Tamaño: " + frutas.size());
        System.out.println(frutas);

        System.out.println("--------------- ejercicio 1 fin");
    }

    // Ejercicio 2
    public static void ejercicio2() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 10, 20, 30, 40, 50, 20);

        numeros.remove(2); // elimina 30
        numeros.remove(Integer.valueOf(20)); // elimina primer 20

        System.out.println("Contiene 40: " + numeros.contains(40));
        System.out.println("Tamaño final: " + numeros.size());
        System.out.println(numeros);

        System.out.println("--------------- ejercicio 2 fin");
    }

    // Ejercicio 3
    public static void ejercicio3() {
        ArrayList<String> nombres = new ArrayList<>();
        Collections.addAll(nombres, "Ana", "Luis", "María", "Carlos", "Elena");

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Posición " + i + ": " + nombres.get(i));
        }

        int contador = 0;
        for (String n : nombres) {
            if (n.length() > 4)
                contador++;
        }

        System.out.println("Nombres con más de 4 letras: " + contador);
        System.out.println("--------------- ejercicio 3 fin");
    }

    // Ejercicio 4
    public static void ejercicio4() {
        ArrayList<Double> valores = new ArrayList<>();
        Collections.addAll(valores, 15.5, 23.8, 9.2, 31.7, 12.4);

        double suma = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        for (Double v : valores) {
            suma += v;
            if (v > max)
                max = v;
            if (v < min)
                min = v;
        }

        double promedio = suma / valores.size();

        System.out.println("Suma: " + suma);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Promedio: " + promedio);

        System.out.println("--------------- ejercicio 4 fin");
    }

    // Ejercicio 5
    public static void ejercicio5() {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 10; i++)
            lista.add(i);

        System.out.println("Antes: " + lista);

        Iterator<Integer> it = lista.iterator();
        int eliminados = 0;

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove();
                eliminados++;
            }
        }

        System.out.println("Después: " + lista);
        System.out.println("Eliminados: " + eliminados);

        System.out.println("--------------- ejercicio 5 fin");
    }

    // Ejercicio 6
    public static void ejercicio6() {
        ArrayList<String> leng = new ArrayList<>();
        Collections.addAll(leng, "Java", "Python", "C++", "JavaScript", "Python", "Go");

        System.out.println("Primera Python: " + leng.indexOf("Python"));
        System.out.println("Última Python: " + leng.lastIndexOf("Python"));
        System.out.println("Contiene Ruby: " + leng.contains("Ruby"));

        List<String> sub = leng.subList(1, 4);
        System.out.println("Sublista: " + sub);

        System.out.println("--------------- ejercicio 6 fin");
    }

    // Ejercicio 7
    public static void ejercicio7() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 45, 12, 78, 23, 67, 34, 89, 56);

        Collections.sort(numeros);
        System.out.println("Ascendente: " + numeros);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Descendente: " + numeros);

        ArrayList<String> nombres = new ArrayList<>();
        Collections.addAll(nombres, "Ana", "Juan", "Pedro", "María", "Luis");

        Collections.sort(nombres);
        System.out.println("Alfabético: " + nombres);

        nombres.sort(Comparator.comparingInt(String::length));
        System.out.println("Por longitud: " + nombres);

        System.out.println("--------------- ejercicio 7 fin");
    }

    // Ejercicio 8
    public static void ejercicio8() {
        ArrayList<String> palabras = new ArrayList<>();
        Collections.addAll(palabras, "casa", "auto", "bicicleta", "avión", "barco", "tren");

        palabras.removeIf(p -> p.length() < 5);
        System.out.println(palabras);

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 20; i++)
            nums.add(i);

        nums.removeIf(n -> n % 3 == 0);
        System.out.println(nums);

        System.out.println("--------------- ejercicio 8 fin");
    }

    // Ejercicio 9
    public static void ejercicio9() {
        ArrayList<String> dias = new ArrayList<>();
        Collections.addAll(dias, "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");

        Object[] arrObj = dias.toArray();
        String[] arrStr = dias.toArray(new String[0]);

        System.out.println("Long Object: " + arrObj.length);
        System.out.println("Long String: " + arrStr.length);

        System.out.print("Arr Object: ");
        for (Object o : arrObj)
            System.out.print(o + " ");
        System.out.println();

        System.out.print("Arr String: ");
        for (String s : arrStr)
            System.out.print(s + " ");
        System.out.println();

        String[] colores = { "Rojo", "Verde", "Azul" };
        ArrayList<String> listaColores = new ArrayList<>(Arrays.asList(colores));
        System.out.println(listaColores);

        System.out.println("--------------- ejercicio 9 fin");
    }

    // ======== Ejercicio 10 ========

    static ArrayList<String> nombres = new ArrayList<>();
    static ArrayList<Double> calificaciones = new ArrayList<>();

    public static void ejercicio10() {

        agregarEstudiante("Ana", 4.5);
        agregarEstudiante("Luis", 2.8);
        agregarEstudiante("María", 3.7);
        agregarEstudiante("Carlos", 4.2);
        agregarEstudiante("Elena", 2.5);

        System.out.println("\nLista inicial:");
        listarEstudiantes();

        System.out.println("\nPromedio general: " + calcularPromedio());

        System.out.println("\nAprobados:");
        estudiantesAprobados();

        eliminarEstudiante(1);

        System.out.println("\nPosición de María: " + buscarEstudiante("María"));

        System.out.println("\nLista final:");
        listarEstudiantes();

        System.out.println("--------------- ejercicio 10 fin");
    }

    public static void agregarEstudiante(String nombre, Double calificacion) {
        nombres.add(nombre);
        calificaciones.add(calificacion);
    }

    public static void eliminarEstudiante(int indice) {
        if (indice >= 0 && indice < nombres.size()) {
            nombres.remove(indice);
            calificaciones.remove(indice);
        }
    }

    public static int buscarEstudiante(String nombre) {
        return nombres.indexOf(nombre);
    }

    public static double calcularPromedio() {
        double suma = 0;
        for (double c : calificaciones)
            suma += c;
        return suma / calificaciones.size();
    }

    public static void listarEstudiantes() {
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(i + ". " + nombres.get(i) + " - " + calificaciones.get(i));
        }
    }

    public static void estudiantesAprobados() {
        for (int i = 0; i < nombres.size(); i++) {
            if (calificaciones.get(i) >= 3.0) {
                System.out.println(nombres.get(i) + " - " + calificaciones.get(i));
            }
        }
    }
}
