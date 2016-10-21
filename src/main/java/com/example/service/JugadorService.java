package com.example.service;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static com.example.domain.Posicion.*;

/**
 * Created by Sergi M on 14/10/2016.
 */

@Service
public class JugadorService {



    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugadores(){



        //equipos


        Equipo equipo1 = new Equipo("Clanzoncillos", "Dojo", LocalDate.of(1857, 10, 2));
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo("ReZeroTeam", "Barcelona", LocalDate.of(1870, 11, 6));
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo("Kao", "Earth", LocalDate.of(1897, 2, 8));
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo("Fnatic", "Londres", LocalDate.of(1878, 4, 3));
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo("Reads", "Korea", LocalDate.of(1872, 8, 2));
        equipoRepository.save(equipo5);


        //jugadores


        Jugador jugador1 = new Jugador("Pablo", LocalDate.of(1996, 1, 14), 220, 300, 250, Alero);

        jugador1.setEquipo(equipo1);
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador("Sergi", LocalDate.of(1996, 10, 18), 200, 350, 168, Pivot);

        jugador2.setEquipo(equipo1);
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador("Cortesina", LocalDate.of(1756, 1, 1), 400, 657, 1, Base);

        jugador3.setEquipo(equipo1);
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador("Juanjo", LocalDate.of(2001, 3, 13), 20, 50, 60, Alero);

        jugador4.setEquipo(equipo1);
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador("Carlitus", LocalDate.of(1950, 12, 5), 12, 14, 17, Base);

        jugador5.setEquipo(equipo1);
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador("Pau", LocalDate.of(1970, 11, 5), 22, 24, 27, Pivot);

        jugador6.setEquipo(equipo2);
        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador("Tenno", LocalDate.of(1960, 10, 1), 32, 34, 37, Alero);

        jugador7.setEquipo(equipo2);
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador("Luffy", LocalDate.of(1980, 9, 2), 42, 44, 47, Base);

        jugador8.setEquipo(equipo2);
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador("PetelgeuseRomaneeContidessssss", LocalDate.of(1990, 10, 3), 52, 54, 57, Escolta);

        jugador9.setEquipo(equipo2);
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador("Subaru", LocalDate.of(1959, 12, 4), 62, 64, 67, Base);

        jugador10.setEquipo(equipo2);
        jugadorRepository.save(jugador10);

        Jugador jugador11 = new Jugador("Emilia", LocalDate.of(1958, 8, 5), 72, 74, 77, Escolta);

        jugador11.setEquipo(equipo3);
        jugadorRepository.save(jugador11);

        Jugador jugador12 = new Jugador("Rem", LocalDate.of(1956, 7, 6), 82, 84, 87, Base);

        jugador12.setEquipo(equipo3);
        jugadorRepository.save(jugador12);

        Jugador jugador13 = new Jugador("Ram", LocalDate.of(1953, 9, 7), 92, 94, 97, Escolta);

        jugador13.setEquipo(equipo3);
        jugadorRepository.save(jugador13);

        Jugador jugador14 = new Jugador("Reinhard", LocalDate.of(1967, 2, 8), 25, 45, 75, Base);

        jugador14.setEquipo(equipo3);
        jugadorRepository.save(jugador14);

        Jugador jugador15 = new Jugador("Wilhelm", LocalDate.of(1989, 4, 9), 29, 49, 79, AlaPivot);

        jugador15.setEquipo(equipo3);
        jugadorRepository.save(jugador15);

        Jugador jugador16 = new Jugador("Thearesia", LocalDate.of(1999, 10, 10), 25, 41, 71, Base);

        jugador16.setEquipo(equipo4);
        jugadorRepository.save(jugador16);

        Jugador jugador17 = new Jugador("Elsa", LocalDate.of(1998, 12, 5), 82, 54, 47, AlaPivot);

        jugador17.setEquipo(equipo4);
        jugadorRepository.save(jugador17);

        Jugador jugador18 = new Jugador("Crusch", LocalDate.of(1991, 11, 4), 32, 14, 87, Base);

        jugador18.setEquipo(equipo4);
        jugadorRepository.save(jugador18);

        Jugador jugador19 = new Jugador("Priscilla", LocalDate.of(1990, 8, 2), 20, 47, 76, AlaPivot);

        jugador19.setEquipo(equipo4);
        jugadorRepository.save(jugador19);

        Jugador jugador20 = new Jugador("Anastasia", LocalDate.of(1978, 4, 1), 26, 43, 77, Base);

        jugador20.setEquipo(equipo4);
        jugadorRepository.save(jugador20);

        Jugador jugador21 = new Jugador("Roswaal", LocalDate.of(2001, 3, 3), 25, 42, 71, AlaPivot);

        jugador21.setEquipo(equipo5);
        jugadorRepository.save(jugador21);

        Jugador jugador22 = new Jugador("Julius", LocalDate.of(1800, 8, 7), 22, 42, 72, Base);

        jugador22.setEquipo(equipo5);
        jugadorRepository.save(jugador22);

        Jugador jugador23 = new Jugador("Felt", LocalDate.of(2000, 10, 4), 29, 47, 77, AlaPivot);

        jugador23.setEquipo(equipo5);
        jugadorRepository.save(jugador23);

        Jugador jugador24 = new Jugador("Puck", LocalDate.of(1100, 12, 2), 23, 42, 71, Base);

        jugador24.setEquipo(equipo5);
        jugadorRepository.save(jugador24);

        Jugador jugador25 = new Jugador("Beatrice", LocalDate.of(500, 11, 8), 92, 49, 57, AlaPivot);

        jugador25.setEquipo(equipo5);
        jugadorRepository.save(jugador25);


        System.out.println("Buscar jugadores por nombre: ");
        System.out.println(jugadorRepository.findByNombre("Pablo"));

        System.out.println("Buscar por numero de canastas: ");
        System.out.println(jugadorRepository.findBycanastasGreaterThanEqual(250));
        System.out.println("Buscar por numero de asistencias entre el rango: ");
        System.out.println(jugadorRepository.findByasistenciasBetween(1, 25));
        System.out.println("Buscar jugador por posición: ");
        System.out.println(jugadorRepository.findByposicion(Base));
        System.out.println("Buscar jugador con fecha de nacimiento anterior: ");
        System.out.println(jugadorRepository.findByfechanacimientoBefore((LocalDate.of(1990,10,10))));
        System.out.println("Buscar jugadores por posicion y calcular medias: ");


        jugadorRepository.AvgJugadoresPosicion().forEach(posicion ->
                System.out.println("posicion =" + posicion[0] + "media canastas" + posicion[1]
                        + "media asistencias" + posicion[2] + "media rebotes"));

        System.out.println("Buscar jugadores por posicion y calcular medias, min y max: ");
        jugadorRepository.AvgJugadoresMaxMin().forEach(posicion ->
                System.out.println("posicion =" + posicion[0] + "media canastas" + posicion[1]
                        + "media asistencias" + posicion[2] + "media rebotes" + posicion[3]
                        + "max canastas" + posicion[4] + "max asistencias" + posicion[5]
                        + "max rebotes" + posicion[6] + "min canastas" + posicion[7]
                        + "min asistencias" + posicion[8] + "min rebotes" + posicion[9]));

    }


}

