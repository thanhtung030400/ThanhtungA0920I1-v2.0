package b6.ke_thua.bai_tap.point2D_va_point3D;

public class Point_2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point_2D(float x, float y){
        this.x= x;
        this.y= y;
    }

    public Point_2D(){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x= x;
        this.y= y;
    }

    public float[] getXY() {
        float[] a ={this.x,this.y};
        return a;
    }

    @Override
    public String toString() {
        return "x la:" + x +
                "y la:" +y + super.toString();
    }
}

