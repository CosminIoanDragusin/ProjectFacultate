
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Server {
 public static void main(String[] args) throws IOException {
  ServerSocket myServerSocket=new ServerSocket(8910);
  Socket mySocket=myServerSocket.accept();
  
  Scanner fromClient = new Scanner(mySocket.getInputStream());
  PrintWriter fromServer=new PrintWriter(mySocket.getOutputStream());
  
  //BufferedReader reader=new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
  //DataOutputStream writer= new DataOutputStream(mySocket.getOutputStream());
  
  String input,output;
  while(true){
      
  input=fromClient.nextLine();
  System.out.print("Client:"+input);
  
  output=input.toUpperCase();
  fromServer.println(output);
  }
    }   
}
