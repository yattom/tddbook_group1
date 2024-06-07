public class YieldSample{
  MyInterface myInterface;
  YieldSample(MyInterface myInterface){
    this.myInterface = myInterface;
  }

  public void run(){
    setUp();
    myInterface.excute();
    closeDown();
  }
}

interface MyInterface{
  public void excute();
}