package CollectionFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.io.monitor.FileAlterationObserver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class SetPractice {

	public static void main(String[] args) throws FileNotFoundException {

		SortedSet ts = new TreeSet();
		ts.add(5);
		ts.add(7);
		ts.add(3);
		try {
			ts.add("A");
		}catch(ClassCastException c) {
			System.out.println(c);
		}
		ts.add(2);
		ts.add(1);
		try {
			ts.add(null);
		} catch (NullPointerException n) {
			System.out.println(n);
		} finally {
			System.out.println("Hello");
		}
		SortedSet srtSet = ts.tailSet(5);
		Iterator itr = srtSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}

class myComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		String str1 = o1.toString();
		String str2 = o2.toString();

		return str1.compareTo(str2);
	}

}
