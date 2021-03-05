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
public class Autos {
   
    private int VIN,cant_pas,cap_mal;
    public String marca,modelo,tipo_carr,color;
    private double pot_mot,precio;

    public Autos(int VIN, int cant_pas, int cap_mal, String marca, String modelo, String tipo_carr, String color, double pot_mot, double precio) {
        this.VIN = VIN;
        this.cant_pas = cant_pas;
        this.cap_mal = cap_mal;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo_carr = tipo_carr;
        this.color = color;
        this.pot_mot = pot_mot;
        this.precio = precio;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public int getCant_pas() {
        return cant_pas;
    }

    public void setCant_pas(int cant_pas) {
        this.cant_pas = cant_pas;
    }

    public int getCap_mal() {
        return cap_mal;
    }

    public void setCap_mal(int cap_mal) {
        this.cap_mal = cap_mal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo_carr() {
        return tipo_carr;
    }

    public void setTipo_carr(String tipo_carr) {
        this.tipo_carr = tipo_carr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPot_mot() {
        return pot_mot;
    }

    public void setPot_mot(double pot_mot) {
        this.pot_mot = pot_mot;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Autos" + "modelo=" + modelo;
    }
    
    
    
    
    
}
