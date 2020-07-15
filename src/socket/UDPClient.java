package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	public static void main(String[] args) {
		try {
			// �����������ip���˿ںţ�����
			InetAddress inetAddress = InetAddress.getByName("localhost");
			int port = 8800;
			byte[] data = "�û�����admin�����룺123".getBytes();
			// �������ݰ�������Ҫ���͵���Ϣ
			DatagramPacket packet = new DatagramPacket(data, data.length, inetAddress, port);
			// ����datagramsocket
			DatagramSocket socket = new DatagramSocket();
			// ʹ��socket��������˷������ݰ�
			socket.send(packet);
			// socket.close();
			// ���շ������˵���Ӧ��������Server�Ľ�����ͬ
			byte[] dataR = new byte[1024]; // �������ݰ����ڽ��շ������˵���Ӧ
			DatagramPacket packet1 = new DatagramPacket(dataR, dataR.length);
			socket.receive(packet1); // ������Ӧ������
			String info = new String(dataR, 0, packet1.getLength()); // ��ȡ����
			System.out.println("I am Client,Sever reply:" + info);
			socket.close();// �ر���Դ
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
