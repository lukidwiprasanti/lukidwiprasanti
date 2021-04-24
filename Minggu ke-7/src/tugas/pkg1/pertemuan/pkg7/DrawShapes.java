/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1.pertemuan.pkg7;
import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author ASUSPC
 */ 
public class DrawShapes extends Applet{
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    public void init (){
        //The Font is Arial size, 18 and is italicized
        font = new Font ("Arial", Font.ITALIC, 18);
        
        //Some colors are predefined in the Color class
        redColor = Color.RED;
        backgroundColor = Color.ORANGE;
        
        //Color can be created using Red, Green, Blue values
        blueColor = new Color (0,0,122);
        
        //Set the background Color Of the applet
        setBackground (backgroundColor);
    }
    public void stop(){
    }
    /**
     * This method paints the shapes to the screen
     */
    public void paint (Graphics graph){
        //Set font
        graph.setFont(font);
        //Create a tittle
        graph.drawString ("Draw Shapes", 90, 20);
        
        //set the color for the first shape
        graph.setColor (blueColor);
        
        //Draw a rectangle using drawRect (int x, int y, int width, int height)
        graph.drawRect (120, 120, 120, 120);
        
        //this will fill a rectangle
        graph.fillRect (115, 115, 90, 90);
        
        //this the color for the next shape
        graph.setColor (redColor);
        
        //Draw a rectangle using drawRect (int x, int y, int width, int height, int startAngle, int arcAngle)
        graph.fillArc (110, 110, 50, 50, 0, 360);
        
        //Set color for next shape
        graph.setColor (Color.CYAN);
        
        //Draw another rectagle
        graph.drawRect (50, 50, 50, 50);
        
        //This will fill a rectangle
        graph.fillRect (50, 50, 60 ,60);
        
    }
}
