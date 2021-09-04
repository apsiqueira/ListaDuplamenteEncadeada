package com.digitalInovation;

public class Fila {




    public Fila() {
        this.noRefEntrada = null;
    }
    public Fila(No noRefEntrada) {
        this.noRefEntrada = null;
    }

    public boolean IsEmpty() {
        return noRefEntrada == null ? true : false;

    }

    public void enqueue(Object obj) {
        Object novoNo=new No(obj);

        novoNo.setRefNo(this.noRefEntrada);
        this.noRefEntrada = novoNo;
    }

    public Object first() {
        if (!this.IsEmpty()) {
            Object firstNo = noRefEntrada;
            while (true) {
                if (firstNo.getRefNo() != null) {
                    firstNo = firstNo.getRefNo();

                } else {
                    break;
                }

            }
          return firstNo;
        }
        return null;

    }


    public Object dequeue() {
        if (!this.IsEmpty()) {

            Object firstNo = noRefEntrada;
            Object noAux = noRefEntrada;
            while (true) {
                if (firstNo.getRefNo() != null) {
                    noAux = firstNo;
                    firstNo = firstNo.getRefNo();

                } else {
                    noAux.setRefNo(null);
                    break;
                }

            }
            return firstNo.getObject();


        }
        return null;

    }

    @Override
    public String toString() {
        String retorno="";
        No noControleString = noRefEntrada;
        if(noRefEntrada!=null){
            while (true){
                retorno +="[No{objeto = "+ noControleString.getPayLoad()+"}]====>";

                if(noControleString.getRefNo()!=null){
                    noControleString=noControleString.getRefNo();
                }
                else{
                    retorno+="null";
                    break;
                }


            }


        }
        else {
            retorno="null";
        }

        return  retorno;
    }
}


