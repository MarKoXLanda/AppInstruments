/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pa_23130628_proyecto_03;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Fer Landa Santi
 */
//Hacemos la interfaz con los metodos dibujar y mover
 interface Movible {
    void dibujar(Graphics g, JPanel jPanelDibujo);
    
    void mover(Graphics g, JPanel jPanelDibujo, int x, int y);
}
