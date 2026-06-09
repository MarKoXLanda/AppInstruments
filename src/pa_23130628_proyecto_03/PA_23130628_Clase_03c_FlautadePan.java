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
//Clase hija de Viento
class FlautadePan extends Viento {
   
    //Constructores
    public FlautadePan(String marca, String color, String forma,String caracteristica) {
        super(marca, color, forma,caracteristica);
         this.forma=forma;
         this.color=color;
         this.marca=marca;
         this.caracteristica=caracteristica;
        
    }
    
    
    public void FlautadePan(){
        forma="No tiene forma";
        color="No tiene color";
        marca="No tiene marca";
        caracteristica="No tiene caracteristica";
        
    }
    
    // Constructor sin parámetros
    public FlautadePan() {
        super("No tiene marca", "No tiene color", "No tiene forma", "No tiene característica");
    }
    
//Getter y setter
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
         g = jPanelDibujo.getGraphics();
//Aqui dibujamos todo a base cordenadas en el JPanel con la clase Graphics
  // Fondo
        g.setColor(new Color(255, 255, 204)); // Color beige claro
      g.fillRect(0, 0, 519, 504);
        
        // Cuerpo de la flauta
        g.setColor(new Color(139, 69, 19)); // Color marrón
        g.fillRect(150, 100, 20, 220);
        g.fillRect(170, 100, 20, 200);
        g.fillRect(190, 100, 20, 180);
        g.fillRect(210, 100, 20, 160);
        g.fillRect(230, 100, 20, 140);
        g.fillRect(250, 100, 20, 120);
        g.fillRect(270, 100, 20, 100);
        g.fillRect(290, 100, 20, 80);
        g.fillRect(310, 100, 20, 60);
        
        // Agujeros de la flauta
        g.setColor(Color.BLACK);
        g.fillOval(150, 100, 20, 20);
        g.fillOval(170, 100, 20, 20);
        g.fillOval(190, 100, 20, 20);
        g.fillOval(210, 100, 20, 20);
        g.fillOval(230, 100, 20, 20);
        g.fillOval(250, 100, 20, 20);
        g.fillOval(270, 100, 20, 20);
        g.fillOval(290, 100, 20, 20);
        g.fillOval(310, 100, 20, 20);
        
        
        // Detalles en el cuerpo        
        g.setColor(Color.BLACK);
        g.drawRect(150, 100, 20, 220);
        g.drawRect(170, 100, 20, 200);
        g.drawRect(190, 100, 20, 180);
        g.drawRect(210, 100, 20, 160);
        g.drawRect(230, 100, 20, 140);
        g.drawRect(250, 100, 20, 120);
        g.drawRect(270, 100, 20, 100);
        g.drawRect(290, 100, 20, 80);
        g.drawRect(310, 100, 20, 60);
        g.setColor(Color.GRAY);        
        g.fillRect(150, 130, 180, 18);
        g.setColor(Color.YELLOW);
        g.fillOval(154, 134, 10, 10);
        g.fillOval(316, 134, 10, 10);
        g.drawLine(158, 140,316, 140);
        
        
        // Texto
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("FLAUTA DE PAN, JUPITER, COLOR CAFE,CILINDRICO,MADERA", 150, 70);
        
    }
    
    @Override
    public void mover(Graphics g, JPanel jPanelDibujo, int x, int y) {
        //Redibujamos en otra posicion y agregamos como parametros X e Y para que asi lo vaya dibujando en posiciones diferentes
        
        // Fondo
        g.setColor(new Color(255, 255, 204)); // Color beige claro
      g.fillRect(0, 0, 519, 504);
      
           // Cuerpo de la flauta
        g.setColor(new Color(139, 69, 19)); // Color marrón
        g.fillRect(350-x, y+60, 20, 220);
        g.fillRect(370-x, y+60, 20, 200);
        g.fillRect(390-x, y+60, 20, 180);
        g.fillRect(410-x, y+60, 20, 160);
        g.fillRect(430-x, y+60, 20, 140);
        g.fillRect(450-x, y+60, 20, 120);
        g.fillRect(470-x, y+60, 20, 100);
        g.fillRect(490-x, y+60, 20, 80);
        g.fillRect(510-x, y+60, 20, 60);
        
        // Agujeros de la flauta
        g.setColor(Color.BLACK);
        g.fillOval(350-x, y+60, 20, 20);
        g.fillOval(370-x, y+60, 20, 20);
        g.fillOval(390-x, y+60, 20, 20);
        g.fillOval(410-x, y+60, 20, 20);
        g.fillOval(430-x, y+60, 20, 20);
        g.fillOval(450-x, y+60, 20, 20);
        g.fillOval(470-x, y+60, 20, 20);
        g.fillOval(490-x, y+60, 20, 20);
        g.fillOval(510-x, y+60, 20, 20);
        
        
        // Detalles en el cuerpo        
        g.setColor(Color.BLACK);
        g.drawRect(350-x, y+60, 20, 220);
        g.drawRect(370-x, y+60, 20, 200);
        g.drawRect(390-x, y+60, 20, 180);
        g.drawRect(410-x, y+60, 20, 160);
        g.drawRect(430-x, y+60, 20, 140);
        g.drawRect(450-x, y+60, 20, 120);
        g.drawRect(470-x, y+60, 20, 100);
        g.drawRect(490-x, y+60, 20, 80);
        g.drawRect(510-x, y+60, 20, 60);
        g.setColor(Color.GRAY);        
        g.fillRect(350-x, y+90, 180, 18);
        g.setColor(Color.YELLOW);
        g.fillOval(354-x, y+94, 10, 10);
        g.fillOval(516-x, y+94, 10, 10);
        g.drawLine(358-x, y+100,516-x, y+100);
        
        
        // Texto
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("FLAUTA DE PAN, JUPITER, COLOR CAFE,CILINDRICO,MADERA ", 350-x, y+30);
        
        //Agregamos el Thread para que retrase la velocidad con la que repinta el dibujo
        try{
            Thread.sleep(30);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(FlautadePan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    }
    
    
    

