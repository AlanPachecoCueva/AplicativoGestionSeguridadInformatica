/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Clases;

import ENUMS.*;

/**
 *
 * @author josue
 */
public class Tag {
    private TagEquipamentoCelular Equipamento_Celular;
    private TagEquiposInformaticos Equipos_Informaticos;
    private TagInstalaciones Instalaciones;
    private TagPersonal Personal;
    private TagRedesDeComunicaciones Redes_De_Comunicaciones;
    private TagServicios Servicios;
    private TagSoftware Software;
    
    private TagsType tipoDeTag;

    public Tag() {}

    public TagEquipamentoCelular gettEquipamento_Celular() {
        return Equipamento_Celular;
    }
    
    public String returnTypeOfTag(){
        String aux = "";
        if(Equipamento_Celular != null){
            aux = "Equipamento_Celular";
        }
        else if(Equipos_Informaticos != null){
            aux = "Equipos_Informaticos";
        }
        else if(Instalaciones != null){
            aux = "Instalaciones";        }
        else if(Personal != null){
            aux = "Personal";
        }
        else if(Redes_De_Comunicaciones != null){
            aux = "Redes_De_Comunicaciones";
        }
        else if(Servicios != null){
            aux = "Servicios";
        }
        else if(Software != null){
            aux = "Software";
        }
        
        return aux;
    }

    public void setTag(String typeTag, String tag){
        tipoDeTag = TagsType.valueOf(typeTag);
        if(typeTag.compareTo("Equipamento_Celular") == 0){
            Equipamento_Celular = TagEquipamentoCelular.valueOf(tag);
        }
        else if(typeTag.compareTo("Equipos_Informaticos") == 0){
            Equipos_Informaticos = TagEquiposInformaticos.valueOf(tag);
        }
        else if(typeTag.compareTo("Instalaciones") == 0){
            Instalaciones = TagInstalaciones.valueOf(tag);      
        }
        else if(typeTag.compareTo("Personal") == 0){
            Personal = TagPersonal.valueOf(tag);  
        }
        else if(typeTag.compareTo("Redes_De_Comunicaciones") == 0){
            Redes_De_Comunicaciones = TagRedesDeComunicaciones.valueOf(tag);  
        }
        else if(typeTag.compareTo("Servicios") == 0){
            Servicios = TagServicios.valueOf(tag);  
        }
        else if(typeTag.compareTo("Software") == 0){
            Software = TagSoftware.valueOf(tag);  
        }
        
    }
    
    public String getTag(){
        if(Equipamento_Celular != null){
            return Equipamento_Celular.toString();
        }
        else if(Equipos_Informaticos != null){
            return Equipos_Informaticos.toString();
        }
        else if(Instalaciones != null){
            return Instalaciones.toString();    
        }
        else if(Personal != null){
            return Personal.toString();
        }
        else if(Redes_De_Comunicaciones != null){
            return Redes_De_Comunicaciones.toString(); 
        }
        else if(Servicios != null){
            return Servicios.toString(); 
        }
        else if(Software!= null){
            return Software.toString();  
        }
        
        return null;
    }
    
    /*public TagsType getTipoDeTag() {
        return tipoDeTag;
    }

    public void setTipoDeTag(TagsType tipoDeTag) {
        this.tipoDeTag = tipoDeTag;
    }*/
    
    
    
    
}
