package hash;

public class EmployeeLinkList {
	private Employee head = null;

//	��ӹ�Ա������
	public void addEmployee(Employee emp) {
		if (head == null) {
			head = emp;
			return;
		}
//		������ǵ�һ����Ա ��ʹ��һ��������ָ��
		Employee curEmp = head;
		while (true) {
			if (curEmp.getNext() == null) {
				break;
			}
			curEmp = curEmp.getNext();
		}
		curEmp.setNext(curEmp);
	}

//	����id����ĳ����Ա
	public Employee findById(int id) {
		if (head == null) {
			return null;
		}
		Employee curEmp = head;
		while (true) {
			if (curEmp.getId() == id) {
				break;
			}
			if (curEmp.getNext() == null) {
				curEmp = null;
				break;
			}
			curEmp = curEmp.getNext();
		}
		return curEmp;
	}

	public void list(int no) {
		if (head == null) {
			System.out.println("number " + no + "is none");
			return;
		}
		System.out.println("number " + no);
		Employee curEmp = head;
		while (true) {
			System.out.println(curEmp.getId() + " " + curEmp.getName());
			if (curEmp.getNext() == null) {
				break;
			}
			curEmp = curEmp.getNext();
		}

	}
}
