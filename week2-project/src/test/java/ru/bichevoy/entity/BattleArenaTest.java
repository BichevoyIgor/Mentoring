//package ru.bichevoy.entity;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import java.lang.reflect.*;
//import java.util.Optional;
//
//public class BattleArenaTest {
//
//    private static Pokemon pokemon1;
//    private static Pokemon pokemon2;
//    private static BattleArena battleArena;
//
//    @BeforeAll
//    static void init(){
//        Spell[] spells = {
//                new Spell("Сжечь", 80, Element.FIRE, 20, 100),
//                new Spell("Утопить",75, Element.WATER, 35, 100),
//                new Spell("Ударить током", 93, Element.ELECTROSHOCK, 20, 100)
//        };
//
//        pokemon1 = new Pokemon("Pokemon1", spells);
//        pokemon2 = new Pokemon("Pokemon2", spells);
//        battleArena = new BattleArena(pokemon1, pokemon2);
//
//        Class pokeClass = pokemon1.getClass();
//        try {
//            Field pokeFieldSpell = pokeClass.getDeclaredField("spells");
//            pokeFieldSpell.setAccessible(true);
//            Field modifiersField = Field.class.getDeclaredField("accessFlags");
//            modifiersField.setAccessible(true);
//            modifiersField.setInt(pokeFieldSpell, pokeFieldSpell.getModifiers() & ~Modifier.FINAL);
//            pokeFieldSpell.set(pokemon1, spells);
//        } catch (NoSuchFieldException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Test
//    void getBestSpellTest(){
//        Class battleArenaClass = battleArena.getClass();
//        Method getBestSpell;
//        try {
//            getBestSpell = battleArenaClass.getDeclaredMethod("getBestSpell", Pokemon.class);
//            getBestSpell.setAccessible(true);
//            Optional<Spell> spell = (Optional<Spell>)getBestSpell.invoke(battleArena, pokemon1);
//            System.out.println(spell);
//        } catch (NoSuchMethodException e) {
//            throw new RuntimeException(e);
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
//
//}
