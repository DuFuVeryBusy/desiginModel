package _03adapter.example01;
/**
 * 定义客户端使用的接口，与特定领域相关
 * 相当于 美国 标准
 * 需要适配的对象
 */
public interface Target {
	/**
	 * 示意方法，客户端请求处理的方法
	 */
	public void request();
}
