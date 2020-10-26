/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formularios;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Johan
 */
@Named(value = "indexController")
@RequestScoped
public class IndexController {
    private String nombre;//Campo
    private int edad;//Campo
    private String descripcion;//Area de texto
    private String  dia;//Combo de seleccion
    private String genero;//RadioButtons
    private String [] idioma;//CheckBox
    private List<String> profesionList;//Lista de seleccion Multiple
    private List<String> profesionSeleccionada;//Lista para almacenar elementos seleccionados
    public IndexController() {
        profesionList = new ArrayList<String>();
        profesionList.add("Bachiller"); profesionList.add("Tecnico");
        profesionList.add("Tecnologo"); profesionList.add("Profesional");
        profesionList.add("Especialista"); profesionList.add("Maestria");
        profesionList.add("Doctorado");
    }
    public void imprimir(){
        System.out.println("Dato: "+this.nombre);
        System.out.println("Dato: "+this.dia);
        System.out.println("Dato: "+this.profesionSeleccionada);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public List<String> getProfesionList() {
        return profesionList;
    }

    public void setProfesionList(List<String> profesionList) {
        this.profesionList = profesionList;
    }

    public List<String> getProfesionSeleccionada() {
        return profesionSeleccionada;
    }

    public void setProfesionSeleccionada(List<String> profesionSeleccionada) {
        this.profesionSeleccionada = profesionSeleccionada;
    }
    
}
