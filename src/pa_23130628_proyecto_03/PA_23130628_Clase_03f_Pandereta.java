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
 class Pandereta extends Percusion{
    //Constructores
    public Pandereta(String marca, String color, String categoria,String caracteristica) {
        super(marca, color, categoria, caracteristica);
         this.categoria=categoria;
         this.color=color;
         this.marca=marca;
         this.caracteristica=caracteristica;
        
    }
     public void Pandereta(){
        categoria="No tiene categoria";
        color="No tiene color";
        marca="No tiene marca";
        caracteristica="No tiene caracteristica";
     }
     //Constructor sin parametros
      public Pandereta() {
        super("No tiene marca", "No tiene color", "No tiene categoria", "No tiene característica");
    }
//Metodos Getter y Setter
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
        //Dibujamos con la clase Graphics a base de coordenadas en el JPanel
        g = jPanelDibujo.getGraphics();
        // Fondo
        g.setColor(new Color(219, 112, 147)); // Rosa oscuro
        g.fillRect(0, 0, 519, 504);
        
        //Partes Pandereta
        g.setColor(Color.GRAY);
        g.fillOval(147, 150, 35, 35);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(154, 157, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(177, 115, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(184, 122, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(250, 115, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(257, 122, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(277, 150, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(284, 157, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(277, 210, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(284, 217, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(147, 210, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(154, 217, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(177, 240, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(184, 247, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(250, 240, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(257, 247, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(213, 248, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(220, 255, 20, 20);
        
         
        
        // Cuerpo de la pandereta
        g.setColor(Color.ORANGE); 
        g.fillOval(155, 120, 150, 150);
        g.setColor(new Color(139, 69, 19));// Color marrón 
        g.fillRect(217, 125, 30, 15);
        g.setColor(Color.BLACK);
        g.drawLine(155, 210, 305, 210);
        g.drawLine(155, 190, 305, 190);
        
        
     
        
        
        // Detalles en el cuerpo
        g.setColor(Color.BLACK);

        
        // Texto
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("PANDERETA,SAMBA, COLOR AMARILLO, IDIOFONO Y MEMBRANOFONO", 170, 50);
        
    }
    
     @Override
    public void mover(Graphics g, JPanel jPanelDibujo, int x, int y) {
//Redibujamos el dibujo en otra posicion y le agregamos parametros X e Y que permitiran el movimiento
        g = jPanelDibujo.getGraphics();
        // Fondo
        g.setColor(new Color(219, 112, 147)); // Rosa oscuro
        g.fillRect(0, 0, 519, 504);
        
        //Partes Pandereta
        g.setColor(Color.GRAY);
        g.fillOval(347-x, y+110, 35, 35);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(354-x, y+117, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(377-x, y+75, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(384-x, y+82, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(450-x, y+75, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(457-x, y+82, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(477-x, y+110, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(484-x, y+117, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(477-x, y+170, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(484-x, y+177, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(347-x, y+170, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(354-x, y+177, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(377-x, y+200, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(384-x, y+207, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(450-x, y+200, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(457-x, y+207, 20, 20);
        g.setColor(Color.GRAY);
        g.fillOval(413-x, y+208, 35, 35); 
        g.setColor(Color.DARK_GRAY);
        g.fillOval(420-x, y+215, 20, 20);
        
         
        
        // Cuerpo de la pandereta
        g.setColor(Color.ORANGE); 
        g.fillOval(355-x, y+80, 150, 150);
        g.setColor(new Color(139, 69, 19));// Color marrón 
        g.fillRect(417-x, y+85, 30, 15);
        g.setColor(Color.BLACK);
        g.drawLine(355-x, y+170, 505-x, y+170);
        g.drawLine(355-x, y+150, 505-x, y+150);
        
        
     
        
        
        // Detalles en el cuerpo
        g.setColor(Color.BLACK);

        
        // Texto
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("PANDERETA,SAMBA, COLOR AMARILLO, IDIOFONO Y MEMBRANOFONO", 370-x, y+10);
        //Agregamos el Thread para que retrase la velocidad con la que repinta el dibujo
        try{
            Thread.sleep(30);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(FlautadePan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
