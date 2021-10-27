/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author raulv
 */
public class Registro {

    int nMatricula;
    String nombre;
    Date fNacimiento;
    Double nota;

    public Registro(int matricula, String nombre, Date fNacimiento, Double nota) {
        this.nMatricula = matricula;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.nota = nota;
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int matricula) {
        this.nMatricula = matricula;
    }

    public int getEdad() {
        LocalDate fechaHoy = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fNacimiento.toString(),formatter);

        Period periodo = Period.between(fechaNacimiento, fechaHoy);

        return periodo.getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

}
