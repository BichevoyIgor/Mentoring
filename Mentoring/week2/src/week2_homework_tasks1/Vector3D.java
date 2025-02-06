package week2_homework_tasks1;

public class Vector3D {

    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x,
                this.y + other.y,
                this.z + other.z);
    }

    public Vector3D subtract(Vector3D other) {
        return new Vector3D(this.x - other.x,
                this.y - other.y,
                this.z - other.z);
    }

    public double dotProduct(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public static Vector3D add(Vector3D a, Vector3D b){
        return new Vector3D(a.x + b.x,
                a.y + b.y,
                a.z + b.z);
    }

    public static Vector3D subtract(Vector3D a, Vector3D b){
        return new Vector3D(a.x - b.x,
                a.y - b.y,
                a.z - b.z);
    }

    public static Vector3D dotProduct(Vector3D a, Vector3D b){
        return new Vector3D(a.x * b.x,
                a.y * b.y,
                a.z * b.z);
    }

    @Override
    public String toString() {
        return String.format("<%f, %f, %f>", x, y, z);
    }
}
