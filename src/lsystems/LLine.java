package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	List <Character> list = new ArrayList <>();
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		
		if(line.length == 0 ) throw new LSystemLengthException();
		//if(getSymbol() = ' ') throw new LSystemSymbolException('Q');
		
		list.clear();
	for (char c: line) {
		
			for (LRule r : rules) {
				if (r.getMatch() == c) {
					for(char j: r.getBody()) {
						list.add(j);
					}
			
			}
		}
			line = listToArray(list);	
		}
	}
	
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
