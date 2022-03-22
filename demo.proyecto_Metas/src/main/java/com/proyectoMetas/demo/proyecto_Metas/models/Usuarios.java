package com.proyectoMetas.demo.proyecto_Metas.models;


import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "correo")
    private String correo;
    private String nombre;
    private Integer edad ;
    private String password;

    @Column(name = "Rol_idRol")
    private Integer rolIdrol;

    public Integer getRolIdrol() {
        return rolIdrol;
    }

    public void setRolIdrol(Integer rolIdrol) {
        this.rolIdrol = rolIdrol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
