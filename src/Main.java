/**
 * Created by sina on 7/10/2017.
 */

public class Main {


    public static void main(String[] args) {

        initilize();
    }

    private static void initilize() {
        Swarm swarm = new Swarm();
        swarm.init();
        for (int i = 0; i < swarm.particles.length; i++) {
            System.out.println(" x : " + swarm.particles[i].x
                    + " lb : " + swarm.particles[i].lb
                    + " v : " + swarm.particles[i].v
                    + " fitness : " + swarm.particles[i].fitness
                    + " gb : " + swarm.gb);

        }
    }


}

