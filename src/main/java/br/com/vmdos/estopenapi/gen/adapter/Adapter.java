package br.com.vmdos.estopenapi.gen.adapter;

public interface Adapter<T, Y> {

    public T from(Y object);

}
