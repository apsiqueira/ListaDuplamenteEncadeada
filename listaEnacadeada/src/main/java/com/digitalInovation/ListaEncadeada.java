package com.digitalInovation;

public class ListaEncadeada<T> {

    No<T> refEntree;

    public ListaEncadeada() {
        this.refEntree = null;
    }

    public boolean isEmpty(){
        if(this.refEntree!=null){
            return false;
        }
        else{
            return true;
        }

    }
    public int size(){
        int cont=0;
        No<T> refer=refEntree;

        while (true){
            if(refer!=null){
                cont++;
                if(refer.getProximoNo()!=null){
                    refer=refer.getProximoNo();

                }
                else{
                    break;
                }

            }
            else{
                break;
            }
        }

        return cont;


    }

    public void add(T conteudo){
        No<T> novoNo=new No<>(conteudo);
        if(this.isEmpty()){
            refEntree=novoNo;
            return;
        }
        No<T> reefNo=refEntree;
        for(int i=0;i<this.size()-1;i++){
            reefNo=reefNo.getProximoNo();
        }

        reefNo.setProximoNo(novoNo);




    }



}
