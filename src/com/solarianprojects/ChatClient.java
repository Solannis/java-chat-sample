package com.solarianprojects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ChatClient {

	   public static void main(String[] args) throws IOException {
System.out.println("Client: Obtaining serverAddress.");
	        String serverAddress = JOptionPane.showInputDialog(
	            "Enter IP Address of a machine that is\n" +
	            "running the date service on port 9090:");
System.out.println("Client: Creating socket.");	        
	        Socket s = new Socket(serverAddress, 9090);
	        BufferedReader input =
	            new BufferedReader(new InputStreamReader(s.getInputStream()));
System.out.println("Client: Reading from socket.");
	        String answer = input.readLine();
	        JOptionPane.showMessageDialog(null, answer);
System.out.println("Client: Displaying answer.");
	        s.close();
System.out.println("Client: Closed socket.");
	        System.exit(0);
	    }
	   
}
