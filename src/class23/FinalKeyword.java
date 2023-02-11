package class23;

 public  class FinalKeyword {

    final double gravity=9.8;
    final double PI=3.14;
    final double LightSpeed=299792458;

    final void tryChangingGravity(){
       //  gravity=1.6; // can't change the value of PI because it has FINAL keyword
    }
}

class Child extends FinalKeyword{
    // void tryChangingGravity(){    you can't override the method in Child class if there is final in void mathod


}