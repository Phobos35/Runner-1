import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {

    private Camera camera ;
    private StaticThing rightBackground;
    private StaticThing leftBackground;



    public GameScene(Integer x, Integer y, Group p){
        super(p, 800, 300);
        this.camera = new Camera(x,y);
        rightBackground = new StaticThing("desert.png", 0);
        leftBackground = new StaticThing("desert.png", 800);
        p.getChildren().add(rightBackground.getDesert());
        p.getChildren().add(leftBackground.getDesert());
    }

    public void render(){

    }




    @Override
    public String toString(){
        return "Ma gameScene possède une caméra de coordonées ("+camera.getCoordinateX()+" , "+camera.getCoordinateY()+" )";
    }

}
