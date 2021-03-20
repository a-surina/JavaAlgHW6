public class Coin {
    private final int value;
    private final String currency;
    private final String metal;

    public Coin(int value, String currency, String metal) {
        this.value = value;
        this.currency = currency;
        this.metal = metal;
    }

    public void printer() {
        System.out.println("a " + this.metal + " " + this.value + " " + this.currency + " coin");
    }

    public boolean equals(Coin b) {
        return (this.getValue() == b.getValue()) &&
                (this.getCurrency().equals(b.getCurrency())) &&
                        (this.getMetal().equals(b.getMetal()));
    }

    public int getValue() {
        return value;
    }


    public String getCurrency() {
        return currency;
    }

    public String getMetal() {
        return metal;
    }
}
