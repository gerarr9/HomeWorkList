import javax.sound.midi.Soundbank;
import java.util.*;

public class Pupils {

  private  int a;
  private  int b;

    public Pupils(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pupils pupils = (Pupils) o;
        return a == pupils.a && b == pupils.b || a == pupils.b && b == pupils.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a)+Objects.hashCode(b);
    }

    @Override
    public String toString() {
        return a +" * "+b+" = "+(a*b);
    }
}
