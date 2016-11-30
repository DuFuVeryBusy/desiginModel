package _01simpleFactory.example02.copy2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 工厂类，用来创造Api对象
 */
public class Factory {
	private static int count = 0;
	/**
	 * 具体的创造Api的方法，根据配置文件的参数来创建接口
	 * 
	 * @return 创造好的Api对象
	 */
	public static Api createApi() {
		//这里的type也可以不由外部传入，而是直接读取配置文件来获取
		//为了把注意力放在模式本身上，这里就不去写读取配置文件的代码了
		
		//根据type来进行选择，当然这里的1和2应该做成常量

		//选择===〉如何选？====〉选择的参数===〉参数从何而来？
		//1：参数来源于 client
		//2：参数来源于配置文件
		//3：参数来源于系统自身，比如运行期间的某个值
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
