public class Main {
    public static void main(String[] args) {
// В (0;0) с fuel = 100
        Plane plane = new Plane(100, 100, 100, 1000, 5);

        plane.flyStraight(500);
        plane.flyUp(80, 9);
        plane.turnRight();
        plane.flyStraight(30);
        plane.dropBombs(2);
        plane.flyStraight(40);
        plane.flyDown(100,10);
        plane.fillFuel();
        plane.flyDown(100,10);
        plane.fillFuel();
    }
}
