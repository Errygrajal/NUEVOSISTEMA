/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevosistema;

/**
 *@
 * author UTN
 */
public class matricula {
    // Atributos privados
    private String numero;
    private String fechaRegistro;
    private String estado; // Activa, Inactiva, Suspendida


    // Constructor con parámetros
    public matricula(String numero, String fechaRegistro, String estado) {
        this.numero = validarNumero(numero) ? numero : "000000";
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    // Método de validación simple de número de matrícula
    private boolean validarNumero(String num) {
        return num != null && num.length() >= 6 && num.length() <= 10;
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (validarNumero(numero)) {
            this.numero = numero;
        } else {
            System.out.println("Número de matrícula no válido");
        }
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para mostrar información
    @Override
    public String toString() {
        return "Matrícula{" +
                "Número='" + numero + '\'' +
                ", Fecha Registro='" + fechaRegistro + '\'' +
                ", Estado='" + estado + '\'' +
                '}';
    }
}
 
