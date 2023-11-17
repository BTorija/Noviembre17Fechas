package modelo;

import java.time.*;

public class Fechas {
    public static void main(String[] args) {


        ////Crear un objeto fecha para el inicio del curso con mes numerico y con la enumeración
        LocalDate inicioCurso = LocalDate.of(2023, 11, 17);
        LocalDate inicioCurso1 = LocalDate.of(2023, Month.NOVEMBER, 17);
        ////Crear un objeto fecha para el final del curso
        LocalDate finCurso = LocalDate.of(2023, 3, 22);
        LocalDate finCurso2 = LocalDate.of(2023, Month.MARCH, 22);
        ////Sumar a la fecha de inicio del curso 5 semanas
        LocalDate inicioCursoMas5Semanas = inicioCurso.plusWeeks(5);
        ////Restar a la fecha de final del curso 80 dias
        LocalDate iniciocursoMenos80Dias = inicioCurso.minusDays(80);
        System.out.println("Inicio curso menos 80 dias " + iniciocursoMenos80Dias);
        ////Crear una fecha del día 100 de este año
        LocalDate dia100Delanio = LocalDate.ofYearDay(2023, 100);
        System.out.println("Dia 100 de este año " + dia100Delanio);
        ////Crear la hora del momento en que estas haciendo este ejercicio llamada ahora
        LocalTime horaEjercicio = LocalTime.now();
        System.out.println("La hora del ejercicio es: " + horaEjercicio);
        ////Crear la hora del inicio del curso
        LocalTime horaInicioCurso = LocalTime.of(15, 00);
        System.out.println("La hora del curso es: " + horaInicioCurso);
        ////Sumar 5 horas a la hora de inicio de curso
        LocalTime inicioCursoMas5Horas = horaInicioCurso.plusHours(5);
        ////En 8 semanas será la fecha
        LocalDate fecha8Semanas = LocalDate.now().plusWeeks(8);
        System.out.println("Dentro de 8 semanas será: " + fecha8Semanas);
        ////Hace 8 semanas era la fecha
        LocalDate fechaMenos8Semanas = LocalDate.now().minusWeeks(8);
        System.out.println("Hace 8 semanas era: " + fechaMenos8Semanas);
        ////Sumar a la fecha de inicio de curso 3 días y restarle 2 hrs
        LocalDateTime inicioCursoConAjuste = LocalDateTime.of(inicioCurso, horaInicioCurso)
                .plusDays(3)
                .minusHours(2);
        System.out.println("Tres dias antes del inicio de curso era: " + inicioCurso.minusDays(3) + " y dos horas antes eran las: " + horaInicioCurso.minusHours(2));
        ////Imprimir por la consola si la hora ahora es antes de la hora de salida
        LocalTime horaSalida = LocalTime.of(20, 0);
        if (LocalTime.now().isBefore(horaSalida)) {
            System.out.println("ES antes");
        } else {
            System.out.println("Es despues");
        }

        ////Imprimir por la consola si la hora de ahora es despues de la hora de entrada
        if (LocalTime.now().isAfter(horaInicioCurso)) {
            System.out.println("Es despues de la hora de entrada");
        } else {
            System.out.println("Es antes de la hora");
        }
        ////Calcular los años trabajados en una empresa del un empleado que inició a trabajar el 6 de Julio de 2012
        LocalDate inicioTrabajo = LocalDate.of(2012, 7, 6);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(inicioTrabajo, fechaActual);
        int aniosTrabajados = periodo.getYears();
        System.out.println("LLeva " + aniosTrabajados + " Años trabajados");
        ////Calcular la edad de una persona que nació el 7 de Agosto de 2007
        LocalDate fechaNacimiento= LocalDate.of(2007,8,7);
        Period periodoNacimiento= Period.between(fechaNacimiento,fechaActual);
        System.out.println("Tiene "+ periodoNacimiento.getYears()+ " años");

        //// Se tiene una fecha de fabricación y una fecha de expiración calcular el periodo en el que se puede consumir ese producto
        LocalDate fabricacion= LocalDate.of(2007,8,7);
        LocalDate expiracion= LocalDate.of(2023,10,27);
        Period periodoConsumo= Period.between(fabricacion,expiracion);
        System.out.println(periodoConsumo);
        ////Declarar la fecha de Navidad y declarar la fecha de Noche Vieja
        LocalDate fechaNavidad= LocalDate.of(2023,12,25);
        LocalDate fechaNocheVieja= LocalDate.of(2023,12,31);

        ////		//Compararlas con los métodos isBefore y isAfter

        ////Con esta matriz de formato {"dd/MM/yyyy",
        //        					"d '('E')' MMM YYYY",
        //        					"w'º semana de ' YYYY",
        //        					"EEEE, dd MMM, YYYY"};
        //Aplicarla a la fecha hora actual
    }

}
