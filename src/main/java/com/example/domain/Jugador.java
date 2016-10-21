package com.example.domain;
import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Sergi Mateu on 14/10/2016.
 */

@Entity
public class Jugador {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private LocalDate fechanacimiento;
    private int canastas;
    private int asistencias;
    private int rebotes;
    private Posicion posicion;
    @ManyToOne
    private Equipo equipo;

public Jugador(){

}

    public Jugador(String pablo, LocalDate of, int canastas, int asistencias, int rebotes, String alero) {
    }

    public Jugador(String nombre, LocalDate fechanacimiento, int canastas, int asistencias, int rebotes, Posicion posicion) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.canastas = canastas;
        this.asistencias = asistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechanacimiento='" + fechanacimiento + '\'' +
                ", canastas=" + canastas +
                ", asistencias=" + asistencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }


}

/*

package com.example.domain;



@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String brand;
    private String model;
    private Integer yearOfFab;
    private String plateNumber;
    private double price;


    public Car(long id, String brand, String model, Integer yearOfFab, String plateNumber, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfFab = yearOfFab;
        this.plateNumber = plateNumber;
        this.price=price;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfFab() {
        return yearOfFab;
    }

    public void setYearOfFab(Integer yearOfFab) {
        this.yearOfFab = yearOfFab;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        plateNumber = plateNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfFab=" + yearOfFab +
                ", plateNumber='" + plateNumber + '\'' +
                ", price=" + price +
                '}'+System.lineSeparator();
    }

    public int compareTo(Car anotherCar){

        // System.out.println("Comparing the following two cars: ");
        // System.out.println(this);
        // System.out.println(anotherCar);
        return this.plateNumber.compareTo(anotherCar.plateNumber);
    }

}

/*class CarComparatorByYear implements Comparator<Car>
{
    @Override
    public int compare(Car car, Car anotherCar)
    {
        if(car.getYearOfFab() > anotherCar.getYearOfFab())
        {
            return 1;
        }
        else if (car.getYearOfFab() < anotherCar.getYearOfFab())
        {
            return -1;
        }
        else return 0;
    }

}*/

