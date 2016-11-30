package _01simpleFactory.example02;

public class Client {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			Api api = Factory.createApi();
			api.test("Êä³öÊ²Ã´");
		}
	}
}