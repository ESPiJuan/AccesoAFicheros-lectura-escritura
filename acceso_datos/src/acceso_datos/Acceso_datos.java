/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template cursoFile, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_datos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanMi
 */
public class Acceso_datos {

    private static File cursoFile = new File("cursos.dat");
    private static File alumnoFile = new File("alumnos.dat");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        añadirDatos();
        leerCurso();
        leerAlumnos();
    }

    private static void añadirDatos() {

        try {
            FileOutputStream fos = new FileOutputStream(cursoFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileOutputStream fos2 = new FileOutputStream(alumnoFile);
            ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
            oos.writeObject(new Curso("3678", "Iniciacion a la red Internet", 60, LocalDate.parse("2018-10-01"), LocalDate.parse("2018-10-15")));
            oos.writeObject(new Curso("3609", "Informatica de usuario", 200, LocalDate.parse("2018-10-20"), LocalDate.parse("2018-12-04")));
            oos.writeObject(new Curso("2758", "Informacion de usuario", 200, LocalDate.parse("2018-12-09"), LocalDate.parse("2019-02-04")));
            oos.writeObject(new Curso("3689", "Gobernanta/e de hotel", 615, LocalDate.parse("2018-10-18"), LocalDate.parse("2019-03-18")));
            oos.writeObject(new Curso("3668", "Empleado/a de oficina", 790, LocalDate.parse("2018-10-18"), LocalDate.parse("2019-05-14")));
            oos2.writeObject(new Alumno("54133956y", "Juan Miguel", "Pérez", "Ramírez", "Calle Tenerife 20", "35214", "Las Palmas", "657753248", LocalDate.parse("1999-11-20")));
            oos.close();
            oos2.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Acceso_datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Acceso_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void leerCurso() {
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(cursoFile);
            ois = new ObjectInputStream(fis);
            while (true) {

                Curso curso = (Curso) ois.readObject();

                System.out.println("Codigo : " + curso.getCodigo());
                System.out.println("Denominacion : " + curso.getDenominacion());
                System.out.println("Fecha Inicio : " + curso.getFechaInicion());
                System.out.println("Fecha Fin : " + curso.getFechaFin());
                System.out.println("Num de Horas : " + curso.getNumHoras());
                System.out.println("***************************************");

            }

        } catch (EOFException ex) {

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Acceso_datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Acceso_datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acceso_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void leerAlumnos() {
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(alumnoFile);
            ois = new ObjectInputStream(fis);
            while (true) {

                Alumno alumno = (Alumno) ois.readObject();

                System.out.println("Dni : " + alumno.getDni());
                System.out.println("Nombre : " + alumno.getNombre());
                System.out.println("Primer Apellido : " + alumno.getPrimerApellido());
                System.out.println("Segundo Apellido : " + alumno.getSegundoApellido());
                System.out.println("Direccion: " + alumno.getDireccion());
                System.out.println("Provincia : " + alumno.getProvincia());
                System.out.println("Telefono : " + alumno.getTelefono());
                System.out.println("Fecha de Nacimiento : " + alumno.getFechaNacimiento()  );
                System.out.println("***************************************");

            }

        } catch (EOFException ex) {

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Acceso_datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Acceso_datos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acceso_datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
