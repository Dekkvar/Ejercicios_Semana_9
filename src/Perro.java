public class Perro {
    private String pelo = "";
    private String color = "";
    private int chip;

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

    public String getPelo() {
        return pelo;
    }

    public String getColor() {
        return color;
    }

    public int getChip() {
        return chip;
    }
}
