// https://dzone.com/articles/introduction-to-jaxb-20
package it.jaad.jaxb;

import java.util.Date;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "profe", namespace = "http://www.cibertec.edu.pe/jaad/profesor")
@XmlType(propOrder = {"codigo", "nombre", "apellido", "fechaIngreso", "map"})

public class Profesor {

    private Integer codigo;
    private String nombre;
    private String apellido;
    private Date fechaIngreso;
    private Map<String, String> map;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Profesor [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaIngreso="
                + fechaIngreso + ", map=" + map + "]";
    }


}
