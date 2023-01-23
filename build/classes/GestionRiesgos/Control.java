/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionRiesgos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josue
 */
public class Control {
    private String nombre;
    private String descripcion;
    private TipoControl tipoControl;
    private float eficaciaEsperada;
    private ArrayList<Riesgo> riesgos = new ArrayList<Riesgo>(); 
    
    
    public Control(String nombre, String descripcion, TipoControl tipoControl, float eficaciaEsperada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoControl = tipoControl;
        this.eficaciaEsperada = eficaciaEsperada;
    }

    //Riesgos
    public boolean agregarRiesgo(Riesgo riesgoNuevo){
        //Si no existe
        if(buscarRiesgoPorNombre(riesgoNuevo.getNombre())== null){
            //Se agrega
            riesgos.add(riesgoNuevo);
            return true;
        }else{
            //Si ya existe no se agrega
            return false;
        }
    }
    
    public Riesgo buscarRiesgoPorNombre(String nombreBuscar){
        if(!riesgos.isEmpty()){
            for(int i = 0; i <= riesgos.size()-1; i++){
                Riesgo riesgoAux = (Riesgo) riesgos.get(i);
                if(riesgoAux.getNombre().compareTo(nombreBuscar) == 0){
                    return riesgoAux;
                }
            }
        }
        return null;
    }
    
    public void setRiesgos(ArrayList<Riesgo> riesgos) {
        this.riesgos = riesgos;
    }
    
    public ArrayList<Riesgo> getRiesgos(){
        return riesgos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoControl getTipoControl() {
        return tipoControl;
    }

    public void setTipoControl(TipoControl tipoControl) {
        this.tipoControl = tipoControl;
    }

    public float getEficaciaEsperada() {
        return eficaciaEsperada;
    }

    public void setEficaciaEsperada(float eficaciaEsperada) {
        this.eficaciaEsperada = eficaciaEsperada;
    }

    @Override
    public String toString() {
        return "Control{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", tipoControl=" + tipoControl + ", eficaciaEsperada=" + eficaciaEsperada + '}';
    }
    
    
}
