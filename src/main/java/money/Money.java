package money;

class Money implements Expression {
  protected String currency;
  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  } 
  protected int amount;
  public Expression times(int multiplier){
    return new Money(amount * multiplier, currency);
  }
  public Expression plus(Expression addend) {
    if(addend instanceof Money) {
      if(this.currency.equals(((Money)addend).currency)) {
        return new Money(amount + ((Money)addend).amount, currency);
      }
    }
    return new Sum(this, addend);
  }
  public Money reduce(Bank bank, String to) {
    int rate = bank.rate(currency, to);
    return new Money(amount / rate, to);
  }
  String currency() {
    return currency;
  }
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount
        && currency().equals(money.currency());
  }
  public String toString() {
    return amount + " " + currency; 
  }
  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }
  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }
}