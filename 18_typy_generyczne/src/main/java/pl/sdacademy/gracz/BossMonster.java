package pl.sdacademy.gracz;

public class BossMonster implements Monster {
        @Override
        public void takeDamage(int damage) {
                System.out.println(String.format("Boss ignores %d damage", damage));
        }
}
