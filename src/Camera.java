public class Camera {

    private Integer coordinateX ;
    private Integer coordinateY;

    public Camera(Integer x, Integer y){
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public int getCoordinateX(){
        return coordinateX;
    }

    public int getCoordinateY(){
        return coordinateY;
    }

    @Override
    public String toString(){
        return "La camera est localisée en ( "+coordinateX+","+coordinateY+" )";
    }


}

/*

Integer coordinateX
Integer coordinateY

Camera(integer, integer)
getCoordinateX();
getCoordinateY();

 */