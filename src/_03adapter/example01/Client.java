package _03adapter.example01;

/**
 * ʹ���������Ŀͻ��� �൱�� �����룬����Ĳ�ͷ ��Ҫһ����������ת�����������ڹ���Ĳ�����
 */
public class Client {
	public static void main(String[] args) {
		// �����豻����Ķ���
		// �������й���Ĳ���
		Adaptee adaptee = new Adaptee();
		// �����ͻ�����Ҫ���õĽӿڶ���
		// �����Դ��ͷ��������ת����
		Target target = new Adapter(adaptee);
		// ������
		// ���в���
		target.request();
	}
}
