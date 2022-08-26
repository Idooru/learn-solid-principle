package dip;

public class BabyMain {
    public static void main(String[] args) {
        Baby 응애1 = new Baby();

        Toy lego = new Lego(); // 변화하기 어려운 추상 클레스 Toy에 의존함
        Toy robot = new Robot();

        응애1.setToy(lego);
        응애1.play();

        응애1.setToy(robot);
        응애1.play();
    }
}
