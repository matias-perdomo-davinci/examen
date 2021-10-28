public class Main {
    public static void main(String[] args){
        Punto3D primerPunto = new Punto3D("5", "1", "5");
        Punto3D segundoPunto = new Punto3D("5", "1", "5");
        Punto3D tercerPunto = new Punto3D("2", "2", "2");

        System.out.println(primerPunto);
        System.out.println(segundoPunto);
        System.out.println(tercerPunto);

        segundoPunto.distanciaAlOrigen();
        segundoPunto.distanciaOtroPunto(primerPunto);
        segundoPunto.distanciaOtroPunto(0,0,0);

        Vector3D primerVector = new Vector3D("primerPunto", "segundoPunto");
        Vector3D segundoVector = new Vector3D("tercerPunto");

        System.out.println(primerVector);
        System.out.println(segundoVector);
        System.out.println(primerVector.magnitudVector(););
        System.out.println(segundoVector.magnitudVector(););

        primerVector.mostrarComponentes();
        segundoVector.mostrarComponentes();
    }
}
