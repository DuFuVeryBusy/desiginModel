package _01simpleFactory.example02.copy2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * �����࣬��������Api����
 */
public class Factory {
	private static int count = 0;
	/**
	 * ����Ĵ���Api�ķ��������������ļ��Ĳ����������ӿ�
	 * 
	 * @return ����õ�Api����
	 */
	public static Api createApi() {
		//�����typeҲ���Բ����ⲿ���룬����ֱ�Ӷ�ȡ�����ļ�����ȡ
		//Ϊ�˰�ע��������ģʽ�����ϣ�����Ͳ�ȥд��ȡ�����ļ��Ĵ�����
		
		//����type������ѡ�񣬵�Ȼ�����1��2Ӧ�����ɳ���

		//ѡ��===�����ѡ��====��ѡ��Ĳ���===�������Ӻζ�����
		//1��������Դ�� client
		//2��������Դ�������ļ�
		//3��������Դ��ϵͳ�������������ڼ��ĳ��ֵ
		Api api = null;
		if (count < 3) {
			api = new Impl01();
			count ++;
		} else {
			api = new Impl02();
			count ++;
		}
		return api;
	}
}
