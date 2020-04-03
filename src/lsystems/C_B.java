package lsystems;

public class C_B extends LRule{
private char []l;
	
	public C_B() {
		l = new char[] {'B'};
	}
	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'C';
	}

	@Override
	public char[] getBody() {
		// TODO Auto-generated method stub
		return l;
	}

}
