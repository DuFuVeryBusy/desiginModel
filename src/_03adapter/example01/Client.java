package _03adapter.example01;

/**
 * 使用适配器的客户端 相当于 购买入，美标的插头 需要一个适配器（转换器），插在国标的插座上
 */
public class Client {
	public static void main(String[] args) {
		// 创建需被适配的对象
		// 家里现有国标的插座
		Adaptee adaptee = new Adaptee();
		// 创建客户端需要调用的接口对象
		// 购买电源插头适配器，转换器
		Target target = new Adapter(adaptee);
		// 请求处理
		// 进行操作
		target.request();
	}
}
