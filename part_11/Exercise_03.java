//package part_11;
//
///**
// * Modify your Queue Class so that it is completely generic
// */
//public  class Exercise_03 <R> {
//
//   private R[] genq;
//   private int getloc, putloc;
//
//    public Exercise_03(int size) {
//
//        genq = (R[]) new Object(size) ;
//
//        getloc = putloc =0;
//    }
//
//    void put(R value) {
//
//        if (putloc == genq.length) {
//
//            System.out.println("Full");
//
//            return;
//
//        } else {
//
//            genq[putloc++] = value;
//        }
//    }
//
//    <R> int get() {
//
//        if (getloc == putloc) {
//
//            System.out.println("Empty");
//        }else{
//
//            return genq[getloc++];
//        }
//    }
//
//}
