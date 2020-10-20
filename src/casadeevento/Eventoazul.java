package casadeevento;

import java.util.Date;


public class Eventoazul extends CasaDeEvento{
    private String nombre;
    private int disponibilidadDeTrabajadores;
    private Date fechaDeRealizacion;
    private String especialidad;
    private Boolean casaDeEventoEnUso;    


   
    
    public Eventoazul(String nombre, int disponibilidadDeTrabajadores, Date fechaDeRealizacion, String especialidad, Boolean casaDeEventoEnUso) {
        super(nombre, disponibilidadDeTrabajadores, fechaDeRealizacion, especialidad, casaDeEventoEnUso);
    }
    
    /**
     * Este método incrementa la disponibilidad de los trabajadores de la casa 
     * de eventos 
     * y pone la casa de eventos en uso
     */
    public void organizarEventoRecreativo(){
        this.disponibilidadDeTrabajadores += 6;
        this.casaDeEventoEnUso = true;
    }
    
    /**
     * Este método incrementa el numero de personas que pueden asistir al evento 
     */
    public void tamañoDelLugarCentroRecreativo(){
        this.disponibilidadDeTrabajadores += 120;
        this.casaDeEventoEnUso = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDisponibilidadDeTrabajadores() {
        return disponibilidadDeTrabajadores;
    }

    public void setDisponibilidadDeTrabajadores(int disponibilidadDeTrabajadores) {
        this.disponibilidadDeTrabajadores = disponibilidadDeTrabajadores;
    }

    public Date getFechaDeRealizacion() {
        return fechaDeRealizacion;
    }

    public void setFechaDeRealizacion(Date fechaDeRealizacion) {
        this.fechaDeRealizacion = fechaDeRealizacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getCasaDeEventoEnUso() {
        return casaDeEventoEnUso;
    }

    public void setCasaDeEventoEnUso(Boolean casaDeEventoEnUso) {
        this.casaDeEventoEnUso = casaDeEventoEnUso;
    }

    
    
    public static void main(String[] args) {
        CasaDeEvento casaDeEventoUno = new CasaDeEvento("picardias",12,new Date(),"matrimonios",false);
        CasaDeEvento casaDeEventoDos = new CasaDeEvento("fantasias",10,new Date(),"quinces",true);
        
        System.out.println(casaDeEventoUno.getNombre());
        System.out.println(casaDeEventoUno.getDisponibilidadDeTrabajadores());
        System.out.println(casaDeEventoUno.getCasaDeEventoEnUso());
        
        casaDeEventoUno.organizarEventoRecreativo();
        
        System.out.println(casaDeEventoUno.getNombre());
        System.out.println(casaDeEventoUno.getDisponibilidadDeTrabajadores());
        System.out.println(casaDeEventoUno.getCasaDeEventoEnUso());
    }
}

