public class Dog {
    private String hair = "";
    private String color = "";
    private int chip;
    private int weight;
    private int height;

    /**
     * Selecciona el tipo de ladrido en función del peso y la altura del perro.
     * @return tipo de ladrido.
     */
    public String bark() {
        String barkType = "";
        if (this.weight < 10 && this.height < 20) {
            barkType = "ladrido muy agudo";
        } else if (this.weight < 10) {
            barkType = "ladrido agudo";
        } else if (this.height <20) {
            barkType = "ladrido grave";
        } else {
            barkType = "ladrido muy grave";
        }

        return barkType;
    }

    /*Ahora el IDE da un error ya que la clase main no puede
    acceder a los datos de la clase perro para modificarlos*/

    /**
     * Setter: Establece el tipo de pelo del perro.
     * @param hair pelo del perro.
     */
    public void setHair(String hair) {
        this.hair = hair;
    }

    /**
     * Setter: Establece el color del perro.
     * @param color color del perro.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Setter: Establece el número de chip del perro.
     * @param chip número del chip del perro.
     */
    public void setChip(int chip) {
        this.chip = chip;
    }

    /**
     * Setter: Establece el peso del perro.
     * @param weight peso del perro en kg.
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Setter: Establece la altura del perro.
     * @param height altura del perro en cm.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Getter.
     * @return hair: pelo del perro.
     */
    public String getHair() {
        return hair;
    }

    /**
     * Getter.
     * @return color: color del perro.
     */
    public String getColor() {
        return color;
    }

    /**
     * Getter.
     * @return chip: número del chip del perro.
     */
    public int getChip() {
        return chip;
    }

    /**
     * Getter.
     * @return weight: peso del perro.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Getter.
     * @return height: altura del perro.
     */
    public int getHeight() {
        return height;
    }
}
