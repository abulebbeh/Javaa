public class Candle {
     public static void main(String[] args){
}
    String color;
    int height;
    double price;

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
        this.price = 2.00 * height;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }
}
