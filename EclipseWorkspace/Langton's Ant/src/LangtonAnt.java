import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LangtonAnt extends JPanel
{
	private static BufferedImage canvas;
	private int antX, antY;
	
	private static final int WIDTH = 1920; 
	private static final int HEIGHT = 1080;
	
	public LangtonAnt(int width,int height)
	{
		antX = WIDTH/2;
		antY = HEIGHT/2;
		canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        randomFillCanvas();
	}
	public void fillCanvas(Color c) {
        int color = c.getRGB();
        for (int x = 0; x < canvas.getWidth(); x++) {
            for (int y = 0; y < canvas.getHeight(); y++) { 
                canvas.setRGB(x, y, color);
            }
        }
        repaint();
    }
	public void randomFillCanvas() {
		int black = Color.BLACK.getRGB();
		int white = Color.WHITE.getRGB();
		
		for(int x = 0; x < canvas.getWidth();x++){
			for(int y = 0; y < canvas.getHeight(); y++){
				int z = (int)(Math.random()*10);
				switch(z){
				case 1 : canvas.setRGB(x, y, black);break;
				}
			}
		}
		
		
	}
	public void SwapPixel(int x3, int y3){
		int black = Color.BLACK.getRGB();
		int white = Color.WHITE.getRGB();
		if(canvas.getRGB(x3,y3) == white){
		canvas.setRGB(x3, y3, black);
		}else{
			canvas.setRGB(x3, y3, white);
		}
		
		try{
			Thread.sleep(1);
		}catch(InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		
		repaint();
	}
	private static boolean isBlack(int x, int y){
		int color = Color.BLACK.getRGB();
		
		if(canvas.getRGB(x, y) != color)
			return false;
		
		return true;
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(canvas, null, null);
    }
	public static int[] moveAnt(int x1, int y1, boolean isBlack, int direction){
		int[] output = new int[3];
		
		if(isBlack){
			if(direction == 1){
				direction = 4;
			}else{
				direction--;
			}
		}else{
			if(direction == 4){
				direction = 1;
			}else{
				direction++;
			}
		}
		switch(direction){
			case 1 : y1--;break; 
			case 2 : x1++;break;
			case 3 : y1++;break;
			case 4 : x1--;break;
		}
		output[0] = x1;
		output[1] = y1;
		output[2] = direction;
		
		return output;
		
	}
	
	public static void main(String... args){
		JFrame frame = new JFrame("Langton Ant Demo");
		
		int x = 1920/2;
		int y = 1080/2;
		int z = 4;
		LangtonAnt test = new LangtonAnt(1920,1080);
		
		frame.add(test);
		frame.pack();
		frame.setSize(1920, 1080);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(true){
			test.SwapPixel(x,y);
			int[] array = moveAnt(x,y,isBlack(x,y),z);
			x = array[0];
			y = array[1];
			z = array[2];
			}
	}			
}


