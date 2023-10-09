package list_number;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer> {
	
	public void main(String[] Args) {
		
		
		
	}

	@Override
	public boolean add(Integer e) {
		if(!contains(e)) {
			
			return super.add(e);
		}
		return false;
	}

	@Override
	public void add(int index, Integer element) {
		if(!contains(element)) {
			super.add(index, element);
		}
	}
	
}
