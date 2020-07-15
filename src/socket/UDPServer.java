package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		try {
			// �������˽������Կͻ��˵�����
			// �����������˵�DatagramSocket��ָ���˿�
			DatagramSocket socket = new DatagramSocket(8800);
			// �������ݱ������ڽ��տͻ��˷��͵���Ϣ
			byte[] data = new byte[1024];// �����ֽ����飬ָ�����յ����ݰ��Ĵ�С
			DatagramPacket packet = new DatagramPacket(data, data.length);
			// ���տͻ��˷��͵�����
			socket.receive(packet); // ���յ����ݰ�֮ǰ��һֱ������������ݴ���packet��data
			// ��ȡ����
			String info = new String(data, 0, packet.getLength()); // ��ȡ����
			System.out.println("I am Server,Client say:" + info);
			// ���յ����ݺ󣬷���������Ӧ���ͻ��ˣ�������client�ķ�����ͬ
			// ����ͻ��˵�ip��ַ���˿ںţ�����
			InetAddress address = packet.getAddress();
			int port = packet.getPort(); // port�ѵ���Ӧ�ÿ϶���8800������
			byte[] data2 = "Welcome".getBytes();
			DatagramPacket packet1 = new DatagramPacket(data2, data2.length, address, port);
			socket.send(packet1);
			socket.close();// �ر���Դ
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
