package lsystems;

public class LSystemSymbolException extends Exception {

	private char invalidSymbol;
	
	public LSystemSymbolException (char invalidSymbol) {
		this.invalidSymbol = invalidSymbol;
	}
	
	public char getSymbol() {
		return invalidSymbol;
	}

}
