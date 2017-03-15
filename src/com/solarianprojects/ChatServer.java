package com.solarianprojects;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ChatServer {
	
	   public static void main(String[] args) throws IOException {
	        ServerSocket listener = new ServerSocket(9090);
System.out.println("Server: Starting up listener.");
	        try {
	            while (true) {
	                Socket socket = listener.accept();
System.out.println("Server: Incoming connection detected.");
	                try {
	                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	                    out.println(new Date().toString());
System.out.println("Server: Date sent to client.");
	                } finally {
	                    socket.close();
System.out.println("Server: Socket closed.");
	                }
	            }
	        }
	        finally {
	            listener.close();
System.out.println("Server: Listener closed.");
	        }
//System.out.println("Server: Server closing.");
	   }
}
