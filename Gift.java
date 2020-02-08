package com.epamtask1.gifts;
import java.util.ArrayList;

public class Gift{// class for sweets
	public class Sweets{
	double weight;
	double price;
	double sugPer;
	String name;
	String producer;
	public Sweets() {
		super();
		
	}
	public Sweets(double weight,double price,double sugPer,String name,String producer) {
		super();
		this.weight=weight;
		this.price=price;
		this.sugPer=sugPer;
		this.name=name;
		this.producer=producer;
	}
	public double getWeight() {
		return weight;
	}
	public double getPrice() {
		return price;
	}
	public double getSugPer() {
		return sugPer;
	}
	public Sweets setWeight(double weight) {
		this.weight=weight;
		return this;
	}
	public Sweets setPrice(double price) {
		this.price=price;
		return this;
	}
	public Sweets setsugPer(double sugPer) {
		this.sugPer=sugPer;
		return this;
	}
	public String getName() {
		return name;
	}
	public String getProducer() {
		return producer;
	}
	public Sweets setName(String name) {
		this.name=name;
		return this;
	}
	public Sweets setProducer(String producer) {
		this.producer=producer;
		return this;
	}
	public void calSugPer() {
		double calSugPer=getWeight()*getSugPer();
		System.out.println(calSugPer);
	}
	}
	class Candies extends Sweets{
	    Candies(){}
	    Candies(double weight,double price,double sugPer,String name, String producer){
	    	super(weight,price,sugPer,name,producer);
	    }
	        public  void calSugPer(){
	            double calSugPer = (getWeight()*getSugPer()*getSugPer()/getSugPer()*0.04);
	            System.out.println(calSugPer);
	        }
	    }
	class Chocoss extends Sweets{
	    Chocoss(){
	    }
	    Chocoss(double weight, double price,double sugPer, String name, String producer){
	    	super(weight,price,sugPer,name,producer);
	    }
	        public void calSugPer(){
	            double calSugPer = getWeight()+getWeight()*0.03+getSugPer();
	            System.out.println(calSugPer);
	        }
	    }
	public class NewYearGift{
	    String name;
	    double weight;
	    ArrayList<Sweets> newyeargift;
	    NewYearGift(){
	        newyeargift = new ArrayList<Sweets>();
	    }
	    NewYearGift(String name, Sweets...components){
	        this.name=name;
	        newyeargift=new ArrayList<Sweets>();
	        for (Sweets s : components){
	            this.newyeargift.add(s);
	        }
	    }
	    String getName(){return name;}

	    public NewYearGift setName(String name){
	        this.name=name;
	        return this;
	    }
	    public NewYearGift setComponent(Sweets s){
	        this.newyeargift.add(s);
	        return this;
	    }

	    void getWeight(double weight){
	        this.weight+=weight;
	    }

	    double getWeight(){
	        for (Sweets w:newyeargift){
	            weight+=w.getWeight();
	        }
	        return weight;
	    }
	    public String toString(){
	        final StringBuilder sb = new StringBuilder("New Years Gift have been created with name:");
	        sb.append("[ ").append(name).append("] and with:");
	        sb.append(" weight ").append(getWeight());
	        return sb.toString();
	    }
	}
	class Waffel extends Sweets{
	    Waffel(){
	    }

	    Waffel(double weight,double price, double sugPer, String name,String producer){
	        super(weight,price,sugPer,name,producer);
	    }
	    public void calSugPer(){
	        double calSugPer=(getWeight()*getSugPer())+10;
	        System.out.println(calSugPer);
	    }
	}
    public static void main( String[] args )
    {
    	NewYearGift root = new NewYearGift();
        NewYearGift newyeargift1 = new NewYearGift("gifts", new Waffel(25,25,40,"Pan","Waffel Co"),new Candies(500,120,100,"Cadbury","Mondelez"), new Chocoss(120,34,98,"KitKat with nuts","KitKat"));
        System.out.println(newyeargift1);
        //System.out.println(newyearCandies);


        //sweets objects
        Waffel waffel1 = new Waffel(25,25,40,"Artec","Artec Ltd.");
        Candies candy1 = new Candies(500,120,100,"Zoryane Syaivo","Svitoch");
        Chocoss Chocos1 = new Chocoss(120,34,98,"Korona with nuts","Korona");
        System.out.println("Sugar % of Waffel ");
        vafel1.calSugPer();
        System.out.println("Sugar % of Candies ");
        candy1.calSugPer();
        System.out.println("Sugar % of Chocos ");
        Chocos1.calSugPer();

    }
}
