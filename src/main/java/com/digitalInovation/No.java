package com.digitalInovation;

public class No {

       private Object payLoad;
       private Object refNo;

       public No() {

       }

       public No(Object payLoad) {
              this.refNo=null;
              this.payLoad = payLoad;
       }

       public Object getPayLoad() {
              return payLoad;
       }

       public void setPayLoad(Object payLoad) {
              this.payLoad = payLoad;
       }

       public Object getRefNo() {
              return refNo;
       }

       public void setRefNo(No refNo) {
              this.refNo = refNo;
       }

       @Override
       public String toString() {
              return "No{" +
                      "payLoad=" + payLoad +
                      '}';
       }
}
