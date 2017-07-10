import java.util.Random;

/**
 * Created by sina on 7/10/2017.
 */
public class Swarm {

    Particle[] particles;
    double gb;

    public void init() {
        particles = new Particle[20];
        for (int i = 0; i < particles.length; i++) {
            Random r = new Random();
            double rnd = r.nextDouble();
            particles[i] = new Particle();
            particles[i].x = -4 + rnd * 8;
            particles[i].lb = particles[i].x;
            particles[i].v = rnd;

        }
    }


    private double calcFitness(double x) {
        return (x * x) - (4 * x) + 4;
    }

    public void calculateFitness() {
        double temp = Double.MAX_VALUE;
        for (int i = 0; i < particles.length; i++) {
            particles[i].fitness = calcFitness(particles[i].x);
            if (particles[i].fitness < temp) {
                temp = particles[i].fitness;
                gb = particles[i].lb;
            }
        }

    }

}
