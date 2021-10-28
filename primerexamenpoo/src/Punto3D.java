public class Punto3D {
    // ATRIBUTOS
    double x;
    double y;
    double z;

    // CONSTRUCTORES
    public Punto3D(double x,double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punto3D(double w){
        this.w = w;
    }


    public Punto3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    // METODOS

    public double distanciaAlOrigen(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2);
    }

    public double distanciaOtroPunto(double x, double y, double z){
        return Math.sqrt(Math.pow(this.x-this.x,2)+Math.pow(this.y-this.y,2)+Math.pow(this.z-this.z,2);
    }

    public double distanciaOtroPunto(Punto3D otroPunto){
        return Math.sqrt(Math.pow(this.x-this.x,2)+Math.pow(this.y-this.y,2)+Math.pow(this.z-this.z,2);
    }

    @Override
    public String toString() {
        return "(" + this.x + this.y + ")";
    }
}
