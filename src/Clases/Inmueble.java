/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public abstract class Inmueble {
    private long idInmueble;
    private String localidad;
    private String direccion;
    private String tamanio;
    private ArrayList <Locador> locador;

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<Locador> getLocador() {
        return locador;
    }

    public void setLocador(ArrayList<Locador> locador) {
        this.locador = locador;
    }

    public Inmueble(String localidad, String direccion, String tamanio, ArrayList<Locador> locador) {
        this.localidad = localidad;
        this.direccion = direccion;
        this.tamanio = tamanio;
        this.locador = locador;
    }

    public Inmueble() {
    }
    
    
}