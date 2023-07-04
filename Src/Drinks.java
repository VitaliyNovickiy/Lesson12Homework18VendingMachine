class Drinks {
      double COFFEE_PRICE = 2.5;
      double TEA_PRICE = 1.5;
      double LEMONADE_PRICE = 2.0;
      double MOJITO_PRICE = 3.0;
      double MINERAL_PRICE = 1.0;
      double COCA_COLA_PRICE = 2.5;

    private int quantity;
    private double totalPrice;

    public Drinks() {
        this.quantity = 0;
        this.totalPrice = 0.0;
    }

    public void makeDrink(DrinksMachine drink) {
        quantity++;
        switch (drink) {
            case COFFEE:
                totalPrice += COFFEE_PRICE;
                System.out.println("Making coffee...");
                break;
            case TEA:
                totalPrice += TEA_PRICE;
                System.out.println("Making tea...");
                break;
            case LEMONADE:
                totalPrice += LEMONADE_PRICE;
                System.out.println("Making lemonade...");
                break;
            case MOJITO:
                totalPrice += MOJITO_PRICE;
                System.out.println("Making mojito...");
                break;
            case MINERAL:
                totalPrice += MINERAL_PRICE;
                System.out.println("Making mineral water...");
                break;
            case COCA_COLA:
                totalPrice += COCA_COLA_PRICE;
                System.out.println("Making Coca-Cola...");
                break;
        }
    }
    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}