 package CasaDeEvento;

import  java.util.Date;


public class CasaDeEvento {

    private String nombre;
    private int numeroDeTrabajadores;
    private Date fechaDeFundacion;
    private String especialidad;
    private Boolean nacional;

    public CasaDeEvento(
            String nombre, 
            int numeroDeTrabajadores,
            Date fechaDeFundacion, 
            String especialidad,
            Boolean nacional) {
        this.nombre = nombre;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.especialidad = especialidad;
        this.nacional = nacional;
    }
    
    //El metodo aumenta la cantidad de ayudantes y decoradoresen 50
    //y sigue siendo nacional 
    public void contratarDecoradores(){
        this.numeroDeTrabajadores += 50;
        this.nacional = true;
    }
    
    /**
    * Este metodo permite darle nombres diferentes a cada evento 
    */
    public void nombresUnicos(
            String nuevoNombre, 
            String nuevaEspecialidad){
        this.nombre = nuevoNombre;
        this.especialidad = nuevaEspecialidad; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getNacional() {
        return nacional;
    }

    public void setNacional(Boolean nacional) {
        this.nacional = nacional;
    }
   
   
    
    public static void main(String[] args) {
      CasaDeEvento CasaDeEventouno = new CasaDeEvento(
              "Abrakadabra",
              100,
              new Date(),
              "Organizadoras de eventos",
              false);
      
        System.out.println(CasaDeEventouno.getNombre());
        System.out.println(CasaDeEventouno.getNumeroDeTrabajadores());
        System.out.println(CasaDeEventouno.getNacional());
        
        CasaDeEventouno.contratarDecoradores();
        
        System.out.println(CasaDeEventouno.getNombre());
        System.out.println(CasaDeEventouno.getNumeroDeTrabajadores());
        System.out.println(CasaDeEventouno.getNacional());
    }
    
}
