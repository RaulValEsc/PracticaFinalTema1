/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Registro;
import Vista.VistaPrincipal;

/**
 *
 * @author raulv
 */
public class Ctrl_Registros {
    
    boolean check;

    public Ctrl_Registros() {}

    public boolean anadirRegistro(Registro r) {
        check = true;
        if (comprobarMatricula(r.getnMatricula())) {
            VistaPrincipal.alRegistros.add(r);
        } else {
            check = false;
        }
        return check;
    }

    public boolean borrarRegistro(int nMatricula) {
        check = true;
        if (comprobarMatricula(nMatricula)) {
            check = false;
        } else {
            for (int x = 0; x < VistaPrincipal.alRegistros.size(); x++) {
                if (VistaPrincipal.alRegistros.get(x).getnMatricula() == nMatricula) {
                    VistaPrincipal.alRegistros.remove(x);
                    break;
                }
            }
        }
        return check;
    }
    
    public boolean editarRegistro(Registro r){
        check = true;
        if (comprobarMatricula(r.getnMatricula())) {
            check = false;
        } else {
            for (int x = 0; x < VistaPrincipal.alRegistros.size(); x++) {
                if (VistaPrincipal.alRegistros.get(x).getnMatricula() == r.getnMatricula()) {
                    VistaPrincipal.alRegistros.remove(x);
                    break;
                }
            }
            VistaPrincipal.alRegistros.add(r);
        }
        return check;
    }
    
    public void buscarRegistro(){
        
    }

    private boolean comprobarMatricula(int nMatricula) {
        boolean checkComprobar = true;
        for (int x = 0; x < VistaPrincipal.alRegistros.size(); x++) {
            if (VistaPrincipal.alRegistros.get(x).getnMatricula() == nMatricula) {
                checkComprobar = false;
            }
        }
        return checkComprobar;
    }
}