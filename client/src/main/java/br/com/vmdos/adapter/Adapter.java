package br.com.vmdos.adapter;

public interface Adapter<T, Y> {

    public T from(Y object);

}
