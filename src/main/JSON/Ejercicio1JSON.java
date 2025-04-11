package JSON;

import com.google.gson.Gson;

public class Ejercicio1JSON {
    public static void main(String[] args) {
        String json="{\"num\":46, \"nombre\":\"Miguel\", \"departamento\":10, \"edad\":20, \"sueldo\":1200.00}";
        Gson gson=new Gson();
        System.out.println(gson.fromJson(json,Empleado.class));
    }
}
class Empleado{
    private String nombre;
    private String departamento;
    private int edad;
    private String sueldo;
    private int num;

    public Empleado(String nombre, int num, String sueldo, int edad, String departamento) {
        this.nombre = nombre;
        this.num = num;
        this.sueldo = sueldo;
        this.edad = edad;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String toString() {
        return this.num+" - "+this.nombre+" - "+this.departamento+" - "+this.edad+" - "+this.sueldo;
    }
}