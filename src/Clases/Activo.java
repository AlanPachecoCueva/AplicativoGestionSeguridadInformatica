/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import ENUMS.TipoDeActivo;
import ENUMS.ValoracionCorta;
import ENUMS.ValoracionLarga;
import ENUMS.ValoracionIntegtridad;
import java.util.List;

/**
 *
 * @author josue
 */

public class Activo {
    private String nombreActivo;
    private String codigoActivo;
    
    private TipoDeActivo tipoActivo;
    private Tag tagActivo;
    
    private ValoracionCorta confidencialidad;
    private ValoracionIntegtridad integridad;
    private ValoracionLarga disponibilidad;

    public Activo(String nombreActivo, TipoDeActivo tipoActivo, Tag tagActivo, ValoracionLarga disponibilidad, ValoracionIntegtridad integridad, ValoracionCorta confidencialidad) {
        this.nombreActivo = nombreActivo;
        this.setCodigoActivo(generarCodigoActivo());
        this.tipoActivo = tipoActivo;
        this.tagActivo = tagActivo;
        this.disponibilidad = disponibilidad;
        this.integridad = integridad;
        this.confidencialidad = confidencialidad;
    }
    
    public boolean modificarActivo(String nombreActivo, TipoDeActivo tipoActivo, Tag tagActivo, ValoracionLarga disponibilidad, ValoracionIntegtridad integridad, ValoracionCorta confidencialidad){
        this.nombreActivo = nombreActivo;
        this.tipoActivo = tipoActivo;
        this.tagActivo = tagActivo;
        this.disponibilidad = disponibilidad;
        this.integridad = integridad;
        this.confidencialidad = confidencialidad;
        
        return true;
    }
    
    public float calcularValoracion(){
       String disponibilidad = this.getDisponibilidad().toString();
       String confidencialidad = this.getConfidencialidad().toString();
       String integridad = this.getIntegridad().toString();
       
       float total = 0;
       
       if(disponibilidad.compareTo("DB") == 0){
           total += 0.83f;
       }else if(disponibilidad.compareTo("DM") == 0){
           total += 1.25f;
       }else if(disponibilidad.compareTo("DA") == 0) {
           total += 1.66f;  
       }
       
       if(integridad.compareTo("IB") == 0){
           total += 0.83f;
       }else if(integridad.compareTo("IM") == 0){
           total += 1.25f;
       }else if(integridad.compareTo("IA") == 0) {
           total += 1.66f;  
       }
       
       if(confidencialidad.compareTo("IPB") == 0){
           total += 0.83f;
       }else if(confidencialidad.compareTo("IPC") == 0){
           total += 1.25f;
       }else if(confidencialidad.compareTo("IPR") == 0) {
           total += 1.66f;  
       }
       
       if(total >= 4.98){
           total = 5;
       }
       return total;
    }

    public String generarCodigoActivo(){
        List<Activo> activosGuardados = GuardadoDatos.getActivos();
        
        if(activosGuardados.isEmpty()){
            return "A0001";
        }else{
            Activo ultimoActivo = activosGuardados.get(activosGuardados.size() - 1);
        
            String ultimoCodigo = ultimoActivo.getCodigoActivo();
            
            String num = ultimoCodigo.substring(1);
            
            
            int nuevoNum = Integer.valueOf(num);
            
            num = String.valueOf(nuevoNum);
                    
            nuevoNum++;
            String nuevoCodigo = "";
            
            if(num.length() < 4){
                int resta = 4 - num.length();
                
                for(int i = 0; i < resta; i++){
                    nuevoCodigo = nuevoCodigo + "0";
                }
                
                num = nuevoCodigo + nuevoNum;
            }
            
            nuevoCodigo = "A" + num;
            
            return nuevoCodigo;
        }
    }
    
    public TipoDeActivo getTipoActivo() {
        return tipoActivo;
    }

    public void setTipoActivo(TipoDeActivo tipoActivo) {
        this.tipoActivo = tipoActivo;
    }

    public Tag getTagActivo() {
        return tagActivo;
    }

    public void setTagActivo(Tag tagActivo) {
        this.tagActivo = tagActivo;
    }

    public ValoracionLarga getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(ValoracionLarga disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public ValoracionIntegtridad getIntegridad() {
        return integridad;
    }

    public void setIntegridad(ValoracionIntegtridad integridad) {
        this.integridad = integridad;
    }

    public ValoracionCorta getConfidencialidad() {
        return confidencialidad;
    }

    public void setConfidencialidad(ValoracionCorta confidencialidad) {
        this.confidencialidad = confidencialidad;
    }

    public String getNombreActivo() {
        return nombreActivo;
    }

    public void setNombreActivo(String nombreActivo) {
        this.nombreActivo = nombreActivo;
    }

    public String getCodigoActivo() {
        return codigoActivo;
    }

    public void setCodigoActivo(String codigoActivo) {
        this.codigoActivo = codigoActivo;
    }

    @Override
    public String toString() {
        return "Activo{" + "nombreActivo=" + nombreActivo + ", codigoActivo=" + codigoActivo + ", tipoActivo=" + tipoActivo + ", tagActivo=" + tagActivo + ", confidencialidad=" + confidencialidad + ", integridad=" + integridad + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
}
