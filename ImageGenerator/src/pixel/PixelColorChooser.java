package pixel;
import java.awt.image.BufferedImage;
import java.util.random.RandomGenerator;


public class PixelColorChooser {
    public static BufferedImage TwoColorChooser(int width, int height) {
        var image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        var random = RandomGenerator.getDefault();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, random.nextBoolean() ? 0xFFFFFF : 0x000000);
            }
        }
        return image;
    }
}