/*


package com.example.service;

import com.example.domain.Car;
import com.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;


    public void testCars(){

        Car car1= new Car(1L,"Jaguar","TheRoadIsYours",2016,"1234ENG", 61405.00);
        carRepository.save(car1);


        Car car2= new Car (2L,"BMW","LoveAtFirstDrive",2014,"9065AME", 75399.00);
        carRepository.save(car2);

        Car car3= new Car (3L,"Lexus","LC500",2016,"5638DDD",85500.00);
        carRepository.save(car3);


        Car car4= new Car (4L,"Aston Martin","DB10",2015,"3564GER", 3156825.00);
        carRepository.save(car4);


        Car car5= new Car (5L,"RomeoAlfaJulietta","DramaMasterpiece",2013,"4749JAV",66200.00);
        carRepository.save(car5);


        Car car6= new Car (6L,"BMW","LoveAtFirstDrive",2014,"9065AND", 75399.00);
        carRepository.save(car6);

        Car car7= new Car(7L,"Jaguar","FPACE",2015,"1235ENG",45000.00 );
        carRepository.save(car7);


        Car car8= new Car (8L,"BMW","CABRIO",2014,"9065AME", 47550.00);
        carRepository.save(car8);


        Car car9= new Car(9L,"Jaguar","FPACE",2015,"5321ENG",45000.00 );
        carRepository.save(car9);


        System.out.println("Cars made since 2016 ");
        System.out.println(carRepository.findByYearOfFabGreaterThanEqual(2016));

        System.out.println("Cars made before 2014 ");
        System.out.println(carRepository.findByYearOfFabLessThan(2016));


        System.out.println("Cars made between 2014 and 2016");
        System.out.println(carRepository.findByYearOfFabBetween(2014,2016));

        System.out.println("Cars that cost more than 25000 Euros");
        System.out.println(carRepository.findByPriceGreaterThanEqual(25000.00));

        System.out.println("Cars that cost between 50000 and 6000000 Euros ");
        System.out.println(carRepository.findByPriceBetween(50000.00,100000.00));

        System.out.println("Car with plate number 3564GER ");
        System.out.println(carRepository.findByPlateNumber("3564GER"));

        System.out.println("Cars of brand Jaguar and model FPACE");
        System.out.println(carRepository.findByBrandAndModel("Jaguar","FPACE"));

        System.out.println("Cars of brand BMW and price less than 80000 Euros");
        System.out.println(carRepository.findByBrandAndPrice("BMW",80000.00));

        System.out.println("Cars of brand Aston Martin, model of James Bond of the movie Spectrum,DB10, that costs more than 3100000 Euros ");
        System.out.println(carRepository.findByBrandAndModelAndPriceGreaterThanEqual("Aston Martin","DB10",3100000.00));

        /* código que calcula la media
        List<Car> carList = carRepository.findByBrand("BMW");

        int sum=0;
        int numCars=0;
        for(Car car : carList)
        {
            numCars++;
            sum=sum+car.getPrice();
        }

        int average= sum/numCars;


        System.out.println("List of Jaguar brand cars");
                System.out.println(carRepository.findByBrand("Jaguar"));

                System.out.println("The average price all of Lexus cars is: " +carRepository.findAveragePerBrand("Lexus"));


                //Querys con JPQL

                System.out.println("All cars which plate number contains 'ENG': " +carRepository.findCarByPlateNumberSubstring("ENG"));

                System.out.println("All cars wich plate number contains letter 'E' " +carRepository.findByPlateNumberContains("E"));

                System.out.println("Statistics");
                showStatistics(carRepository.AvgAndMaxAndMinPricesPerBrand());

                System.out.println("Statistics sorted by AvgPrice descendant");
                showStatistics(carRepository.AvgAndMaxAndMinPricesPerBrandOrderedByAVGPrice());


                System.out.println("Number of cars made each year: ");

                List<Object[]> carList = carRepository.CarsMadeByYear();

        for (Object[] car : carList)
        {
        Integer year = (Integer)car[0];
        System.out.println("Year: "+car[0]);
        System.out.println("Quantity: "+ car[1]);
        System.out.println("List of cars: "+carRepository.findByYearOfFab(year)+System.lineSeparator());
        }


        }

private void showStatistics(List<Object[]> statisticsList) {
        for ( Object[] statistic: statisticsList)
        {
        System.out.println("Brand: "+statistic[0]);
        System.out.println("AVG = "+statistic[1] +" euros");
        System.out.println("MIN = "+statistic[2]+" euros");
        System.out.println("MAX = "+statistic[3]+" euros"+System.lineSeparator());
        }

        // el objeto es cada una de las líneas de la tabla que muestra al hacer la query. statistic[] son las columnas
        }
        }

 */