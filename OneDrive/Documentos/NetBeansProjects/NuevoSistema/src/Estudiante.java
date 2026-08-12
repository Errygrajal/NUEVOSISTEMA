/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Deilyn Medrano
 */
public class Estudiante {
    private String cedula;
    private String nombre;
    private String carrera;

    public Estudiante(String cedula, String nombre, String carrera) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " (Cédula: " + cedula + ", Carrera: " + carrera + ")";
    }
}
