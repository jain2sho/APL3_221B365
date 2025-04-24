class Icecream extends Decorator {
    Icecream(Offering offering){
        this.offering=offering;
    }
    String getName(){
        return offering.getName()+" with Icecream";
    }
    int getPrice(){
        return offering.getPrice()+60;
    }
}