
import java.io.*;

class FIFO extends Algorithm {

	public FIFO(int framenum) {
		super(framenum);
	}

	public static void main(String args[]) throws IOException {
		
		int nbr;
		int nums[] = new int[3];
	
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre d'entrées :");
		
		nbr = Integer.parseInt(buffer.readLine());
		int input[] = new int[nbr];
		System.out.println("Entrées :");
		
		for (int i = 0; i < nbr; i++)
			input[i] = Integer.parseInt(buffer.readLine());
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < 3; i++)
		
		nums[i] = -1;
		int j = 0;
		boolean flag;
		int def = 0;
		int hit = 0;
		
		
		for (int i = 0; i < nbr; i++) {
			flag = false;

			for (int k = 0; k < 3; k++)
				if (nums[k] == input[i]) {
					flag = true;
					hit = hit + 1;
				}
			
			if (flag == false) {
				nums[j] = input[i];
				j++;
				if (j >= 3)
					j = 0;
				def = def + 1;
			}

		}
		System.out.println("Hit " + hit );
		System.out.println("Défaut de page " + def);
	}

	@Override
	public void insert(int pageNumber) {
		return;
	}
}
