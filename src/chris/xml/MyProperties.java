/**
 * 
 */
package chris.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * @author 卢俊铭
 *
 */
public class MyProperties extends Properties {
	public MyProperties(String name,MyXmlType type){
		File file = new File(name+"."+type);
		System.out.println(name+"."+type);
		if(!file.exists()){
			System.out.println("File not exists");
			return ;
		}
		try {
			if(type.equals(MyXmlType.properties)){
				this.load(new FileInputStream(file));
				return ;
			}else if(type.equals(MyXmlType.xml)){
				this.loadFromXML(new FileInputStream(file));
				return ;
			}else{
				System.out.println("Unknow type");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyProperties pro = new MyProperties("test",MyXmlType.properties);
		System.out.println(pro.get("type"));
		MyProperties xml = new MyProperties("test",MyXmlType.xml);
		System.out.println(xml.get("type"));
	}

}
