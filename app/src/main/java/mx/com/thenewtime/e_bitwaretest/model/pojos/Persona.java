package mx.com.thenewtime.e_bitwaretest.model.pojos;

import android.provider.BaseColumns;

import java.util.Random;

public class Persona {

    private int Cliente_ID = 0;
    private String Nombre_Usuario = "";
    private String Contraseña = "";
    private String Nombre = "";
    private String Apellidos = "";
    private String Correo_Electronico = "";
    private int Edad = 0;
    private double Estatura = 0;
    private String NSS = "";
    private double Peso = 0;
    private String Sexo = "";

    public Persona() {

    }

    public Persona(int cliente_ID, String nombre_Usuario, String contraseña, String nombre, String apellidos, String correo_Electronico, int edad, double estatura, String NSS, double peso, String sexo) {
        Cliente_ID = cliente_ID;
        Nombre_Usuario = nombre_Usuario;
        Contraseña = contraseña;
        Nombre = nombre;
        Apellidos = apellidos;
        Correo_Electronico = correo_Electronico;
        Edad = edad;
        Estatura = estatura;
        this.NSS = NSS;
        Peso = peso;
        Sexo = sexo;
    }

    public Persona(String nombre, String apellidos, int edad, String sexo) {
        Nombre = nombre;
        Apellidos = apellidos;
        Edad = edad;
        Sexo = sexo;
    }

    public boolean isMayorEdad() {
        return this.Edad > 18;
    }

    private boolean comprobarSexo(char sexo) {
        return this.Sexo.charAt(0) == sexo;
    }

    private void generaNSS() {
        int k = 10;
        int res;
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] letras = {"A", "E", "I", "O", "U"};
        Random rnd = new Random();

        for (int i = 0; i < 8; i++) {
            res = rnd.nextInt(k);
            if (res < 3) {
                this.NSS += letras[res];
            } else
                this.NSS += numeros[res];
            numeros[res] = numeros[k - 1];
            k--;
        }
    }

    public int calcularIMC() throws Exception {
        double imc = calculoIMC();
        switch (Sexo) {
            case "M":
                if (imc < 20)
                    return -1;
                if (imc >= 20 & imc <= 25)
                    return 0;
                if (imc > 25)
                    return 1;
            case "F":
                if (imc < 19)
                    return -1;
                if (imc >= 19 & imc <= 24)
                    return 0;
                if (imc > 24)
                    return 1;
        }
        throw new Exception("Datos Incorrectos...");
    }

    public int getCliente_ID() {
        return Cliente_ID;
    }

    public void setCliente_ID(int id) {
        Cliente_ID = id;
    }

    private double calculoIMC() {
        return this.Peso / Math.pow(this.Estatura, 2);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double estatura) {
        Estatura = estatura;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        Nombre_Usuario = nombre_Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        Correo_Electronico = correo_Electronico;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' + "\n" +
                ", Apellidos='" + Apellidos + '\'' + "\n" +
                ", Edad=" + Edad + "\n" +
                ", NSS='" + NSS + '\'' + "\n" +
                ", Peso=" + Peso + "\n" +
                ", Estatura=" + Estatura + "\n" +
                ", Sexo='" + Sexo + '\'' + "\n" +
                ", Nombre_Usuario='" + Nombre_Usuario + '\'' + "\n" +
                ", Contraseña='" + Contraseña + '\'' + "\n" +
                ", Correo_Electronico='" + Correo_Electronico + '\'' + "\n" +
                '}';
    }

    public static class Columnas implements BaseColumns {

        public Columnas() {

        }

        public static String CLIENTE_ID = "CLIENTE_ID";
        public static String NOMBRE_USUARIO = "NOMBRE_USUARIO";
        public static String CONTRASEÑA = "CONTRASEÑA";
        public static String NOMBRE = "NOMBRE";
        public static String APELLIDOS = "APELLIDOS";
        public static String CORREO_ELECTRONICO = "CORREO_ELECTRONICO";
        public static String EDAD = "EDAD";
        public static String ESTATURA = "ESTATURA";
        public static String NSS = "NSS";
        public static String PESO = "PESO";
        public static String SEXO = "SEXO";


    }
}
