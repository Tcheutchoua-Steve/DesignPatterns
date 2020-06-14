package adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{

  private OldCoffeeMachine oldCoffeeMachine;

  public void crateCoffeeMachine(OldCoffeeMachine coffeeMachine){
    this.oldCoffeeMachine = coffeeMachine;
  }
  @Override
  public void chooseFirstSelection() {
     getSelectA();
  }

  @Override
  public void chooseSecondSelection() {
    getSelectB();
  }

  private void getSelectA(){this.oldCoffeeMachine.selectA();}
  private void getSelectB(){this.oldCoffeeMachine.selectB();}

}
