package b6.ke_thua.bai_tap.point_va_moveablepoint;

public class Movable_point extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public Movable_point(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movable_point(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movable_point(){
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setxSpeedySpeed(){
        super.setXY(xSpeed,ySpeed);
    }
}
