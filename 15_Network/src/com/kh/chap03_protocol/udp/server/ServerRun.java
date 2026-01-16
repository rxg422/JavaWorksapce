package com.kh.chap03_protocol.udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerRun {

	public static void main(String[] args) {
		int serverPort = 30001;
		
		try {
			DatagramSocket socket = new DatagramSocket(serverPort);
			
			byte data[] = new byte[1024];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			socket.receive(packet);
			
			InetAddress clientAddress = packet.getAddress();
			System.out.println("clientAddress " + clientAddress.getHostAddress() + ":" + packet.getPort());
			
			String str = "UDP Server에서 전송하는 데이터";
			
			byte serverData[] = str.getBytes();
			DatagramPacket packet2 = new DatagramPacket(serverData, serverData.length, clientAddress, packet.getPort());
			
			socket.send(packet2);
			socket.close();
		} 
		catch (SocketException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
