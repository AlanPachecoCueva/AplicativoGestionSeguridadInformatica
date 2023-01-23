/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionRiesgos;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class CategoriaAmenaza {
    private String categoriaAmenaza;
    private String amenaza;
    
    private static ArrayList<String> categorias = new ArrayList<String>();
    
    //, , , , CABLING, FURNITURE, SAFE
    private static ArrayList<String> amenazasNaturales = new ArrayList<String>();
    private static ArrayList<String> amenazasIndustriales = new ArrayList<String>();
    private static ArrayList<String> amenazasNoIntencionadas = new ArrayList<String>();
    private static ArrayList<String> amenazasIntencionadas = new ArrayList<String>();

    public CategoriaAmenaza() {
        this.setearListasDeAmenazas();
    }
    
    public CategoriaAmenaza(String categoria, String amenaza) {
        this.categoriaAmenaza = categoria;
        this.amenaza = amenaza;
    }
    
    public void setearListasDeAmenazas(){
        //Categorías de amenazas
        
        //#0
        categorias.add("DESASTRES_NATURALES");
        //#1
        categorias.add("ORIGEN_INDUSTRIAL");
        //#2
        categorias.add("NO_INTENCIONADOS");
        //#3
        categorias.add("ATAQUES_INTENCIONADOS");
        
        //Amenazas de categoría: DESASTRES_NATURALES
        //#0
        amenazasNaturales.add("Fuego");
        //#1
        amenazasNaturales.add("Daños Por Agua");
        //#2
        amenazasNaturales.add("Desastres Naturales");
        
        //Amenazas de categoría: ORIGEN_INDUSTRIAL
        //#0
        amenazasIndustriales.add("Fuego");
        //#1
        amenazasIndustriales.add("Daños Por Agua");
        //#2
        amenazasIndustriales.add("Desastres Industriales");
        //#3
        amenazasIndustriales.add("Contaminación Mecánica");
        //#4
        amenazasIndustriales.add("Contaminación Electromagnética");
        //#5
        amenazasIndustriales.add("Avería de Origen Físico o Lógico");
        //#6
        amenazasIndustriales.add("Corte del Suministro Eléctrico");
        //#7
        amenazasIndustriales.add("Condiciones Inadecuadas de Temperatura o Humedad");
        //#8
        amenazasIndustriales.add("Fallo de Servicios de Comunicaciones");
        //#9
        amenazasIndustriales.add("Interrupciones de Servicios y Suministros Esenciales");
        //#10
        amenazasIndustriales.add("Degradación de Soportes de Almacenamiento de Información");
        //#11
        amenazasIndustriales.add("Emanaciones Electromagnéticas");
        //#12
        amenazasIndustriales.add("Corte del Suministro Eléctrico");
        
        //Amenazas de categoría: NO_INTENCIONADOS
        //#0
        amenazasNoIntencionadas.add("Errores de los Usuarios");
        //#1
        amenazasNoIntencionadas.add("Errores del Administrador");
        //#2
        amenazasNoIntencionadas.add("Error de monitorización");
        //#3
        amenazasNoIntencionadas.add("Errores de Configuración");
        //#4
        amenazasNoIntencionadas.add("Deficiencias de la Organización");
        //#5
        amenazasNoIntencionadas.add("Difusión de Software Dañino");
        //#6
        amenazasNoIntencionadas.add("Errores de Re-encaminamiento");
        //#7
        amenazasNoIntencionadas.add("Errores de Secuencia");
        //#8
        amenazasNoIntencionadas.add("Escapes de Información");
        //#9
        amenazasNoIntencionadas.add("Alteración Accidental de la Información");
        //#10
        amenazasNoIntencionadas.add("Destrucción de la Información");
        //#11
        amenazasNoIntencionadas.add("Fugas de Información");
        //#12
        amenazasNoIntencionadas.add("Vulnerabilidades de los Programas");
        //#13
        amenazasNoIntencionadas.add("Errores de Mantenimiento/Actualización Programas");
        //#14
        amenazasNoIntencionadas.add("Errores de Mantenimiento/Actualización Hardware");
        //#15
        amenazasNoIntencionadas.add("Caída del Sistema por Agotamiento de Recursos");
        //#16
        amenazasNoIntencionadas.add("Pérdida de Equipos");
        //#17
        amenazasNoIntencionadas.add("Indisponibilidad del Personal");
        
        
        //Amenazas de categoría: ATAQUES_INTENCIONADOS
        //#0
        amenazasIntencionadas.add("Manipulación de los Registros de Actividad");
        //#1
        amenazasIntencionadas.add("Manipulación de Configuración");
        //#2
        amenazasIntencionadas.add("Suplantación de la Identidad del Usuario");
        //#3
        amenazasIntencionadas.add("Abuso de Privilegios de Acceso");
        //#4
        amenazasIntencionadas.add("Uso no Previsto");
        //#5
        amenazasIntencionadas.add("Difusión de Software Dañino");
        //#6
        amenazasIntencionadas.add("Re-encaminamiento de Mensajes");
        //#7
        amenazasIntencionadas.add("Alteración de Secuencia");
        //#8
        amenazasIntencionadas.add("Acceso no Autorizado");
        //#9
        amenazasIntencionadas.add("Análisis de Tráfico");
        //#10
        amenazasIntencionadas.add("Repudio");
        //#11
        amenazasIntencionadas.add("Intercepción de Información");
        //#12
        amenazasIntencionadas.add("Modificación Deliberada de la Información");
        //#13
        amenazasIntencionadas.add("Destrucción de la Información");
        //#14
        amenazasIntencionadas.add("Divulgación de Información");
        //#15
        amenazasIntencionadas.add("Manipulación de Programas");
        //#16
        amenazasIntencionadas.add("Manipulación de los Equipos");
        //#17
        amenazasIntencionadas.add("Denegación de Servicio");
        //#18
        amenazasIntencionadas.add("Robo");
        //#19
        amenazasIntencionadas.add("Ataque Destructivo");
        //#20
        amenazasIntencionadas.add("Ocupación Enemiga");
        //#21
        amenazasIntencionadas.add("Indisponibilidad del Personal:");
        //#22
        amenazasIntencionadas.add("Extorsión");
        //#23
        amenazasIntencionadas.add("Ingeniería Social");
    }

    public ArrayList<String> devolverAmenazasSegunCategoria(String categoriaAmenaza){
        if(categoriaAmenaza.compareTo("DESASTRES_NATURALES") == 0){
            return amenazasNaturales;
        }else if(categoriaAmenaza.compareTo("ORIGEN_INDUSTRIAL") == 0){
            return amenazasIndustriales;
        }else if(categoriaAmenaza.compareTo("NO_INTENCIONADOS") == 0){
            return amenazasNoIntencionadas;
        }else if(categoriaAmenaza.compareTo("ATAQUES_INTENCIONADOS") == 0){
            return amenazasIntencionadas;
        }else{
            return null;
        }
    }
    
    public String getCategoriaAmenaza() {
        return categoriaAmenaza;
    }

    public void setCategoriaAmenaza(String categoriaAmenaza) {
        this.categoriaAmenaza = categoriaAmenaza;
    }

    public String getAmenaza() {
        return amenaza;
    }

    public void setAmenaza(String amenaza) {
        this.amenaza = amenaza;
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public ArrayList<String> getAmenazasNaturales() {
        return amenazasNaturales;
    }

    public ArrayList<String> getAmenazasIndustriales() {
        return amenazasIndustriales;
    }


    public ArrayList<String> getAmenazasNoIntencionadas() {
        return amenazasNoIntencionadas;
    }

    public ArrayList<String> getAmenazasIntencionadas() {
        return amenazasIntencionadas;
    }

}
