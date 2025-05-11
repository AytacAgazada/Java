package lesson21;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER ;

    public static void main(String[] args) {
        for (Month month : Month.values()) {
            if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
                System.out.println(month + " is a summer month.");
            }
        }
    }
}


