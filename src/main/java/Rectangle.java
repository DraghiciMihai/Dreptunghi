public class Rectangle {
    private int lungime = 1;
    private int latime = 1;

    public Rectangle() {
    }

    public Rectangle(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getArea(){
        return this.latime*this.lungime;
    }

    public int getPerimeter(){
        return 2 * this.latime + 2 * this.lungime;
    }
}
