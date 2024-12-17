package com.example.patronesDeDiseno.Estructurales.Proxy;

public class InternetProxy implements Internet {
    private Internet realInternet;

    public InternetProxy() {
        this.realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        // Aquí podemos agregar lógica adicional, como comprobar permisos o restricciones

        // Por ejemplo, permitimos el acceso solo a ciertos servidores
        if (serverHost.equals("www.example.com") || serverHost.equals("www.google.com")) {
            realInternet.connectTo(serverHost);
        } else {
            throw new Exception("Access to " + serverHost + " is not allowed");
        }
    }
}
