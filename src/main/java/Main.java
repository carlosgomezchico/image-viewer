package software.ulpgc.imageviewer;

import java.io.File;

public class Main {
    public static final String root = "C:/Users/Entrar/Pictures";

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        ImageDisplay imageDisplay = frame.imageDisplay();
        ImageLoader imageLoader = new FileImageLoader(new File(root));
        Image initialImage = imageLoader.load();

        frame.add("<", new PreviousImageCommand(imageDisplay));
        frame.add(">", new NextImageCommand(imageDisplay));

        imageDisplay.show(initialImage);
        frame.setVisible(true);
    }
}
