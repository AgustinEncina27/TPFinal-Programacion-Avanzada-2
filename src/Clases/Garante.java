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
public class Garante extends Persona{
        private String actividadALaQueSeDedica;
	private RelacionDeDependencia dependencia;
	private ArrayList<TrabajoIndependiente> trabajoDependiente;

    public String getActividadALaQueSeDedica() {
        return actividadALaQueSeDedica;
    }

    public void setActividadALaQueSeDedica(String actividadALaQueSeDedica) {
        this.actividadALaQueSeDedica = actividadALaQueSeDedica;
    }

    public RelacionDeDependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(RelacionDeDependencia dependencia) {
        this.dependencia = dependencia;
    }

    public ArrayList<TrabajoIndependiente> getTrabajoDependiente() {
        return trabajoDependiente;
    }

    public void setTrabajoDependiente(ArrayList<TrabajoIndependiente> trabajoDependiente) {
        this.trabajoDependiente = trabajoDependiente;
    }

    public Garante(String actividadALaQueSeDedica, RelacionDeDependencia dependencia, ArrayList<TrabajoIndependiente> trabajoDependiente, long idPersina, String nombre, String apellido, double dni, String estadoCivil, String domicilio, String telefono, String correoElectronico) {
        super(idPersina, nombre, apellido, dni, estadoCivil, domicilio, telefono, correoElectronico);
        this.actividadALaQueSeDedica = actividadALaQueSeDedica;
        this.dependencia = dependencia;
        this.trabajoDependiente = trabajoDependiente;
    }

    public Garante() {
    }
           
}