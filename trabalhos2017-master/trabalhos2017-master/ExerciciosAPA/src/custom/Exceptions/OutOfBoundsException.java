package custom.Exceptions;

public class OutOfBoundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public OutOfBoundsException() {

		System.out.println("O valor inserido n�o � v�lido, tente novamente \n");
		
	}
}
