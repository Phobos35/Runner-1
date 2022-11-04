import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class StaticThing {

    private double sizeX;
    private double sizeY;
    private ImageView desert;

    public ImageView getDesert() {
        return desert;
    }

    public StaticThing(String fileName, int x){
        Image fichierDesert = new Image(fileName);
        desert = new ImageView(fichierDesert);
        desert.setViewport(new Rectangle2D(0, 50,800,300));
        desert.setX(x);
    }


    public StaticThing(String fileName, double x, double y){
        this.sizeX = x;
        this.sizeY = y;

        Image fichierDesert = new Image(fileName);
        desert = new ImageView(fichierDesert);
    }
}
