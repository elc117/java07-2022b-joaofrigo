public class MyTurtle extends BaseTurtle {
  public void draw() {
    this.forward(4);
    this.moveTo(6,6);
    this.turn(34);
    pen.setRandomColor();
    pen.down();
    this.setDelay(1);
    this.back(3);
    this.moveBy(3,1);
    //this.pause(5);
    this.reset();
    // O teste.

    pen.setStrokeWidth(5000);
    pen.setRandomColor();
    pen.up();
    this.back(4);
    this.forward(4);
    pen.down();
    for (int i = 0; i<5000; i++) {
    this.setDelay(1);
    this.forward(0.-3);
    this.turn(5);
    this.moveTo(10,-5);
    this.moveTo(3,6);
    pen.setRandomColor();
    this.moveTo(5,0);
    this.moveTo(-7,15);
    pen.setRandomColor();
    this.moveTo(0,3);
    this.moveTo(5,-10);
    this.turn(10);
    pen.setRandomColor();
    this.moveTo(-6,9);
    this.moveTo(9,6);
    this.moveTo(-5,-10);
    this.moveTo(-4,-15);
    this.moveTo(-30,-6);
    pen.setRandomColor();
    this.moveTo(-4,9);
    this.moveTo(0,-10);
    this.moveTo(-10,0);
    this.moveTo(5,-10);
    this.moveTo(-10, 5);
    pen.setRandomColor();
    }
    this.pause(10);
    this.reset();
  }
}
