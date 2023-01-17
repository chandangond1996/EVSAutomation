package CollectionFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Properties;

public class PropertiesPractice {

	public static void main(String[] args) throws Exception {
LinkedList l=new LinkedList();
l.add("ram");
l.add("shivam");
l.add("op");
l.add("mangesh");
System.out.println(l);
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ADMIN\\Desktop\\Myfilechandan\\VtigerAutomate\\src\\test\\java\\CollectionFrameWork\\MapPracticeCollection");
		prop.load(fis);
		System.out.println(prop.getProperty("pass"));
		System.out.println(prop.getProperty("user"));
method();
	}

	public static void method() throws Exception {
		try {
			int a=10/0;
			System.out.println("Hello");
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("I am finally");
		}
	}

}
