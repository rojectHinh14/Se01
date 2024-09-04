package Tut01;

public class Ex02 {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        for (int i = 0; i < 100; i++) {
            c1.increment();
            c2.increment();
        }
        System.out.println(c1.get());
        System.out.println(c2.get());
    }
   public static  class Counter{

       int count;
       public Counter(){
           this.count = 0;
       }
       public int get(){
           return this.count;
       }
       public void increment(){
           this.count++;
       }

    }

    public static class Counter2 extends Counter {

        public Counter2() {
         super();

        }
@Override
        public void increment(){
        this.count = count*2;
        }

    }
}

