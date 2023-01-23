/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionRiesgos;

import Clases.Activo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josue
 */
public class Riesgo {
    private String nombre;
    private String descripcion;
    private CategoriaAmenaza categoriaAmenaza;
    private Vulnerabilidades vulnerabilidad;
    
    private int nivelAceptableDeRiesgo;
    private int nivelDeRiesgo;
    private String impacto; //Directo - Indirecto
    private int posibilidadDeOCurrir; //0-7
    
//Afecta a un activo
    private Activo activoEnRiesgo;
    
    public Riesgo(String nombre, String descripcion, CategoriaAmenaza categoriaAmenaza, Vulnerabilidades vulnerabilidad, int nivelAceptableDeRiesgo, int nivelDeRiesgo, String impacto, int posibilidadDeOCurrir, Activo activo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoriaAmenaza = categoriaAmenaza;
        this.vulnerabilidad = vulnerabilidad;
        this.nivelAceptableDeRiesgo = nivelAceptableDeRiesgo;
        this.nivelDeRiesgo = nivelDeRiesgo;
        this.impacto = impacto;
        this.posibilidadDeOCurrir = posibilidadDeOCurrir;
        this.activoEnRiesgo = activo;
    }

    public boolean modificarRiesgo(Riesgo riesgoNuevo){
        this.nombre = riesgoNuevo.getNombre();
        this.descripcion = riesgoNuevo.getDescripcion();
        this.categoriaAmenaza = riesgoNuevo.getCategoriaAmenaza();
        this.vulnerabilidad = riesgoNuevo.getVulnerabilidad();
        this.nivelAceptableDeRiesgo = riesgoNuevo.getNivelAceptableDeRiesgo();
        this.nivelDeRiesgo = riesgoNuevo.getNivelDeRiesgo();
        this.impacto = riesgoNuevo.getImpacto();
        this.posibilidadDeOCurrir = riesgoNuevo.getPosibilidadDeOCurrir();
        this.activoEnRiesgo = riesgoNuevo.getActivoEnRiesgo();
        
        return true;
    }
    
    public Activo getActivoEnRiesgo() {
        return activoEnRiesgo;
    }

    public void setActivoEnRiesgo(Activo activoEnRiesgo) {
        this.activoEnRiesgo = activoEnRiesgo;
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

    public CategoriaAmenaza getCategoriaAmenaza() {
        return categoriaAmenaza;
    }

    public void setCategoriaAmenaza(CategoriaAmenaza categoriaAmenaza) {
        this.categoriaAmenaza = categoriaAmenaza;
    }

    public Vulnerabilidades getVulnerabilidad() {
        return vulnerabilidad;
    }

    public void setVulnerabilidad(Vulnerabilidades vulnerabilidad) {
        this.vulnerabilidad = vulnerabilidad;
    }

    public int getNivelAceptableDeRiesgo() {
        return nivelAceptableDeRiesgo;
    }

    public void setNivelAceptableDeRiesgo(int nivelAceptableDeRiesgo) {
        this.nivelAceptableDeRiesgo = nivelAceptableDeRiesgo;
    }

    public int getNivelDeRiesgo() {
        return nivelDeRiesgo;
    }

    public void setNivelDeRiesgo(int nivelDeRiesgo) {
        this.nivelDeRiesgo = nivelDeRiesgo;
    }

    public String getImpacto() {
        return impacto;
    }

    public void setImpacto(String impacto) {
        this.impacto = impacto;
    }

    public int getPosibilidadDeOCurrir() {
        return posibilidadDeOCurrir;
    }

    public void setPosibilidadDeOCurrir(int posibilidadDeOCurrir) {
        this.posibilidadDeOCurrir = posibilidadDeOCurrir;
    }

    @Override
    public String toString() {
        return "Riesgo{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", categoriaAmenaza=" + categoriaAmenaza + ", vulnerabilidad=" + vulnerabilidad + ", nivelAceptableDeRiesgo=" + nivelAceptableDeRiesgo + ", nivelDeRiesgo=" + nivelDeRiesgo + ", impacto=" + impacto + ", posibilidadDeOCurrir=" + posibilidadDeOCurrir + '}';
    }
    
    
}
