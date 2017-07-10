import java.util.Random;

/**
 * Created by sina on 7/10/2017.
 */
public class Swarm {

    Particle[] particles;
    double gb;

    public void init() {
        particles = new Particle[100];
        double temp =
        gb = Double.MAX_VALUE;

        for (int i = 0; i < particles.length; i++) {
            Random r = new Random();
            double rnd = r.nextDouble();
            particles[i] = new Particle();
            particles[i].x = -4 + rnd * 8;
            particles[i].lb = particles[i].x;
            particles[i].v = rnd;
            if (particles[i].fitness < temp) {
                temp = particles[i].fitness;
                gb = particles[i].lb;

            }
        }
    }


    private double calcFitness(double x) {
        return (x * x) - (4 * x) + 4;
    }

    public void calculateFitness() {
        for (int i = 0; i < particles.length; i++) {
            particles[i].fitness = calcFitness(particles[i].x);
/*
            System.out.println("Fitness #" + i + " : " + particles[i].fitness);
*/

        }

    }

    public void updateV() {
        for (int i = 0; i < particles.length; i++) {
            Random rnd1 = new Random();
            Random rnd2 = new Random();
            double r1 = rnd1.nextDouble();
            double r2 = rnd2.nextDouble();
            particles[i].v = particles[i].v + r1 * 2 * (particles[i].x - particles[i].lb) + r2 * 2 * (particles[i].x - gb);

        }
    }

    public void updateX() {
        for (int i = 0; i < particles.length; i++) {
            particles[i].x = particles[i].x + particles[i].v;
            if (calcFitness(particles[i].x) < calcFitness(particles[i].lb)) {
                particles[i].lb = particles[i].x;
            }
            if (calcFitness(particles[i].x) < calcFitness(gb)) {
                gb = particles[i].x;

            }

        }
    }
}
