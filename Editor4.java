import java.awt.Color;

public class Editor4 {
    public static void main (String[] args) {
		String source = args[0];
		Color[][] sourceImage = Runigram.read(source);
		Color [][] grayImage = Runigram.grayScaled(sourceImage);
        Runigram.setCanvas(sourceImage);
        Runigram.display(sourceImage);
        StdDraw.pause(2000);
        Runigram.display(grayImage);
	}
}
