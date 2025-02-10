package ru.bichevoy.entity;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Pokemon {
    private final String name;
    private final int level;
    //Стихия покемона
    private final Element element;
    //Здоровье покемона
    private int health;
    //Базовый урон от обычной атаки
    private int baseDamage;
    //Список доступных заклинаний
    private final Spell[] spells;

    public Pokemon(String name, Spell[] spells) {
        Random random = new Random();
        this.name = name;
        this.level = random.nextInt(10) + 1;
        this.element = initElement();
        this.health = random.nextInt(1000) + 1;
        this.baseDamage = random.nextInt(100) + 1;
        this.spells = initSpells(spells);
    }

    public void attack(Pokemon opponent) {
        opponent.health -= baseDamage;
        if (opponent.getHealth() < 0){
            opponent.health = 0;
        }
    }

    // если стихия заклинания == стихии покемона, то урона нет
    public void useSpell(Pokemon opponent, Spell spell) {
        if (opponent.element != spell.getElement()) {
            opponent.health -= spell.getDamage();
            if (opponent.getHealth() < 0){
                opponent.health = 0;
            }
        }
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public Spell[] getSpells() {
        return spells;
    }

    private Element initElement() {
        Element[] values = Element.values();
        int i = ThreadLocalRandom.current().nextInt(0, values.length);
        return values[i];
    }

    private Spell[] initSpells(Spell[] spells) {
        Random random = new Random();
        return Arrays.stream(spells).filter(spell -> random.nextBoolean()).toArray(Spell[]::new);
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Заклинания: '\n'");
        for (Spell spell : spells) {
            sb.append(spell);
        }
        return "Имя: " + name +
                ",\nУровень: " + level +
                ",\nСтихия: " + element +
                ", \nЗдоровье: " + health +
                ", \nСила удара: " + baseDamage +
                ", \n" + Arrays.toString(spells);
    }
}
