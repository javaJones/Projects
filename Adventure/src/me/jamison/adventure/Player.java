package me.jamison.adventure;

public class Player {
	private String name;
	private int health;
	private double money;
	
	//constructor for player class
	public Player(String n) {
		name = n;
		health = 10;
		money = 20.00;
	}
	
	// sets and gets to modify a player's money and or health
	public String getName(){
		return name; 
	}
	
	public int getHealth(){
		return health;
	}
	
	public double getMoney(){
		return money;
	}
	
	public void setHealth(int h){
		health = h; 
	}
	
	public void setMoney(double m){
		money = m;
	}
	
	public void modifyHealth(int h){
		 health =+ h;
	}
	
	public void modifyMoney(double m){
		money += m;
	}
}
