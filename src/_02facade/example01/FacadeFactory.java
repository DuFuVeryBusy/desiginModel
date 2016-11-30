package _02facade.example01;

public class FacadeFactory {
	private FacadeFactory() {
	}

	public static FacadeApi createFacadeApi() {
		return new Facade();
	}
}
