package ua.edu.ucu.apps.Task3;

public class Main {
    public static void main(String[] args) {
        MyImage img = new ProxyImage("sofiiapopeniuk/Downloads/photo_2024-11-11 9.50.47 AM.jpeg");
        System.out.println("Image created but not loaded yet.");
        img.display();
    }
}
