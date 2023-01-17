package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListPractice {

	public static void main(String[] args) {
		arrayList();
		System.out.println();
		vector();
		System.out.println();
		linkedList();
		System.out.println();
		stack();
	}

	public static void arrayList() {

		List lst = new ArrayList();
		lst.add("A");
		lst.add(12);
		lst.add("B");
		lst.add(null);
		lst.add("A");
		ListIterator it = lst.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

	public static void vector() {
		List lst = new Vector();
		System.out.println(lst.isEmpty());
		lst.add("A");
		lst.add(12);
		lst.add("B");
		lst.add(null);
		lst.add("A");
		System.out.println(lst.isEmpty());
		ListIterator it = lst.listIterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.print(object + " ");
		}
	}

	public static void linkedList() {
		List lst = new LinkedList();
		lst.add("A");
		lst.add(12);
		lst.add("B");
		lst.add(null);
		lst.add("A");
		ListIterator listit = lst.listIterator();
		while (listit.hasNext()) {
			System.out.print(listit.next() + " ");
//			System.out.println(listit.previous());
//			System.out.println(listit.previousIndex());
//			System.out.println(listit.hasPrevious());
		}
	}

	public static void stack() {
		Stack lst = new Stack();
		lst.add("A");
		lst.add(12);
		lst.add("B");
		lst.add(null);
		lst.add("A");
		Enumeration em = lst.elements();
		while (em.hasMoreElements()) {
			Object object = (Object) em.nextElement();
			System.out.print(object + " ");
		}

	}

}
