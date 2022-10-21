// lab2, variant: 94663
import ru.ifmo.se.pokemon.*;
import Pokemons.*;
import Moves.*;
public class Main {
    public static void main(String[] yolo) {
        Battle b = new Battle();
        Lugia p1 = new Lugia("(Лужа)", 2);
        Snorunt p2 = new Snorunt("(Снорант)", 2);
        Froslass p3 = new Froslass("(Фросласс)", 2);
        Oddish p4 = new Oddish("(Оддиш)", 2);
        Gloom p5 = new Gloom("(Глум)", 2);
        Bellossom p6 = new Bellossom("(Белоссом)", 2);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}