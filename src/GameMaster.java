public class GameMaster {
    public static void main(String[] args) {
        Hero h = new Hero("アベル",100,"銅の剣");
        Slime s = new Slime("スライムA",30);
        System.out.println("冒険が始まる…！");
        h.showStatus();
        s.showStatus();
        System.out.println("戦闘開始！");
        h.attack(s);
        s.showStatus();
        s.attack(h);
        h.showStatus();
        h.heal();
        h.showStatus();
        h.attack(s);
        h.attack(s);
        h.attack(s);
        System.out.println("--- 戦闘終了 ---\n最終ステータス:");
        h.showStatus();
        s.showStatus();
        System.out.println("アベルは生きている: " + h.isAlive());
        System.out.println("スライムAは生きている: " + s.isAlive());
    }
}
