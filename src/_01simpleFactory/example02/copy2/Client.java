package _01simpleFactory.example02.copy2;

public class Client {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			Api api = Factory.createApi();
			api.test("���ʲô");
		}
	}
}