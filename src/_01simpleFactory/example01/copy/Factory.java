package _01simpleFactory.example01.copy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * �����࣬��������Api����
 */
public class Factory {
	/**
	 * ����Ĵ���Api�ķ��������������ļ��Ĳ����������ӿ�
	 * 
	 * @return ����õ�Api����
	 */
	public static Api createApi() {
		// ֱ�Ӷ�ȡ�����ļ�����ȡ��Ҫ����ʵ������

		// ������ζ�ȡProperties������η�������Ͳ�������
		Properties p = new Properties();
		InputStream in = null;

		try {
			in = Factory.class.getResourceAsStream("FactoryTest.properties");
			p.load(in);
		} catch (IOException e) {
			System.out.println("װ�ع��������ļ������ˣ�����Ķ�ջ��Ϣ���£�");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//�÷���ȥ��������Щ���⴦�������ƵĹ�������Ͳ�����
		Api api = null;
		try {
			api = (Api)Class.forName(p.getProperty("ImplClass")).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return api;
	}

}