package hash;

public class EmployeeLinkList {
	private Employee head = null;

//	添加雇员到链表
	public void addEmployee(Employee emp) {
		if (head == null) {
			head = emp;
			return;
		}
//		如果不是第一个雇员 则使用一个辅助的指针
		Employee curEmp = head;
		while (true) {
			if (curEmp.getNext() == null) {
				break;
			}
			curEmp = curEmp.getNext();
		}
		curEmp.setNext(curEmp);
	}

//	根据id查找某个雇员
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
