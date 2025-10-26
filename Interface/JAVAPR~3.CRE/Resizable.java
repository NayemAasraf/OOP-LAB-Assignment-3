interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Width resized to: " + width);
        }
    }

    @Override
    public void resizeHeight(int height) {
        if (height > 0) {
            this.height = height;
            System.out.println("Height resized to: " + height);
        }
    }

    public void printDimensions() {
        System.out.println("Current dimensions (W x H): " + this.width + " x " + this.height);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(100, 50);

        System.out.println("--- Initial State ---");
        rect.printDimensions();

        System.out.println("\n--- Resizing ---");
        rect.resizeWidth(150);
        rect.resizeHeight(75);

        System.out.println("\n--- Final State ---");
        rect.printDimensions();
    }
}