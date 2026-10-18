package pixel;
import java.awt.image.BufferedImage;
import java.util.random.RandomGenerator;

import static java.lang.Math.floor;


public class PixelColorChooser {
    public static BufferedImage TwoColorChooser(int width, int height) {
        var image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        var random = RandomGenerator.getDefault();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, random.nextBoolean() ? 0xffffff : 0x000000);
            }
        }
        return image;
    }

    public static BufferedImage FourColorChooser(int width, int height) {
        var image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        var random = RandomGenerator.getDefault();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                image.setRGB(x, y, random.nextBoolean() ? (random.nextBoolean() ? 0xE6194B : 0x3CB44B ) : (random.nextBoolean() ? 0xFFE119 : 0x4363D8 ));
            }
        }
        return image;
    }
    public static BufferedImage EightColorChooser(int width, int height) {
        var image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        var random = RandomGenerator.getDefault();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int number= (int) floor(8*Math.random());
                int color = switch (number){
                    case 0 -> 0x000000;
                    case 1 -> 0xFFFFFF;
                    case 2 -> 0xE6194B;
                    case 3 -> 0x3CB44B;
                    case 4 -> 0xFFE119;
                    case 5 -> 0x4363D8;
                    case 6 -> 0xF58231;
                    case 7 -> 0x911EB4;
                    default -> 0x0000000;
                };
                image.setRGB(x, y, color);
            }
        }
        return image;
    }

    public static BufferedImage HEXColorChooser(int width, int height) {
        var image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        var random = RandomGenerator.getDefault();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int number= (int) floor(16*Math.random());
                int color = switch (number){
                    case 0 -> 0x000000;
                    case 1 -> 0xFFFFFF;
                    case 2 -> 0xE6194B;
                    case 3 -> 0x3CB44B;
                    case 4 -> 0xFFE119;
                    case 5 -> 0x4363D8;
                    case 6 -> 0xF58231;
                    case 7 -> 0x911EB4;
                    case 8 -> 0x46F0F0;
                    case 9 -> 0xF032E6;
                    case 10 -> 0xBCF60C;
                    case 11 -> 0x008080;
                    case 12 -> 0x9A6324;
                    case 13 -> 0x800000;
                    case 14 -> 0x000075;
                    case 15 -> 0x808000;
                    default -> 0x0000000;
                };
                image.setRGB(x, y, color);
            }
        }
        return image;
    }

    public static BufferedImage RGBColorChooser(int width, int height) {
        var image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        var random = RandomGenerator.getDefault();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setRGB(x, y, random.nextInt(0x1000000));
            }
        }
        return image;
    }


}
