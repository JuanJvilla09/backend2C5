package com.example.backend2Class4.models;

import com.example.backend2Class4.ayudas.Estadoasistencia;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "fecha", nullable = false,unique = false)
    private LocalDate fecha;
    @Column(name = "obeservacion", nullable = false,unique = false , length = 500)
    private String observacion;
    @Column(name = "estadoAsistencia", nullable = false,unique = false)
    @Enumerated(EnumType.STRING)
    private Estadoasistencia estado;

    public Asistencia() {
    }

    public Asistencia(Integer id, LocalDate fecha, String observacion, Estadoasistencia estado) {
        this.id = id;
        this.fecha = fecha;
        this.observacion = observacion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Estadoasistencia getEstado() {
        return estado;
    }

    public void setEstado(Estadoasistencia estado) {
        this.estado = estado;
    }
}
