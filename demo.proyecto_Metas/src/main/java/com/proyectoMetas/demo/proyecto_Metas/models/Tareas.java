package com.proyectoMetas.demo.proyecto_Metas.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "tareas")
public class Tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String meta;

    private Date fecha_meta;


    @Column(name = "usuario_correo")
    private String usuarioCorreo;


    public String getUsuarioCorreo() {
        return usuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        this.usuarioCorreo = usuarioCorreo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Date getFecha_meta() {
        return fecha_meta;
    }

    public void setFecha_meta(Date fecha_meta) {
        this.fecha_meta = fecha_meta;
    }



    //https://programmerclick.com/article/6994892329/
}
