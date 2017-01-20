package map;

import java.util.ArrayList;

import car.Car;
import inter.Stop;

public class Map {
	private ArrayList<Road> roads;
	private ArrayList<Car> cars;
	
	public ArrayList<Road> getRoads() {
		return roads;
	}
	public ArrayList<Car> getCars() {
		return cars;
	}
	public void addCar(Car c) {
		cars.add(c);
	}
	public Map() {
		roads = new ArrayList<Road>();
		cars = new ArrayList<Car>();
		Node n1 = new Node("P5");
		Node n2 = new Node("P6");
		Node n3 = new Node("P4");	
		Intersection i1 = new Intersection("I1");
		i1.setInter(0, new Stop());
		Road road0 = new Road(n3,i1,500);
		Road road01 = new Road(i1,n3,500);
		Road road1 = new Road(i1,n1,500);
		Road road11 = new Road(n1,i1,500);
		Road road2 = new Road(n2,i1,500);
		Road road21 = new Road(i1,n2,500);
		i1.set(road0, 2);
		i1.set(road2, 0);	
		i1.set(road1, 7);
		i1.set(road01, 3);
		i1.set(road11, 6);
		i1.set(road21, 1);
		i1.setligne(0, 2);
		roads.add(road0);
		roads.add(road1);
		roads.add(road2);
		roads.add(road01);
		roads.add(road11);
		roads.add(road21);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
