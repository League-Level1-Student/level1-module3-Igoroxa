package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	

	World world = new World();
	Bug bug = new Bug();
	Bug bugrandom = new Bug();
	Random generator = new Random();
	int x = generator.nextInt(9);
	int y = generator.nextInt(9);
	
	Location locran = new Location(x,y);
	
	Location location = new Location(5,5);
	
	bug.setColor(Color.blue);
	bug.turn();
	bug.turn();
	world.add(location, bug);
	world.add(locran, bugrandom);
	
	world.show();
	
}
}
