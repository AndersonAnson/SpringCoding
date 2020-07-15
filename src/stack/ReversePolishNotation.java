package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReversePolishNotation {
	private static final int ADD=1;
	private static final int SUB=1;
	private static final int MUL=2;
	private static final int DIV=2;
	public List<String> toInffixExpressionList(String s) {
		List<String> list = new ArrayList<String>();
		String str;
		for (int i = 0; i < s.length();) {
			if ((s.charAt(i) < 48 || s.charAt(i) > 57)) {
				list.add("" + s.charAt(i));
				i++;
			} else {
				str = "";
				while (i < s.length() && (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
					str = str + s.charAt(i);
					i++;
				}
				list.add(str);
			}
		}
		return list;
	}

	public List<String> getListString(String suffixExpression) {
		String[] split = suffixExpression.split(" ");
		List<String> list = new ArrayList<String>();
		for (String ele : split) {
			list.add(ele);
		}
		return list;
	}

	public int calculate(List<String> ls) {
		Stack<String> stack = new Stack<String>();
		int num1 = 0;
		int num2 = 0;
		int res = 0;
		for (String ele : ls) {

			if (ele.matches("\\d+")) {
				stack.push(ele);
			} else {
				num1 = Integer.parseInt(stack.pop());
				num2 = Integer.parseInt(stack.pop());
				res = 0;
				if (ele.equals("+")) {
					res = num1 + num2;
				} else if (ele.equals("-")) {
					res = num2 - num1;
				} else if (ele.equals("*")) {
					res = num2 * num1;
				} else if (ele.equals("/")) {
					res = num2 / num1;
				}
				stack.push(String.valueOf(res));
			}
		}
		return Integer.parseInt(stack.pop());
	}

	public List<String> transferFromInToSuff(List<String> ls){
		Stack<String> s1=new Stack<String>();
		List<String> s2=new ArrayList<String>();
		for(String item:ls) {
			if (item.matches("\\d+")) {
				s2.add(item);
			}
			else if(item.equals("(")) {
				s1.push(item);
			}
			else if(item.equals(")")){
				while(!s1.peek().equals("(")) {
					s2.add(s1.pop());
				}
				s1.pop();
			}
			else {
				while(!s1.isEmpty()&&oper(s1.peek())>=oper(item)) {
					s2.add(s1.pop());
				}
				s1.push(item);
			}
		}
		while(!s1.isEmpty()) {
			s2.add(s1.pop());
		}
		return s2;
		
	}
	
	public int oper(String oper) {
		int result=0;
		if(oper=="+") {
			result=ReversePolishNotation.ADD;
		}
		if(oper=="-") {
			result=ReversePolishNotation.SUB;
		}
		if(oper=="*") {
			result=ReversePolishNotation.MUL;
		}
		if(oper=="/") {
			result=ReversePolishNotation.DIV;
		}
		return result;
	}
//	完成一个中缀表达式转成后缀表达式的功能
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		先定义一个逆波兰表达式
		String suffixExpression = "30 4 + 5 * 6 -";
//		先将字符串放入arrayList中 将arrayList传递一个方法 配合栈完成计算
		ReversePolishNotation rpn = new ReversePolishNotation();
//		List<String> rpnList = rpn.getListString(suffixExpression);
//		System.out.print(rpnList);
//		int res = rpn.calculate(rpnList);
//		System.out.print(res);
		
//		先定义一个中缀表达式
		String inffixExpression = "(1+9)*7-8";
		List<String> inList = rpn.toInffixExpressionList(inffixExpression);
		System.out.println(inList);
		inList=rpn.transferFromInToSuff(inList);
		for(String s:inList) {
			System.out.print(s);
		}
	}

}
