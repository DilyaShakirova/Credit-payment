public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double percent = 9.99;
        int months = 12;
        System.out.println("Кредит на сумму " + creditAmount + " по процентной ставке " + percent + "% на срок " + months + " месяцев(а).");
        System.out.println("Ежемесячный платёж: " + (int) service.calculate(creditAmount, percent, months));
        System.out.println();
        months = 24;
        System.out.println("Кредит на сумму " + creditAmount + " по процентной ставке " + percent + "% на срок " + months + " месяцев(а).");
        System.out.println("Ежемесячный платёж: " + (int) service.calculate(creditAmount, percent, months));
        System.out.println();
        months = 36;
        System.out.println("Кредит на сумму " + creditAmount + " по процентной ставке " + percent + "% на срок " + months + " месяцев(а).");
        System.out.println("Ежемесячный платёж: " + (int) service.calculate(creditAmount, percent, months));
    }
}