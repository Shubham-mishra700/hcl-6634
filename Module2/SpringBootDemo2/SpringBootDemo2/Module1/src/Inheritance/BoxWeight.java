package Inheritance;

public class BoxWeight extends Box{
    double weight;


    BoxWeight(){
        this.weight=-2;
    }

    BoxWeight(double l,double h,double w,double weight){
      super(l,h,w);//call the parent class constructor and initialise the values.
                     //here you will say but h is private how it is initialising it here as here BoxWeight is not doing this Box itself doing this
        this.weight=weight;

      //  super(l,h,w); here we cannot write we should write this at start of this because parent class must be initialised first




    }
}

