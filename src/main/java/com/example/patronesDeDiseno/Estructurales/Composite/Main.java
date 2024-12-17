package com.example.patronesDeDiseno.Estructurales.Composite;

public class Main {
    public static void main(String[] args) {
        // Creamos algunos empleados individuales
        Employee emp1 = new IndividualEmployee("John Doe", "Manager");
        Employee emp2 = new IndividualEmployee("Alice Smith", "Engineer");
        Employee emp3 = new IndividualEmployee("Bob Johnson", "Salesperson");

        // Creamos un departamento de ingeniería y agregamos algunos empleados
        Department engineeringDepartment = new Department("Engineering");
        engineeringDepartment.addEmployee(emp1);
        engineeringDepartment.addEmployee(emp2);

        // Creamos un departamento de ventas y agregamos un empleado
        Department salesDepartment = new Department("Sales");
        salesDepartment.addEmployee(emp3);

        // Creamos un departamento general y agregamos los departamentos y empleados
        Department generalDepartment = new Department("General");
        generalDepartment.addEmployee(engineeringDepartment);
        generalDepartment.addEmployee(salesDepartment);
        generalDepartment.addEmployee(new IndividualEmployee("Carol Brown", "Intern"));

        // Mostramos los detalles de la estructura organizativa
        generalDepartment.showDetails();
    }
}

//Composite es un patrón de diseño estructural que te permite componer objetos en estructuras
//de árbol y trabajar con esas estructuras como si fueran objetos individuales.

//Primero, definimos una interfaz común para todos los componentes, que puede ser tanto un
//empleado individual como un departamento. Ahora, podemos utilizar estas clases para
//construir una estructura de organización.

//En este ejemplo, creamos varios empleados individuales y departamentos. Los departamentos pueden
//contener tanto empleados individuales como otros departamentos (recursión). Luego, mostramos los
//detalles de la estructura organizativa llamando al método showDetails() del departamento general,
//que a su vez invoca showDetails() en cada empleado o departamento que contiene. Esto nos permite
//ver la estructura completa de la organización, incluyendo todos los empleados y departamentos en
//todos los niveles.
