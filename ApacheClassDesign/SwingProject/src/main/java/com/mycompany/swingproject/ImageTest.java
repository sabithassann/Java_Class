/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingproject;

import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class ImageTest {
    public static void main(String[] args) {
        
        String imagePath = "C:\\Users\\user\\Documents\\NetBeansProjects\\SwingProject\\ss\\java.png";


        ImageIcon icon = new ImageIcon(imagePath);
        if (icon.getImage() != null) {
            System.out.println("Image loaded successfully.");
        } else {
            System.out.println("Image not found or could not be loaded.");
        }
        
    }
}
