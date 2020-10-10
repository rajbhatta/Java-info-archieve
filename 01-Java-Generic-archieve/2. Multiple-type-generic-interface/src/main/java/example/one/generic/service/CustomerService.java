package example.one.generic.service;

public interface CustomerService<O,P> {
     O getKey();
     P getValue();
}
