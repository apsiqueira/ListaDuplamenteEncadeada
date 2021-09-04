package com.digitalInovation;

public class No<T> {


    private T payload;
    private No proximoNo;


    public No() {
       this.payload=null;

    }

    public No(T payload) {
        this.payload = payload;
    }

    public No(T payload, No proximoNo) {
        this.payload = payload;
        this.proximoNo = proximoNo;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "payload=" + payload +
                '}';
    }



    public String toStringPerson() {
        String msn="No {No "+ "conteudo ="+payload +"}";


        if(proximoNo!=null){
            msn+="--->"+proximoNo.toString();

        }
        else{
            msn+="null";

        }
        return msn;
    }
}
