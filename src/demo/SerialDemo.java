package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("object.out");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		User user1=new User("xuliugen", "123456", "male");
		oos.writeObject(user1);
		System.out.println(oos.toString());
		oos.flush();
		oos.close();
		
		FileInputStream fis=new FileInputStream("object.out");
		ObjectInputStream ois=new ObjectInputStream(fis);
		User user2=(User)ois.readObject();
		System.out.println(user2.getUsername()+ " " + 
	            user2.getPassword() + " " + user2.getSex());
	}

}
