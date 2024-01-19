package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
       if(isVeg==true) {
    	   this.price=300;
    	   this.bill = "Veg pizza base price: " + price + "\n";
       }else {
    	   this.price=400;
    	   this.bill = "Non-veg pizza base price : " + price + "\n";
       }
     
        
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
    	this.price+=80;
    	 this.bill += "Extra Cheese Added: 80\n";
    }

    public void addExtraToppings(){
        // your code goes here
    	if(isVeg==true) {
    	this.price+=70;
    	
    	}else {
    		this.price+=120;
    		
    	}
    	 this.bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
    }

    public void addTakeaway(){
        // your code goes here
    	this.price+=20;
    	 this.bill += "Paperbag Added: 20\n";
    	
    }

    public String getBill(){
        // your code goes here
    	 this.bill += "Total Price: " + price + "\n";
        return this.bill;
    }
}
