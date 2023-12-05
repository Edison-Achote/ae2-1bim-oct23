/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasejava;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
/**
 *
 * @author erach
 */
public class empresa {
    
    private String nombre;
    private String direccion;
    private String identificacionFiscal;
    private String sectorActividad;
    private int empleados;
    private double ingresosAnuales;
    private String sitioWeb;
    private String contactoPrincipal;
    private String numeroTelefono;

    // Constructor vacío
    public empresa() {
    }

    // Constructor con parámetros
    public empresa(String nombre, String direccion, String identificacionFiscal, String sectorActividad, int empleados, double ingresosAnuales, String sitioWeb, String contactoPrincipal, String numeroTelefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.identificacionFiscal = identificacionFiscal;
        this.sectorActividad = sectorActividad;
        this.empleados = empleados;
        this.ingresosAnuales = ingresosAnuales;
        this.sitioWeb = sitioWeb;
        this.contactoPrincipal = contactoPrincipal;
        this.numeroTelefono = numeroTelefono;
    }

    // Métodos getters y setters para acceder y modificar atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdentificacionFiscal() {
        return identificacionFiscal;
    }

    public void setIdentificacionFiscal(String identificacionFiscal) {
        this.identificacionFiscal = identificacionFiscal;
    }

    public String getSectorActividad() {
        return sectorActividad;
    }

    public void setSectorActividad(String sectorActividad) {
        this.sectorActividad = sectorActividad;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getContactoPrincipal() {
        return contactoPrincipal;
    }

    public void setContactoPrincipal(String contactoPrincipal) {
        this.contactoPrincipal = contactoPrincipal;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    void setId(int proximoId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Empresa: " + nombre + " Direccion: " + direccion + ", Id Ficscal: " + identificacionFiscal + " Actividad Sectorial: "+sectorActividad + 
                " Cant. Empleados: "+empleados + " Ingresos Anuales: "+ingresosAnuales+ " Sitio Web: "+ sitioWeb + " Contacto Principal: "+ contactoPrincipal +
                " Numero Contacto: " + numeroTelefono; 
    }
    
    
}