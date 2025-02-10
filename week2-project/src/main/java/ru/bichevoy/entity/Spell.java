package ru.bichevoy.entity;

import java.util.Objects;

public class Spell {
    //название заклинания
    private final String name;
    //Урон, наносимый заклинанием
    private final int damage;
    //Стихия заклинания
    private final Element element;
    //Перезарядка в ходах
    private final int cooldown;
    //Текущее состояние перезарядки
    private int currentCooldown;

    public Spell(String name, int damage, Element element, int cooldown, int currentCooldown) {
        this.name = name;
        this.damage = damage;
        this.element = element;
        this.cooldown = cooldown;
        this.currentCooldown = currentCooldown;
    }

    public Element getElement() {
        return element;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getCurrentCooldown() {
        return currentCooldown;
    }

    public void setCurrentCooldown(int currentCooldown) {
        this.currentCooldown = currentCooldown;
    }

    public int getCooldown() {
        return cooldown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spell spell = (Spell) o;
        return Objects.equals(name, spell.name) && element == spell.element;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, element);
    }

    @Override
    public String toString() {
        return "Spell {" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", element=" + element +
                ", cooldown=" + cooldown +
                ", currentCooldown=" + currentCooldown +
                '}';
    }
}
