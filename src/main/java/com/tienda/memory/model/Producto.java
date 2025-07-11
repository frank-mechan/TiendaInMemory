/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nayke
 */
package com.tienda.memory.model;

// NO necesitas importar las anotaciones de Spring aquí
// Solo las clases de Java estándar

public class Producto {
    private Long id;
    private String nombre;
    private String categoria;
    private double precio;

    // 1. CONSTRUCTOR VACÍO (MUY IMPORTANTE para Spring y librerías como Jackson)
    public Producto() {
    }

    // 2. CONSTRUCTOR CON TODOS LOS CAMPOS (incluyendo ID)
    public Producto(Long id, String nombre, String categoria, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    // 3. CONSTRUCTOR SIN ID (para cuando creas un nuevo producto y el ID se genera automáticamente)
    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    // GETTERS Y SETTERS (Asegúrate de que sean 'public')
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", categoria='" + categoria + '\'' +
               ", precio=" + precio +
               '}';
    }
}