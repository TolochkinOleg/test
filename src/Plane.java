public class Plane {

    static int ntanks;
    private int x, y, z;
    private int dir;
    private int fuel;
    private int bomb;
    private int n;

    public Plane() {
        this(0, 0, 0, 100, 5);
    }

    public Plane(int x, int y, int z) {
        this(x, y, z, 1000, 5);
    }

    public Plane(int x, int y, int z, int fuel, int bomb) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.fuel = fuel;
        this.bomb = bomb;
        n = ++ntanks;
    }

    public void flyStraight(int i) {
        if (i < 0 && -i > -fuel)
            i = -fuel;
        else if (i > fuel)
            i = fuel;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= Math.abs(i);
        System.out.println("Вы пролетели прямо и сейчас находитесь на координатах: x= " + x + ", y= " + y + ", z= " + z + ". Топлива осталось= " +fuel);

        }

    public void printPosition() {
        System.out.println("The Tank " + "-" + n + " is at " + x +", " + y + " now.");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
        System.out.println("Вы повернули налево");
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
        System.out.println("Вы повернули направо");
    }

    public void goBackward(int i) {
        flyStraight(-i);
    }

    public void flyUp (int z1, int x1) {
        x += x1;
        z += z1;
        fuel -= x1;
        System.out.println("Вы поднялись ввысь и сейчас находитесь на координатах: x= " + x + ", y= " + y + ", z= " + z + ". Топлива осталось= " +fuel);
    }

    public void dropBombs(int i) {
        bomb -= i;
        System.out.println("Самолет сбросил бомбы по координатам x= " + x + ", y= " + y + ", z= " + z + ". Кол-во бомб= " +bomb);
    }

    public void flyDown(int z1, int x1) {
        x -= x1;
        z -= z1;
        if (z < 0) {
            System.out.println("Самолет приземлился)))");
            fuel -= x1;
        } else {
            System.out.println("Вы опустились ниже и сейчас находитесь на координатах: x= " + x + ", y= " + y + ", z= " + z + ". Топлива осталось= " +fuel);
        }
    }

    public void fillFuel(){
        if (z > 0) {
            System.out.println("Нельзя заправляться в воздухе");
        } else {
            fuel = 1000;
            System.out.println("Вы заправились. Сейчас топлива= " + fuel);
        }
    }
}