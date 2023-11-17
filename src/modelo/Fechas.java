package modelo;

import java.time.LocalDate;
import java.time.Month;

public class Fechas {
    ////Crear un objeto fecha para el inicio del curso con mes numerico y con la enumeración
    LocalDate inicioCurso=LocalDate.of(2023,11,17);
    LocalDate inicioCurso1=LocalDate.of(2023, Month.NOVEMBER,17);
    ////Crear un objeto fecha para el final del curso
    LocalDate finCurso= LocalDate.of(2023,3,22);
    LocalDate finCurso2=LocalDate.of(2023,Month.MARCH,22);
    ////Sumar a la fecha de inicio del curso 5 semanas
    LocalDate inicioCursoMas5Semanas= inicioCurso.plusWeeks(5);
        ////Restar a la fecha de final del curso 80 dias
    LocalDate iniciocursoMenos80Dias= inicioCurso.minusDays(80);
    ////Crear una fecha del día 100 de este año
    LocalDate dia100Delanio= LocalDate.ofYearDay(2023,100);
    ////Crear la hora del momento en que estas haciendo este ejercicio llamada ahora
    ////Crear la hora del inicio del curso
    ////Sumar 5 horas a la hora de inicio de curso
    ////En 8 semanas será la fecha
    ////Hace 8 semanas era la fecha
    ////Sumar a la fecha de inicio de curso 3 días y restarle 2 hrs
    ////Imprimir por la consola si la fecha ahora es antes de la hora de salida
    ////Imprimir por la consola si la fecha ahora es despues de la hora de entrada
    ////Calcular los años trabajados en una empresa del un empleado que inició a trabajar el 6 de Julio de 2012
    ////Calcular la edad de una persona que nació el 7 de Agosto de 2007
    //// Se tiene una fecha de fabricación y una fecha de expiración calcular el periodo en el que se puede consumir ese producto
    ////Declarar la fecha de Navidad y declarar la fecha de Noche Vieja
    ////		//Compararlas con los métodos isBefore y isAfter
    ////Con esta matriz de formato {"dd/MM/yyyy",
    //        					"d '('E')' MMM YYYY",
    //        					"w'º semana de ' YYYY",
    //        					"EEEE, dd MMM, YYYY"};
    //Aplicarla a la fecha hora actual

}
