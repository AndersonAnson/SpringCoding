package demo;

public class GenericMethodTest {
	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

	public GenericMethodTest() {

	}

	public void GenericMethodTest() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		System.out.println("��������Ԫ��Ϊ:");
		printArray(intArray); // ����һ����������

		System.out.println("\n˫����������Ԫ��Ϊ:");
		printArray(doubleArray); // ����һ��˫����������

		System.out.println("\n�ַ�������Ԫ��Ϊ:");
		printArray(charArray); // ����һ���ַ�������

	}

}
