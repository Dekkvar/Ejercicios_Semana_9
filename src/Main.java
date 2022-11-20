public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.setPelo("corto");
        perro1.setColor("negro");
        perro1.setChip(1);

        Perro [] manada = new Perro[3];
        manada[0] = new Perro();
        manada[0].setAltura(5);
        manada[0].setPeso(5);
        manada[1] = new Perro();
        manada[1].setAltura(5);
        manada[1].setPeso(25);
        manada[2] = new Perro();
        manada[2].setAltura(25);
        manada[2].setPeso(30);

        for (Perro d:manada) {
            System.out.println(d.ladrar());
        }
    }
}
