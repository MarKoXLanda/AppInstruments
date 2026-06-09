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
//Clase hija de percusion
 class Bongo extends Percusion{
    
     //Constructores
    public Bongo(String marca, String color, String categoria,String caracteristica) {
        super(marca, color, categoria,caracteristica);
         this.categoria=categoria;
         this.color=color;
         this.marca=marca;
         this.caracteristica=caracteristica;
        
    }
    
     public void Bongo(){
        categoria="No tiene categoria";
        color="No tiene color";
        marca="No tiene marca";
        caracteristica="No tiene caracteristica";
     }
     //Constructor sin parametros
     public Bongo() {
        super("No tiene marca", "No tiene color", "No tiene categoria", "No tiene característica");
    }
//Getter y Setter
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
        g = jPanelDibujo.getGraphics();
        //Dibujamos con la clase Graphics a base de coordenadas en el JPanel
        // Fondo
        g.setColor(new Color(240, 240, 240)); // Color gris claro
        g.fillRect(0, 0, 519, 504);
        
        //relleno
        g.setColor(Color.GRAY);
        g.fillRect(150, 130, 160, 20);
        
        // Tapa del bongó        
        g.setColor(new Color(255, 204, 153)); // Color beige claro
        g.fillOval(150, 80, 160, 90);
        g.setColor(Color.BLACK);
        g.drawOval(150, 80, 160, 90);
        
        // Cuerpo del bongó
        g.setColor(Color.GRAY); 
        g.fillRect(150, 150, 160, 20);
        g.setColor(new Color(165, 42, 42));
        g.fillRect(155, 170, 150, 110);
        
        // Detalles en el cuerpo
        g.setColor(Color.BLACK);
        g.drawRect(155, 170, 150, 110);
        g.drawLine(180, 170, 180, 280);
        g.drawLine(280, 170, 280, 280);
        g.drawLine(230, 170, 230, 280);
        g.drawLine(155, 230, 305, 230);
        
        // Triángulos como adornos
        int[] x = {160, 180, 200}; // Coordenadas x de los vértices del triángulo
        int[] y = {230, 200, 230}; // Coordenadas y de los vértices del triángulo
        g.setColor(Color.BLACK);
        g.fillPolygon(x, y, 3);

        int[] x2 = {215, 230, 245}; // Coordenadas x del segundo triángulo
        int[] y2 = {230, 270, 230}; // Coordenadas y del segundo triángulo
        g.fillPolygon(x2, y2, 3);
        
        int[] x3 = {260, 280, 300}; // Coordenadas x de tercer triangulo
        int[] y3 = {230, 200, 230}; // Coordenadas y de tercer triangulo
        g.setColor(Color.BLACK);
        g.fillPolygon(x3, y3, 3);
        
        // Texto
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("BONGÓ,LP MATADOR, COLOR ROJO, MEMBRANOFONO, SET INCOMPLETO", 185, 70);
    }
    
    @Override
    public void mover(Graphics g, JPanel jPanelDibujo, int x, int y) {
         g = jPanelDibujo.getGraphics();
         //Redibujamos el dibujo en otra posicion y le agregamos parametros X e Y que permitiran el movimiento
        // Fondo
        g.setColor(new Color(240, 240, 240)); // Color gris claro
        g.fillRect(0, 0, 519, 504);
        
        //relleno
        g.setColor(Color.GRAY);
        g.fillRect(350-x, y+90, 160, 20);
        
        // Tapa del bongó        
        g.setColor(new Color(255, 204, 153)); // Color beige claro
        g.fillOval(350-x, y+40, 160, 90);
        g.setColor(Color.BLACK);
        g.drawOval(350-x, y+40, 160, 90);
        
        // Cuerpo del bongó
        g.setColor(Color.GRAY); 
        g.fillRect(350-x, y+110, 160, 20);
        g.setColor(new Color(165, 42, 42));
        g.fillRect(355-x, y+130, 150, 110);
        
        // Detalles en el cuerpo
        g.setColor(Color.BLACK);
        g.drawRect(355-x, y+130, 150, 110);
        g.drawLine(380-x, y+130, 380-x, y+240);
        g.drawLine(480-x, y+130, 480-x, y+240);
        g.drawLine(430-x, y+130, 430-x, y+240);
        g.drawLine(355-x, y+190, 505-x, y+190);
        
        // Triángulos como adornos
        int[] x1 = {360-x, 380-x, 400-x}; // Coordenadas x de los vértices del triángulo
        int[] y1 = {y+190, y+160, y+190}; // Coordenadas y de los vértices del triángulo
        g.setColor(Color.BLACK);
        g.fillPolygon(x1, y1, 3);

        int[] x2 = {415-x, 430-x, 445-x}; // Coordenadas x del segundo triángulo
        int[] y2 = {y+190, y+230, y+190}; // Coordenadas y del segundo triángulo
        g.fillPolygon(x2, y2, 3);
        
        int[] x3 = {460-x, 480-x, 500-x}; // Coordenadas x de tercer triangulo
        int[] y3 = {y+190, y+160, y+190}; // Coordenadas y de tercer triangulo
        g.setColor(Color.BLACK);
        g.fillPolygon(x3, y3, 3);
        
        // Texto
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("BONGÓ,LP MATADOR, COLOR ROJO, MEMBRANOFONO, SET INCOMPLETO", 385-x, y+30);
        //Agregamos el Thread para que retrase la velocidad con la que repinta el dibujo
        try{
            Thread.sleep(30);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(FlautadePan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    }
    

