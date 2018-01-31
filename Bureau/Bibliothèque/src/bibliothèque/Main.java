/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliothèque;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author a-soule
 */
public class Main {

   
    public static void main(String[] args) {
       
       ArrayList LesAuteurs = new ArrayList<Auteur>();
       
       try{
                    FileInputStream f = new FileInputStream("/home/a-soule/Bureau/SLAM05/livres.csv");
                    ObjectInputStream s = new ObjectInputStream(f);
                    LesAuteurs = (ArrayList<Auteur>) s.readObject(); 
            }
                catch(IOException e) {System.out.println("Nouveau fichier");}
                catch(ClassNotFoundException e){System.out.println("Probleme");}
                }
    for(int i=0; i<LesAuteurs.size();i++){
    
}
}
