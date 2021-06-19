package manejoarchivos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se ha creado.");
        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String texto) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(texto);
            salida.close();
            System.out.println("Se ha escrito el texto.");
        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);
        }

    }

    public static void anexarInformacion(String nombreArchivo, String texto) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(texto);
            salida.close();
            System.out.println("Se ha anexado el texto.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static List<String> leerArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);
        List<String> lista = new ArrayList();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
                lista.add(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return lista;
    }

}
