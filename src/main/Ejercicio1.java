import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f= new File("/");
        HashMap<Integer,File> Lista=new HashMap<>();
        File directoriopadre=new File("/");
        int opcion=-2;
        while (opcion!=-1){
                menu(f,Lista);
                opcion=sc.nextInt();
                if (opcion==0){
                    f=new File(f.getParent());
                }else{
                    directoriopadre= new File(f.getPath());
                    f=new File(Lista.get(opcion).getAbsolutePath());
                }
        }
    }
    public static void menu(File f, HashMap<Integer,File> Lista){
        System.out.println("Lista de ficheros y directorios del directorio: "+f.getPath());
        System.out.println("------------------------------------------------------------------------");
        System.out.println("0 --> Directorio padre");
        for (int i = 0; i < f.list().length; i++) {
            System.out.println(i+1+" --> "+f.list()[i].toString());
            Lista.put(i+1, f.listFiles()[i]);
        }
        System.out.println("-1 -->Salir");
    }
}