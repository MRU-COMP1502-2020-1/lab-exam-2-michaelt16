package lsystems;

public class A_BC extends LRule{

private char []l;
	
	public A_BC() {
		l = new char[] {'B','C'};
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
