package classobject;

import java.util.Arrays;
import java.util.Objects;

public class Tasse {

    private String material;
    private int size;
    private boolean thermo;
    private String[] color;
    private String form;

    public Tasse() {

    }

    public Tasse(String material) {
        this.material = material;
    }

    public Tasse(String material, int size, boolean thermo, String[] color, String form) {
        this.material = material;
        this.size = size;
        this.thermo = thermo;
        this.color = color;
        this.form = form;
        System.out.println("Eine neue classobject.Tasse wurde erstellt!");
    }


    // more custom methods


    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isThermo() {
        return thermo;
    }

    public void setThermo(boolean thermo) {
        this.thermo = thermo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tasse tasse = (Tasse) o;
        return size == tasse.size && thermo == tasse.thermo && Objects.equals(material, tasse.material) && Objects.deepEquals(color, tasse.color) && Objects.equals(form, tasse.form);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, size, thermo, Arrays.hashCode(color), form);
    }

//    public String toString() {
//
//        return "classobject.Tasse{" +
//                "material='" + material + '\'' +
//                ", size=" + size +
//                ", thermo=" + thermo +
//                ", color=" + String.join(", ", color) +
//                ", form='" + form + '\'' +
//                '}';
//    }
}
