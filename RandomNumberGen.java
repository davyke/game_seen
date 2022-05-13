import java.util.*;
public class RandomNumberGen {
public static void main(String[] args) {
	Random random=new Random();
	long seed=1000;
	random.setSeed(seed);
	for(int i=0;i<50;i++) {
	int randomNumber = random.nextInt(100);
	System.out.println(randomNumber);
	}
}
}
