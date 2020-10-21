
/**
 * Enumeration class Coin2
 *
 * @author Louis Scannell
 * @version 14/10/2020
 */
    public enum Coin2
    {
        P10 (10),
        P20 (20),
        P100 (100),
        P200 (200);

        private final int value;

        private Coin2(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return value;
        }
     }