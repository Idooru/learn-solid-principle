package srp;

public class SuperMarket {
    private String owner; // 주입
    private String snack; // 과자
    private int snackCount; // 과자 갯수

    /* 위배
     * 클래스 하나는 하나의 목적만이 존재해야 한다.
     * 결제, 카드 충전에 대한 구체적인 클래스를 다시 정의 한다.
     * */

    public void fn_pay() {
    } //결제

    public void fn_money_charge() {
    } // 카드 충전
}
