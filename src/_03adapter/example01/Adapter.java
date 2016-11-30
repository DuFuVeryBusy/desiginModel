package _03adapter.example01;
/**
 * 适配器
 * 电源转换器的功能：他应该具有国标插头和美标的插座
 */
public class Adapter implements Target {
	/**
	 * 持有需要被适配的接口对象
	 */
	private Adaptee adaptee;
	/**
	 * 构造方法，传入需要被适配的对象
	 * @param adaptee 需要被适配的对象
	 */
	public Adapter (Adaptee adaptee){
		this.adaptee = adaptee;
	}
	/**
	 * 示意方法，客户端请求处理的方法
	 */
	@Override
	public void request() {
		//可能转调已经实现了的方法，进行适配
		//在这里就调用adaptee中的方法啦！
		adaptee.specificRequest();
	}

}
