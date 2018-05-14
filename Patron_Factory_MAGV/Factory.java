package ico.Aragon.factory;

public class Factory {

    public static void main(String[] args) {
        Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
        Mobile mobile2 = MobileFactory.createMobile(Mobile.IPHONE);
        Mobile mobile3 = MobileFactory.createMobile(Mobile.ZTE);
        Mobile mobile4 = MobileFactory.createMobile(Mobile.NOKIA);
        Mobile mobile5 = MobileFactory.createMobile(Mobile.MOTOROLA);
        Mobile mobile6 = MobileFactory.createMobile(Mobile.SONY);

        System.out.println("Los Datos de su equipo SAMSUNG son: " + mobile.toString());
        System.out.println("Los Datos de su equipo IPHONE son: " + mobile2.toString());
        System.out.println("Los Datos de su equipo ZTE son: " + mobile3.toString());
        System.out.println("Los Datos de su equipo NOKIA son: " + mobile4.toString());
        System.out.println("Los Datos de su equipo MOTOROLA son: " + mobile5.toString());
        System.out.println("Los Datos de su equipo SONY son: " + mobile6.toString());
    }

}
