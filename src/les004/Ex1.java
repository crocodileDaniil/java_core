package les004;

public class Ex1 {
    public static void main(String[] args) {
        double population = 10 * Math.pow(10,6);
        for (int i = 1; i <= 10; i++) {
            population = population + (int) (population/1000 * 14) - (int) (population/1000*8);
            System.out.printf("Ex1 popilation is year %d: %.0f \n",i,population);
        }

        population = 10 * Math.pow(10,6);
        int coefficientUp = 14;
        int coefficientDown = 8;
        for (int i = 1; i <= 10; i++) {
            if (coefficientUp < 7) coefficientUp = 7;
            if (coefficientDown < 6) coefficientDown = 6;

            double upPopulation =  (population/1000 * coefficientUp);
            double downPopulation = (population/1000 * coefficientDown);

            population = population + upPopulation - downPopulation;

            coefficientUp--;
            coefficientDown--;

            System.out.printf("Ex2 popilation is year %d: %.0f \n",i,population);
        }

        population = (double)10000000;
        int born = 14;
        int death = 8;
        for(int i = 1; i <= 10; i++){
            population += (population * (born - death) / 1000);
            if (born > 7) born -= 1;
            if  (death > 6) death -=1;
        }
        System.out.printf("%.0f",population);
    }
}
