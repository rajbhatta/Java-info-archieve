package com.generic.bounded;

public class BoundedType<T extends A> {

    private T objRef;

    public BoundedType(T objRef) {
        this.objRef = objRef;
    }

    public void doCallMethod()
    {
        objRef.printClass();
    }
}
