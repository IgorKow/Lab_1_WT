package util;

import java.awt.Color;
import java.util.ArrayList;

public class Basket {
	
	public ArrayList<Ball> balls;
	public double wait;
	
	public Basket(ArrayList<Ball> balls) 
	{
		this.balls = new ArrayList<>();
		this.wait = 0;
		
		for(Ball ball : balls) 
		{
			this.balls.add(ball);
		}
		
	}
	
	public double BallWeight() 
	{
		for(Ball ball: balls) 
		{
			wait += ball.wait; 
		}
		
		return wait;
	}
	
	public int NumberOfBlueBalls()
	{
		int count = 0;
		
		for(Ball ball: balls) 
		{
			if(ball.color == Color.BLUE) 
			{
				count++;
			} 
		}
		
		return count;
	}
	

}