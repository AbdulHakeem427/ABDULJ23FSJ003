package assignments_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TowerOfHanoiTest {

	@Test
	void testTower() {
		String str=TowerOfHanoi.towerOfHanoi(3, "A", "B","C");
		System.out.println(str);
	}
	
	@Test
	void testTower2() {
		String str=TowerOfHanoi.towerOfHanoi(1, "A", "B","C");
		System.out.println(str);
	}
	
	@Test
	void testTower3() {
		String str=TowerOfHanoi.towerOfHanoi(2, "A", "B","C");
		System.out.println(str);
	}

}
