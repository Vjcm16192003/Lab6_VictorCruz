/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_victor_cruz;

import java.util.ArrayList;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Cliente {
    private int ID;
    private String Nombre,Apellido,nacionalidad,lugar_trabajo,puesto_trabajo,username,clave;
    private Double dinero_act;
    private ArrayList <Autos> VIN = new ArrayList();
   
    public Cliente() {
    }

   /* public Cliente(int ID, String Nombre, String Apellido, String nacionalidad, String lugar_trabajo, String puesto_trabajo, String username, String clave, Double dinero_act, ArrayList VIN) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.nacionalidad = nacionalidad;
        this.lugar_trabajo = lugar_trabajo;
        this.puesto_trabajo = puesto_trabajo;
        this.username = username;
        this.clave = clave;
        this.dinero_act = dinero_act;
        this.VIN = VIN;
    }*/

    public Cliente(int ID, String Nombre, String Apellido, String nacionalidad, String lugar_trabajo, String puesto_trabajo, Double dinero_act) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.nacionalidad = nacionalidad;
        this.lugar_trabajo = lugar_trabajo;
        this.puesto_trabajo = puesto_trabajo;
        this.dinero_act = dinero_act;
    }
    
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar_trabajo() {
        return lugar_trabajo;
    }

    public void setLugar_trabajo(String lugar_trabajo) {
        this.lugar_trabajo = lugar_trabajo;
    }

    public String getPuesto_trabajo() {
        return puesto_trabajo;
    }

    public void setPuesto_trabajo(String puesto_trabajo) {
        this.puesto_trabajo = puesto_trabajo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getDinero_act() {
        return dinero_act;
    }

    public void setDinero_act(Double dinero_act) {
        this.dinero_act = dinero_act;
    }

    public ArrayList getVIN() {
        return VIN;
    }

    public void setVIN(Autos V) {
       VIN.add(V); 
    }

    
}
