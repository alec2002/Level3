import java.util.Random;


public class Randomness {
	Random r;

Randomness(){
	r = new Random();

}
boolean tf(){
	return r.nextBoolean();
}
int num(){
	return r.nextInt(10);
}
}
