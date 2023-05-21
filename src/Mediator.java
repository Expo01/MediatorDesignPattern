public interface Mediator {

    //interface for mediator which will assist with adding collegue (a potential buyer or seller), and then organizing
    // the buy and sale offers between them

    public void saleOffer(String stock, int shares, int collCode);

    public void buyOffer(String stock, int shares, int collCode);

    public void addColleague(Colleague colleague);

}