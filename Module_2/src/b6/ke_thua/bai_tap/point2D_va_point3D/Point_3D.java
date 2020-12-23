package b6.ke_thua.bai_tap.point2D_va_point3D;

public class Point_3D extends Point_2D {
    private float z = 0.0f;

    public Point_3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public Point_3D(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] b = {super.getX(),super.getY(),this.z};
        return b;
    }

    @Override
    public String toString() {
        return "z la:" +super.getX()+ super.toString();
    }
}
