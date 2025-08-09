package com.example.backend2Class4.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "estudiante")

public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="promedio",nullable = false,unique = false)
    private Double proemdio;
    @Column(name = "fechaNacimiento",nullable = false, unique = false)
    private LocalDate fechaNacimiento;

    //RELACIONANDOME CON UN USUARIO
    @OneToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    @JsonManagedReference(value = "relacionEstudianteUsuario")
    private Usuario usuario;

    public Estudiante() {
    }

    public Estudiante(Integer id, Double proemdio, LocalDate fechaNacimiento) {
        this.id = id;
        this.proemdio = proemdio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getProemdio() {
        return proemdio;
    }

    public void setProemdio(Double proemdio) {
        this.proemdio = proemdio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
