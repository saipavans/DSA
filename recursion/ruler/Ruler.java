package recursion.ruler;

public class Ruler {
	
	private static void drawRuler(int inches, int tickLength) {
		
		drawMark(tickLength, 0); // Initial for zero marking
		
		for (int i = 1; i <= inches; i++) {
			plotAndDraw(tickLength -1);
			drawMark(tickLength, i);
		}
	}
	
	private static void plotAndDraw(int tickLength){
		if (tickLength >= 1) { // TickLength = 0 is the base case to exit recursion
			plotAndDraw(tickLength - 1);
			drawMark(tickLength);
			plotAndDraw(tickLength -1);
		}
	}
	
	private static void drawMark(int tickLength, int label) {
		StringBuilder tick = new StringBuilder();
		
		while (tickLength-- > 0) {
			tick.append("-");
		}
		
		if (label > -1) {
			tick.append(" " + label);
		}
		System.out.println(tick);
	}
	
	private static void drawMark(int tickLength) {
		drawMark(tickLength, -1);
	}
	

	public static void main(String[] args) {
		
		System.out.println("Drawing ruler for 5 inches with 3 ticks");
		drawRuler(5, 3);
		
		System.out.println("Drawing ruler for 5 inches with 4 ticks");
		drawRuler(5, 4);
		
		System.out.println("Drawing ruler for 3 inches with 2 ticks");
		drawRuler(3, 2);

	}

}
