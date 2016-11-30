package _02facade.example01;

public class Client {

	public static void main(String[] args) {
		FacadeApi api = FacadeFactory.createFacadeApi();

		api.generate();
	}
}
