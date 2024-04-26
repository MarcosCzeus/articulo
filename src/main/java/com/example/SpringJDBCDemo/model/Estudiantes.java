package com.example.SpringJDBCDemo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Estudiantes {
    private int carnet;
    private String nombre;
    private String carrera;

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String toString() {
        return "Estudiante [carnet=" + carnet + ", nombre=" + nombre + ", carrera=" + carrera + "]";
    }
}
