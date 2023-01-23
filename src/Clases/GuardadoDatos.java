/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import GestionRiesgos.Control;
import GestionRiesgos.Riesgo;
import java.util.*;


/**
 *
 * @author josue
 */
public class GuardadoDatos {
    private static List<Activo> activosCreados = new ArrayList<Activo>();
    
    private static List<Riesgo> riesgosCreados = new ArrayList<Riesgo>();
    
    private static List<Control> controlesCreados = new ArrayList<Control>();
    
    //Controles
    public static boolean agregarControl(Control controlNuevo){
        //Si no existe
        if(buscarControlPorNombre(controlNuevo.getNombre())== null){
            //Se agrega
            controlesCreados.add(controlNuevo);
            return true;
        }else{
            //Si ya existe no se agrega
            return false;
        }
    }
    
    public static Control buscarControlPorNombre(String nombreBuscar){
        if(!controlesCreados.isEmpty()){
            for(int i = 0; i <= controlesCreados.size()-1; i++){
                Control controlAux = (Control) controlesCreados.get(i);
                if(controlAux.getNombre().compareTo(nombreBuscar) == 0){
                    return controlAux;
                }
            }
        }
        return null;
    }
    
    public static List getControles(){
        return controlesCreados;
    }
    
    
    
    
    //Riesgos
    public static boolean agregarRiesgo(Riesgo riesgoNuevo){
        //Si no existe
        if(buscarRiesgoPorNombre(riesgoNuevo.getNombre())== null){
            //Se agrega
            riesgosCreados.add(riesgoNuevo);
            return true;
        }else{
            //Si ya existe no se agrega
            return false;
        }
    }
    
    public static Riesgo buscarRiesgoPorNombre(String nombreBuscar){
        if(!riesgosCreados.isEmpty()){
            for(int i = 0; i <= riesgosCreados.size()-1; i++){
                Riesgo riesgoAux = (Riesgo) riesgosCreados.get(i);
                if(riesgoAux.getNombre().compareTo(nombreBuscar) == 0){
                    return riesgoAux;
                }
            }
        }
        return null;
    }
    
    public static List getRiesgos(){
        return riesgosCreados;
    }
    
    //Activos
    public static boolean agregarActivo(Activo activoNuevo){
        if(buscarActivoPorCodigo(activoNuevo.getCodigoActivo()) == null && buscarActivoPorNombre(activoNuevo.getNombreActivo()) == null){
            activosCreados.add(activoNuevo);
            return true;
        }else{
            return false;
        }
    }
    
    public static List getActivos(){
        return activosCreados;
    }
    
    public static Activo buscarActivoPorCodigo(String codigoBuscar){
        if(!activosCreados.isEmpty()){
            for(int i = 0; i <= activosCreados.size()-1; i++){
                Activo activoAux = (Activo) activosCreados.get(i);
                if(activoAux.getCodigoActivo().compareTo(codigoBuscar) == 0){
                    return activoAux;
                }
            }
        }
        return null;
    }
    
    public static Activo buscarActivoPorNombre(String nombreBuscar){
        if(!activosCreados.isEmpty()){
            for(int i = 0; i <= activosCreados.size()-1; i++){
                Activo activoAux = (Activo) activosCreados.get(i);
                if(activoAux.getNombreActivo().compareTo(nombreBuscar) == 0){
                    return activoAux;
                }
            }
        }
        return null;
    }
    
    public static Activo eliminarActivoPorCodigo(String codigoBuscar){
        for(int i = 0; i <= activosCreados.size(); i++){
            Activo activoAux = (Activo) activosCreados.get(i);
            if(activoAux.getNombreActivo().compareTo(codigoBuscar) == 0){
                activosCreados.remove(i);
                return activoAux;
            }
        }
        
        return null;
    }
}
