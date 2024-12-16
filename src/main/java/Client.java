
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Client {
 public static void main(String[] args) {
     try {     
         Socket mySocket=new Socket("localhost",8910);
         
         
         Scanner fromServer=new Scanner(mySocket.getInputStream());
         PrintWriter fromClient=new PrintWriter(mySocket.getOutputStream());
     } catch (IOException ex) {
         Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
     }
    }   
}
