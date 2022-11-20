public class Perro {
    private String pelo = "";
    private String color = "";
    private int chip;
    private int peso;
    private int altura;

    public String ladrar() {
        String ladrido = "";
        if (this.peso < 10 && this.altura < 20) {
            ladrido = "ladrido muy agudo";
        } else if (this.peso < 10) {
            ladrido = "ladrido agudo";
        } else if (this.altura <20) {
            ladrido = "ladrido grave";
        } else {
            ladrido = "ladrido muy grave";
        }

        return ladrido;
    }

    /*Ahora el IDE da un error ya que la clase main no puede
    acceder a los datos de la clase perro para modificarlos*/

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getPelo() {
        return pelo;
    }

    public String getColor() {
        return color;
    }

    public int getChip() {
        return chip;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }
}
