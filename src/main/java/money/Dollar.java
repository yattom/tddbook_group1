package money;

class Dollar extends Money {
  Dollar(int amount, String currency) {
    super(amount, currency);
  }
  Money times(int multiplier) {
    return new Dollar(amount * multiplier, currency);
  }
}