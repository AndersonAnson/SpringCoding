package pencilTest;

public class FinalVariable {
	private final Object cqx=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable f=new FinalVariable();
//		f.cqx=200;
		final StringBuffer s=new StringBuffer("abc");
		System.out.println(s);
		s.append("kkk");
		System.out.println(s.equals(s));
		try {
			System.out.print(Class.forName("test.FinalVariable").getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
