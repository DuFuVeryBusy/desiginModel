package _03adapter.example01;
/**
 * ������
 * ��Դת�����Ĺ��ܣ���Ӧ�þ��й����ͷ������Ĳ���
 */
public class Adapter implements Target {
	/**
	 * ������Ҫ������Ľӿڶ���
	 */
	private Adaptee adaptee;
	/**
	 * ���췽����������Ҫ������Ķ���
	 * @param adaptee ��Ҫ������Ķ���
	 */
	public Adapter (Adaptee adaptee){
		this.adaptee = adaptee;
	}
	/**
	 * ʾ�ⷽ�����ͻ���������ķ���
	 */
	@Override
	public void request() {
		//����ת���Ѿ�ʵ���˵ķ�������������
		//������͵���adaptee�еķ�������
		adaptee.specificRequest();
	}

}
