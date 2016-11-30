package _01simpleFactory.example01;
/**
 * 某个接口(通用的、抽象的、非具体的功能的) 
 * @author zhouht
 */
public interface Api {
	/**
	 * 某个具体的功能方法的定义，用test1来演示一下。
	 * 这里的功能很简单，把传入的s打印输出即可 
	 * @param s 任意想要打印输出的字符串
	 */
	public void test(String s);
	
}
