/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author raulv
 */
public class Registro {

    int id;
    String nombre;
    Date fNacimiento;
    Double nota;

    public Registro(int id, String nombre, Date fNacimiento, Double nota) {
        this.id = id;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad(Date fecha) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(fecha.getYear(), fecha.getMonth(), fecha.getDay());

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