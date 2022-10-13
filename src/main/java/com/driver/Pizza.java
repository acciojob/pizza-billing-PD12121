package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int ExtraCheeseAdded ;
    private  boolean isExtraCheeseAdded;
    private int ExtraToppingsAdded;
    private  boolean isExtraToppingsAdded;

    private int addTakeawayBag;
    private  boolean isTakeawayBagRequired;

    private boolean isBillCreated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isTakeawayBagRequired = false;
        this.isBillCreated = false;

        this.ExtraCheeseAdded = 80;
        this.addTakeawayBag = 20;

        if(isVeg){
            this.price = 300;
            this.ExtraToppingsAdded = 70;
        }
        else{
            this.price = 400;
            this.ExtraToppingsAdded = 120;

        }
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            this.bill = this.bill + "Extra Cheese Added: "+this.ExtraCheeseAdded+"\n";

            this.price = this.price+this.ExtraCheeseAdded;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.bill = this.bill + "Extra Toppings Added: "+this.ExtraToppingsAdded+"\n";

            this.price = this.price+this.ExtraToppingsAdded;
            this.isExtraToppingsAdded = true;
        }

    }

    public void addTakeaway(){
        if(!isTakeawayBagRequired){
            this.bill = this.bill + "Paperbag Added: "+this.addTakeawayBag+"\n";

            this.price = this.price+this.addTakeawayBag;
            this.isExtraToppingsAdded = true;
        }
    }

    public String getBill(){
        if(!isBillCreated){
            this.bill = this.bill + "Total Price: "+this.price+"\n";
        }
        return this.bill;
    }
}
