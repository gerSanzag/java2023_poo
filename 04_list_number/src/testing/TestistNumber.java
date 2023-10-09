package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import list_number.ListNumber;

class TestistNumber {
	ListNumber miLista;
	@BeforeEach
	
	void setUp() throws Exception {
		miLista=new ListNumber();
		miLista.add(5);
		miLista.add(10);
		miLista.add(50);
	}

	@Test
	void testAddInteger() {
		assertFalse(miLista.add(10));
	}

	@Test
	void testAddIntInteger() {
		assertFalse(miLista.add(10));
	}

}
