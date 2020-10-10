package example.one.generic.service;

public class CustomerOrderPair<O, P> implements CustomerService<O,P> {

    private O key;
    private P value;

    public CustomerOrderPair(O key, P value) {
        this.key = key;
        this.value = value;
    }

    public O getKey() {
        return key;
    }

    public P getValue() {
        return value;
    }
}
