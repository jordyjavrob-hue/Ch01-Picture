/**
 * This picture shows a person standing outside a small house
 * on a sunny day.
 *
 * @author Jordy Robalino
 * @version 09.20.2026
 */
public class Picture
{
    private Square house;
    private Triangle roof;
    private Square door;
    private Square window1;
    private Square window2;
    private Circle sun;
    private Person person;

    /**
     * Constructor for objects of class Picture.
     */
    public Picture()
    {
        house = new Square();
        roof = new Triangle();
        door = new Square();
        window1 = new Square();
        window2 = new Square();
        sun = new Circle();
        person = new Person();
    }

    /**
     * Draw the picture.
     */
    public void draw()
    {
        house.changeColor("red");
        house.changeSize(120);
        house.moveHorizontal(40);
        house.moveVertical(90);
        house.makeVisible();

        roof.changeColor("green");
        roof.changeSize(70, 140);
        roof.moveHorizontal(30);
        roof.moveVertical(55);
        roof.makeVisible();

        door.changeColor("black");
        door.changeSize(40);
        door.moveHorizontal(75);
        door.moveVertical(150);
        door.makeVisible();

        window1.changeColor("blue");
        window1.changeSize(25);
        window1.moveHorizontal(50);
        window1.moveVertical(115);
        window1.makeVisible();

        window2.changeColor("blue");
        window2.changeSize(25);
        window2.moveHorizontal(115);
        window2.moveVertical(115);
        window2.makeVisible();

        sun.changeColor("yellow");
        sun.changeSize(50);
        sun.moveHorizontal(200);
        sun.moveVertical(-30);
        sun.makeVisible();

        person.changeColor("black");
        person.changeSize(60, 30);
        person.moveHorizontal(-260);
        person.moveVertical(5);
        person.makeVisible();
    }

    /**
     * Change the picture to black and white.
     */
    public void setBlackAndWhite()
    {
        house.changeColor("white");
        roof.changeColor("black");
        door.changeColor("black");
        window1.changeColor("black");
        window2.changeColor("black");
        sun.changeColor("black");
        person.changeColor("black");
    }

    /**
     * Return the picture to its original colors.
     */
    public void setColor()
    {
        house.changeColor("red");
        roof.changeColor("green");
        door.changeColor("black");
        window1.changeColor("blue");
        window2.changeColor("blue");
        sun.changeColor("yellow");
        person.changeColor("black");
    }
}
