/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_23130628_proyecto_03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Fer Landa Santi
 */
//Clase hija de la clase Viento
class Clarinete extends Viento{


    //Constructores
    public Clarinete(String marca, String color, String forma, String caracteristica) {
        super(marca, color, forma, caracteristica);
         this.forma=forma;
         this.color=color;
         this.marca=marca;
         this.caracteristica=caracteristica;
    }
    
    public void Clarinete(){
        forma="No tiene forma";
        color="No tiene color";
        marca="No tiene marca";
        caracteristica="No tiene caracteristica";
        
    }
    //Constructor sin parametros
    public Clarinete() {
        super("No tiene marca", "No tiene color", "No tiene forma", "No tiene característica");
    }
//getter y setter
    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Metodos de la interface
    @Override
    public void dibujar(Graphics g, JPanel jPanelDibujo) {
        //Dibujamos usando la clase Graphics a base de coordenadas del JPanel
         g = jPanelDibujo.getGraphics();
         // Fondo
        g.setColor(new Color(173, 216, 230)); // Cyan oscuro
         g.fillRect(0, 0, 519, 504);
        
        // Cuerpo del clarinete
        g.setColor(Color.BLACK);
        g.fillRect(110, 130, 240, 25);
        g.fillRect(335, 120, 25, 45);
       
        
        // Tubo del clarinete
        g.setColor(new Color(218, 165, 32)); // Color dorado
        g.fillRect(183, 120, 10, 16);
        g.fillRect(208, 120, 10, 16);
        g.fillRect(234, 120, 10, 16);
        g.fillRect(258, 120, 10, 16);
        g.fillRect(183, 115, 85, 8);
        g.setColor(Color.GRAY);
        g.drawLine(183, 117, 267, 117);

        
        // Agujeros del clarinete
        g.setColor(Color.GRAY);
        g.fillOval(156, 135, 15, 15);
        g.fillOval(181, 135, 15, 15);
        g.fillOval(206, 135, 15, 15);
        g.fillOval(231, 135, 15, 15);
        g.fillOval(256, 135, 15, 15);
        g.fillOval(281, 135, 15, 15);
        

        
        // Detalles en el cuerpo
        g.setColor(Color.GRAY);
        g.fillRect(125, 130, 10, 25);
        g.fillRect(325, 130, 10, 25);
        
        // Texto
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("CLARINETE, YAMAHA, COLOR NEGRO,CONICO,METALICO", 140, 70);
        
        
    }
    
    @Override
    public void mover(Graphics g, JPanel jPanelDibujo, int x, int y) {
        //Redibujamos el dibujo y le agregamos los parametros X e Y para que lo vaya dibujando en una posicion diferente ( lo recorra/mueva)
        g = jPanelDibujo.getGraphics();
         // Fondo
        g.setColor(new Color(173, 216, 230)); // Cyan oscuro
         g.fillRect(0, 0, 519, 504);
        
        // Cuerpo del clarinete
        g.setColor(Color.BLACK);
        g.fillRect(310-x, y+90, 240, 25);
        g.fillRect(535-x, y+80, 25, 45);
       
        
        // Tubo del clarinete
        g.setColor(new Color(218, 165, 32)); // Color dorado
        g.fillRect(383-x, y+80, 10, 16);
        g.fillRect(408-x, y+80, 10, 16);
        g.fillRect(434-x, y+80, 10, 16);
        g.fillRect(458-x, y+80, 10, 16);
        g.fillRect(383-x, y+75, 85, 8);
        g.setColor(Color.GRAY);
        g.drawLine(383-x, y+77, 467-x, y+77);

        
        // Agujeros del clarinete
        g.setColor(Color.GRAY);
        g.fillOval(356-x, y+95, 15, 15);
        g.fillOval(381-x, y+95, 15, 15);
        g.fillOval(406-x, y+95, 15, 15);
        g.fillOval(431-x, y+95, 15, 15);
        g.fillOval(456-x, y+95, 15, 15);
        g.fillOval(481-x, y+95, 15, 15);
        

        
        // Detalles en el cuerpo
        g.setColor(Color.GRAY);
        g.fillRect(325-x, y+90, 10, 25);
        g.fillRect(525-x, y+90, 10, 25);
        
        // Texto
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("CLARINETE, YAMAHA, COLOR NEGRO,CONICO,METALICO", 340-x, y+30);
        
        //Agregamos el Thread para que retrase la velocidad con la que repinta el dibujo
        try{
            Thread.sleep(30);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(FlautadePan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
                
}
