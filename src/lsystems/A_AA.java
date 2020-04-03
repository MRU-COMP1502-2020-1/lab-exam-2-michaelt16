package lsystems;

public class A_AA extends LRule {
private char []l;
	
	public A_AA() {
		l = new char[] {'A','A'};
	}
	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'A';
	}

	@Override
	public char[] getBody() {
		// TODO Auto-generated method stub
		return l;
	}

}
