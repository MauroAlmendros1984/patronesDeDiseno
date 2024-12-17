package com.example.patronesDeDiseno.Estructurales.Proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();

        try {
            // Intentamos acceder a sitios permitidos
            internet.connectTo("www.example.com");
            internet.connectTo("www.google.com");

            // Intentamos acceder a un sitio no permitido
            internet.connectTo("www.facebook.com");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

//Proxy es un patrón de diseño estructural que te permite proporcionar un sustituto o marcador
//de posición para otro objeto. Un proxy controla el acceso al objeto original, permitiéndote
//hacer algo antes o después de que la solicitud llegue al objeto original.

//En este ejemplo, creamos un proxy InternetProxy que controla el acceso al servicio real
//RealInternet. El proxy agrega la lógica adicional para permitir o denegar el acceso a ciertos
//servidores. Cuando intentamos conectarnos a un servidor, el proxy verifica si el servidor es
//permitido y, si es así, realiza la conexión utilizando el servicio real. De lo contrario,
//arroja una excepción. Esto nos permite controlar el acceso al servicio de manera flexible
//y agregar funcionalidades adicionales, como la verificación de permisos.
