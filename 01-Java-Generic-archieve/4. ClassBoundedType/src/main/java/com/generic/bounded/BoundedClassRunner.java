package com.generic.bounded;

public class BoundedClassRunner {

    public static void main(String [] args){

        BoundedType<C> boundedTypeC=new BoundedType<C>(new C());
        boundedTypeC.doCallMethod();

        BoundedType<B> boundedTypeB=new BoundedType<B>(new B());
        boundedTypeB.doCallMethod();

        BoundedType<A> boundedTypeA=new BoundedType<A>(new A());
        boundedTypeA.doCallMethod();
    }
}
