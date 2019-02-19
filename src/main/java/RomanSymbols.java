public enum RomanSymbols implements DecimalFormattable {

    I {
        @Override
        public int toDecimal() {
            return 1;
        }
    },

    V {
        @Override
        public int toDecimal() {
            return 5;
        }
    },

    X {
        @Override
        public int toDecimal() {
            return 10;
        }
    },

    L {
        @Override
        public int toDecimal() {
            return 50;
        }
    },

    C {
        @Override
        public int toDecimal() {
            return 100;
        }
    },

    D {
        @Override
        public int toDecimal() {
            return 500;
        }
    },

    M {
        @Override
        public int toDecimal() {
            return 1000;
        }
    }
}
