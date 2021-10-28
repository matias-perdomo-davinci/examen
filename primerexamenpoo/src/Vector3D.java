public class Vector3D {
    // ATRIBUTOS
    Punto3D puntoInicial;
    Punto3D puntoFinal;

    // CONSTRUCTORES
    public Vector3D(Punto3D puntoInicial, Punto3D puntoFinal){
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }

    public Vector3D(Punto3D puntoFinal){
        this.puntoFinal = puntoFinal;
    }

    // METODOS
    public void magnitudVector (){
        return Math.sqrt(Math.pow(this.puntoInicial-this.puntoInicial,2)+Math.pow(this.puntoFinal-this.puntoFinal,2);
    }

    public void mostrarComponentes (){
        System.out.println(this.puntoFinal.x-this.puntoInicial.x);
        System.out.println(this.puntoFinal.y-this.puntoInicial.y);
        System.out.println(this.puntoFinal.z-this.puntoInicial.z);
    }


    @Override
    public String toString() {
        return "El vector comienza en el punto " + this.puntoInicial + " y termina en el punto " + this.puntoFinal;
    }

}
