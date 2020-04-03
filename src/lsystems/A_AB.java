package lsystems;

public class A_AB extends LRule {
	
	private char []l;
	
	public A_AB() {
		l = new char[] {'A','B'};
	}
	@Override
	public char getMatch() {
		
		return 'A';
	}

	@Override
	public char[] getBody() {
		
		return  l;
	}

}
