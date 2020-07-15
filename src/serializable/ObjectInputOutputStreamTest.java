package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamTest {
	public void testObjectOutputStream() {
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream("test.txt"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testObjectInputStream() {
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("test.txt"));
			try {
				Object obj=ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
