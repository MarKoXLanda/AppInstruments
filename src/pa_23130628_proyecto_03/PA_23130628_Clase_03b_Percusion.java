/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_23130628_proyecto_03;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Fer Landa Santi
 */
//Esta es nuestra clase hija de instrumento, le ponemos los atributos de instrumentos y le implementamos los metodos de la interface
 class Percusion extends Instrumento implements Movible{
     //Agregamos los atributos categoria y caracteristica
    protected String categoria;
    protected String caracteristica;

    //Constructor
    public Percusion(String marca, String color, String categoria,String caracteristica) {
        super(marca, color);
        this.categoria = categoria;
         this.color=color;
         this.marca=marca;
         this.caracteristica=caracteristica;
    }
//Metodos de la interface movible
    @Override
    public void dibujar(Graphics g, JPanel jPanelDibujo) {
        
    }

    @Override
    public void mover(Graphics g, JPanel jPanelDibujo, int x, int y) {
        
    }
}
