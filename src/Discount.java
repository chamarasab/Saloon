public class Discount {
    private static double sd_premium = 0.2;
    private static double sd_gold = 0.15;
    private static double sd_silver = 0.1;

    private static double pd_all = 0.1;

    public static double getSDRate(String membership) {
        if (membership.equals("Premium") || membership.equals("premium")) {
            return sd_premium;
        } else if (membership.equals("Gold") || membership.equals("gold")) {
            return sd_gold;
        } else if (membership.equals("Silver") || membership.equals("silver")) {
            return sd_silver;
        } else {
            return 0.0;
        }
    }

    public static double getPDRate(String membership) {
        return pd_all;
    }
}
