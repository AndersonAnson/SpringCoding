package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) {
		// �����ͻ���socket�������ӣ�ָ����������ַ�Ͷ˿�
		try {
			Socket socket = new Socket("127.0.0.1", 8888);
			// ��ȡ���������������˷�����Ϣ
			OutputStream outputStream = socket.getOutputStream();// �ֽ������
			PrintWriter pw = new PrintWriter(outputStream); // ���������װΪ��ӡ��
			pw.write("�û�����admin;���룺123");
			pw.flush();
			socket.shutdownOutput();
			
			// ��ȡ����������ȡ�������˵���Ӧ
			InputStream inputStream = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("���ǿͻ��ˣ�������˵��" + info);

			}
			socket.shutdownInput();

			// �ر���Դ
			br.close();
			inputStream.close();
			pw.close();
			outputStream.close();
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
