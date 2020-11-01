package ru.downwine._12_TwelfthLab;

public enum Planets {
        Mercury(2440 * (Math.pow(10, 3)), 3.33 * (Math.pow(10,23))),
        Venus(6050 * (Math.pow(10, 3)), 4.88 * (Math.pow(10,24))),
        Earth(6370 * (Math.pow(10, 3)), 5.976 * (Math.pow(10,24))),
        Mars(3390 * (Math.pow(10, 3)), 6.43 * (Math.pow(10,23))),
        Jupiter(71490 * (Math.pow(10, 3)), 1.9 * (Math.pow(10,27))),
        Saturn(60270 * (Math.pow(10, 3)), 5.69 * (Math.pow(10,26))),
        Uranus(25560 * (Math.pow(10, 3)), 8.69 * (Math.pow(10,25))),
        Neptune(24760 * (Math.pow(10, 3)), 1.04 * (Math.pow(10,26)));
        public double radius; //м
        public double mass; //кг

        Planets(double radius, double mass) {
            this.radius = radius;
            this.mass = mass;
        }
}
