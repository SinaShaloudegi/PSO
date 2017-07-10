/**
 * Created by sina on 7/10/2017.
 */

public class Main {

    static Swarm swarm;

    public static void main(String[] args) {


        initialize();
        start();
        System.out.println("Global best : "+swarm.gb);

    }

    private static void start() {
        for (int i = 0; i < 10; i++) {
            swarm.calculateFitness();
            swarm.updateV();
            swarm.updateX();
            System.out.println("gb"+i+": "+swarm.gb);
        }

    }

    private static void initialize() {
        swarm = new Swarm();
        swarm.init();

    }


}

