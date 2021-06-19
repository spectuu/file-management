
package manejoarchivos;

public class main {
    
    public static void main(String[] args){
        
        String Archivo = "Hi.txt";
       ManejoArchivos.leerArchivo(Archivo);
        String contenido = "";
        ManejoArchivos.leerArchivo(Archivo);
       for(String list: ManejoArchivos.leerArchivo(Archivo)){
           contenido += list;

       }
        System.out.println(contenido);

    }
}
