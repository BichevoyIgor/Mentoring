import ru.bichevoy.entity.BattleArena;
import ru.bichevoy.entity.Element;
import ru.bichevoy.entity.Pokemon;
import ru.bichevoy.entity.Spell;

public class Main {
    public static void main(String[] args) {
        Spell[] spells = {
                new Spell("Сжечь", 80, Element.FIRE, 20, 100),
                new Spell("Утопить",75, Element.WATER, 35, 100),
                new Spell("Ударить током", 93, Element.ELECTROSHOCK, 20, 100)
        };
        Pokemon pokemon1 = new Pokemon("Пикачу \uD83D\uDC7E", spells);
        Pokemon pokemon2 = new Pokemon("Покемон \uD83D\uDC2D", spells);
        BattleArena battleArena = new BattleArena(pokemon1, pokemon2);
        battleArena.startBattle();
    }
}
