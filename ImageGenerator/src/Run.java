import pixel.PixelColorChooser;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

void main(String[] args) throws IOException {
    int width = Integer.parseInt(args[0]);
    int height = Integer.parseInt(args[1]);

    BufferedImage image = PixelColorChooser.TwoColorChooser(width, height);
    ImageIO.write(image, "png", new File("noise.png"));
}