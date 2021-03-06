
package GestiónBiblioteca;


public class Profesor extends Socio{
   
    //CONSTRUCTOR.
    public Profesor(String Nombre, String DNI) {
        super(Nombre, DNI);
        codigoSocio += "P";     //CIFRA DEL CODIGO QUE INDICA SI SE ES PROFESOR O ALUMNO.
    }  
    @Override
        public int maxDiasLibros(int dias){
            return 10;
        }     
    @Override
        public int maxDiasRevistas(int dias){
            return 6;
        }
    @Override
        public int maxDiasProyectos(int dias){
            return 12;
        }
}
/*
o Libros – 10 días
o Revistas – 6 días
o Proyectos o Tesis – 12 días*/