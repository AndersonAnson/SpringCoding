package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {
		try {
			// ����һ��������socket����serversocket,ָ���󶨵Ķ˿ڣ��������˶˿�
			ServerSocket serverSocket = new ServerSocket(8888);
			// ����accept()������ʼ�������ȴ��ͻ��˵�����
			System.out.println("***�����������������ȴ��ͻ��˵�����***");
			Socket socket = serverSocket.accept();
			// ��ȡ��������������ͻ��˵���Ϣ
			InputStream in = socket.getInputStream(); // �ֽ�������
			InputStreamReader inreader = new InputStreamReader(in); // ���ֽ�������ת��Ϊ�ַ���
			BufferedReader br = new BufferedReader(inreader); // Ϊ��������ӻ���
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("���Ƿ��������ͻ���˵��" + info);

			}
			socket.shutdownInput();// �ر�������
			// ��ȡ���������Ӧ�ͻ��˵���Ϣ
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream);// ��װΪ��ӡ��
			printWriter.write("��ӭ����");
			printWriter.flush(); // ˢ�»���
			socket.shutdownOutput();
			// �ر���Դ
			printWriter.close();
			outputStream.close();
			br.close();
			inreader.close();
			in.close();
			socket.close();
			serverSocket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
