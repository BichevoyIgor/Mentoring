package ru.bichevoy.entity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Random;

public class BattleArena {
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    public BattleArena(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void startBattle() {
        System.out.println(pokemon1);
        System.out.println();
        System.out.println(pokemon2);
        System.out.println("\n---Битва началась---\n");

        while (pokemon2.getHealth() > 0 && pokemon1.getHealth() > 0) {
            fight(pokemon1, pokemon2);
            if (pokemon2.getHealth() == 0) {
                System.out.println("\nПобедитель: " + pokemon1.getName());
                break;
            }
            fight(pokemon2, pokemon1);
            if (pokemon1.getHealth() == 0) {
                System.out.println("\nПобедитель: " + pokemon2.getName());
                break;
            }
        }
        System.out.println("\n---Битва окончена---\n");
    }

    private void fight(Pokemon forward, Pokemon opponent) {
        Random random = new Random();
        Optional<Spell> bestSpell = getBestSpell(forward);
        // если random == true и найдено заклинание, то применяем заклинание, иначе просто бьем
        if (random.nextBoolean() && bestSpell.isPresent()) {
            System.out.printf("%s пытается применить спец заклинание %s\n", forward.getName(), bestSpell.get());
            // фиксируем текущее здоровье
            int healthBeforeSpell = opponent.getHealth();
            // применяем заклинание
            forward.useSpell(opponent, bestSpell.get());
            // если здоровье не пошатнулось, то прием не сработал т.к стихии совпали
            if (healthBeforeSpell == opponent.getHealth()) {
                System.out.println(opponent.getName() + " не почувствовал " + bestSpell.get().getName());
            } else {
                System.out.printf("%s получил удар заклинанием %s, осталось здоровья: %d\n", opponent.getName(), bestSpell.get().getName(), opponent.getHealth());
            }
            //у спецспособности отнимаем силу удара
            bestSpell.get().setCurrentCooldown(bestSpell.get().getCurrentCooldown() - bestSpell.get().getDamage());
        } else {
            System.out.println(forward.getName() + " наносит удар " + opponent.getName());
            int healthOpponentBeforeAttack = opponent.getHealth();
            forward.attack(opponent);
            System.out.printf("%s получил урон %d\n", opponent.getName(), (healthOpponentBeforeAttack - opponent.getHealth()));
            System.out.printf("У %s осталось здоровья: %d\n", opponent.getName(), opponent.getHealth());
        }
        //на каждом шаге восстанавливаем силу не использованных заклинаний на int cooldown
        for (Spell spell : forward.getSpells()) {
            if (bestSpell.isPresent() && !spell.equals(bestSpell.get())) {
                spell.setCurrentCooldown(spell.getCurrentCooldown() + spell.getCooldown());
            }
        }
    }

    // получаем лучшее заклинание из списка приемов нападающего
    private Optional<Spell> getBestSpell(Pokemon pokemon) {
        Spell[] spells = pokemon.getSpells();
        Optional<Spell> spellForAttack = Arrays.stream(spells).filter(spell -> spell.getCurrentCooldown() > pokemon.getBaseDamage())
                .max(Comparator.comparingInt(Spell::getDamage));
        return spellForAttack;
    }
}
