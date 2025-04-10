import java.io.File;
import java.text.DateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f= new File("/");
        HashMap<Integer,File> Lista=new HashMap<>();
        int opcion;
        while (true){
            menu(f,Lista);
            opcion=sc.nextInt();
            if (opcion==0){
                f=new File(f.getParent());
            }else if (opcion==-1){
                break;
            }else if(opcion==3){
                System.out.println("Es un ficher");
            }
            else{
                f=new File(Lista.get(opcion).getAbsolutePath());
            }
        }
    }
    public static void menu(File f, HashMap<Integer,File> Lista){
        System.out.println("Lista de ficheros y directorios del directorio: "+f.getPath());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("0 --> Directorio padre");
        for (int i = 0; i < f.list().length; i++) {

            System.out.println(i+1+" -->\t"+pemisos(f.listFiles()[i])+"\t"+f.listFiles()[i].length()+"\t\t"+fecha(f)+"\t\t"+f.list()[i].toString());
            Lista.put(i+1, f.listFiles()[i]);
        }
        System.out.println("Introduce una opción (-1 para salir)");
    }
    public static String pemisos(File f){
        String t="";
        t+=(f.isDirectory() ? "d" : "-");
        t+=(f.canRead() ? "r" : "-");
        t+=(f.canWrite() ? "w" : "-");
        t+=(f.canExecute() ? "x" : "-");
        return t;
    }
    public static String fecha(File f){
        DateFormat formatter;
        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
        return formatter.format(f.lastModified());
    }
}