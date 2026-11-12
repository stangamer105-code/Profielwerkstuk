import pixel.PixelColorChooser;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

void main(String[] args) throws IOException {
    int width = Integer.parseInt(args[0]);
    int height = Integer.parseInt(args[1]);
    int color = Integer.parseInt(args[2]);

    BufferedImage image =
            color ==2
                ? PixelColorChooser.TwoColorChooser(width, height) : (
            color==4
                ? PixelColorChooser.FourColorChooser(width, height) : (
            color==8
                ? PixelColorChooser.EightColorChooser(width, height): (
            color==16
                ? PixelColorChooser.HEXColorChooser(width, height): (
            color==0
                ? PixelColorChooser.RGBColorChooser(width, height): null
                    ))));
    ImageIO.write(image, "png", new File("noise.png"));
}