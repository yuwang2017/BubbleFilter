package edu.bubblefilter;

import java.util.ArrayList;
import java.util.List;

public class BubbleFilter {
	
	List<Bubble> bubbles = new ArrayList<Bubble>();
	
	public static void main(String[] args) {
		BubbleFilter filter = new BubbleFilter();
		filter.setup();
		
		//Find bubbles close togather:

	}
	
	
	private boolean isTouched(Bubble b1, Bubble b2) {
		
		return false;
	}
	
	
	//Create a lot of bubbles
	public void setup() {
		for(int i=0; i<100; i++) {
			Bubble bubble = new Bubble("Bubble " + i, 
					getRandomDouble(0.0, 100.0),
					getRandomDouble(0.0, 100.0),
					getRandomDouble(5.0, 10.0));
			this.bubbles.add(bubble);
		}
	}
	
	private double getRandomDouble(double min, double max) {
		double result = min - 1.0;
		while(true) {
			result = Math.random() * max;
			if(result >= min && result <=max) {
				return result;
			}
		}
	}

}
