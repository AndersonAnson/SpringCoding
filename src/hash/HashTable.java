package hash;

import java.util.Scanner;

public class HashTable {
	private EmployeeLinkList[] empLinkedListArray;
	private int size;

	public HashTable(int size) {
		this.size = size;
		empLinkedListArray = new EmployeeLinkList[size];
		for (int i = 0; i < size; i++) {
			empLinkedListArray[i] = new EmployeeLinkList();
		}

	}

//	添加雇员
	public void add(Employee emp) {
//		根据员工的id 得到该员工应当添加到哪个链表
		int empLinkListNo = this.hashFind(emp.getId());
//		将emp添加到对应的链表中
		empLinkedListArray[empLinkListNo].addEmployee(emp);
	}

	public void list() {
		for (int i = 0; i < size; i++) {
			empLinkedListArray[i].list(i);
		}
	}

	public void findEmpById(int id) {
		int empNo = hashFind(id);
		Employee emp = empLinkedListArray[empNo].findById(id);
		System.out.println(emp.getName() + emp.getId());
	}

	public int hashFind(int id) {
		return id % size;
	}

	public static void main(String[] args) {
		HashTable ht = new HashTable(7);
		String key = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("add Employee");
		System.out.println("list Employee");
		while (true) {
			key = scanner.nextLine();
			if (key.equals("add")) {
				int id = scanner.nextInt();
				String name = scanner.next();
				Employee emp = new Employee(id, name);
				ht.add(emp);
			}
			if (key.equals("list")) {
				ht.list();
			}
			if (key.equals("exit")) {
				break;
			}
		}
	}
}
