package _01simpleFactory.example01.copy;

public class Client {

	public static void main(String[] args) {
		Api api = Factory.createApi();	
		api.test("���ʲô");
	}
}