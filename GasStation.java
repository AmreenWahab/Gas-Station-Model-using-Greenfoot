import java.util.ArrayList;
import java.util.List;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasStation extends Screen implements IDisplayComponent
{
    public boolean ok = true;

	private World world;
	private List<IDisplayComponent> components = new ArrayList<>();
	
	public GasStation(World world) {
		this.world = world;
	}
	/**
     * Act - do whatever the GasStation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    	if(ok==true){
    		PrintReceipt rp = getWorld().getObjects(PrintReceipt.class).get(0);
    		rp.calculateReceipt(15, false, 93);
    	}
    }
    

	@Override
	public void display() {
		// TODO Auto-generated method stub
		world.addObject((Actor) this, 450, 250);
		for (IDisplayComponent component : components) {
			component.display();
		}
	}

	@Override
	public void addSubComponent(IDisplayComponent c) {
		// TODO Auto-generated method stub
		components.add( c );
	}    
}
