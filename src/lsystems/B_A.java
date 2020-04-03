package lsystems;

public class B_A extends LRule{
private char []l;
	
	public B_A() {
		l = new char[] {'A'};
	}
	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'B';
	}

	@Override
	public char[] getBody() {
		// TODO Auto-generated method stub
		return l;
	}

}
