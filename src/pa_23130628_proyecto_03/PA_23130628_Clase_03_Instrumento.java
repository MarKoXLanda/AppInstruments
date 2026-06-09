/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_23130628_proyecto_03;


/**
 *
 * @author Fer Landa Santi
 */
//Creamos la clase pádre con los atributos marca y color
 abstract class Instrumento {
    String marca;
    String color;

    public Instrumento(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
 }