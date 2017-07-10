/**
 * Created by sina on 7/10/2017.
 */

public class Main {

    static Swarm swarm;

    public static void main(String[] args) {


        initilize();
        start();
    }

    private static void start() {
        for (int i = 0; i < 10; i++) {
            swarm.calculateFitness();
        }
    }

    private static void initilize() {
        swarm = new Swarm();
        swarm.init();
        for (int i = 0; i < swarm.particles.length; i++) {
            System.out.println(" x : " + swarm.particles[i].x
                    + " lb : " + swarm.particles[i].lb
                    + " v : " + swarm.particles[i].v);

        }
    }


}

