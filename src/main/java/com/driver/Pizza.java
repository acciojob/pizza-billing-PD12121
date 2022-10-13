package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private  int BasePriceOfThePizza = 0;
    private int ExtraCheeseAdded = 0;
    private int ExtraToppingsAdded = 0;
    private int PaperbagAdded = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300;
        }
        else this.price = 400;

        this.BasePriceOfThePizza = price;
        bill = "Base Price Of The Pizza: "+ BasePriceOfThePizza+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.ExtraCheeseAdded = 1;
    }

    public void addExtraToppings(){
        if(this.isVeg == true){
           this.ExtraToppingsAdded = 1;
        }
        else this.ExtraToppingsAdded = 2;

    }

    public void addTakeaway(){
        this.PaperbagAdded=1;
    }

    public String getBill(){
        if(this.ExtraCheeseAdded == 1){
            ExtraCheeseAdded = 80;
            bill += "Extra Cheese Added: "+ExtraCheeseAdded+"\n";
        }
        if(this.ExtraToppingsAdded == 1){
            ExtraToppingsAdded = 70;
            bill+= "Extra Toppings Added: "+ExtraToppingsAdded+"\n";
        }
        if(this.ExtraToppingsAdded == 2){
            ExtraToppingsAdded = 120;
            bill+= "Extra Toppings Added: "+ExtraToppingsAdded+"\n";
        }
        if(this.PaperbagAdded == 1){
            PaperbagAdded = 20;
            bill+= "Paperbag Added: "+PaperbagAdded+"\n";
        }
        int total = BasePriceOfThePizza+ExtraCheeseAdded+ExtraToppingsAdded+PaperbagAdded;
        bill+= "Total Price:"+total;
        return this.bill;
    }
}
