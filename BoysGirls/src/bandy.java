//The class name is file1scanner class or method name
//
//It reads the input from the file. It compute the absolute difference of boys and girls 
//integers .
//By: Samuel
//Date: 11/13/2019
//******

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.Math;

public class bandy {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("boysgirls.txt");
		f.exists();

		Scanner input = new Scanner(new File("boysgirls.txt"));
		boyGirl(input);

	}

	public static void boyGirl(Scanner sc) {
		int boyCount = 0;
		int boySum = 0;
		int girlCount = 0;
		int girlSum = 0;

		while (sc.hasNext()) {
			sc.next();
			boyCount++;
			boySum += sc.nextInt();

			if (!sc.hasNext())
				break;

			sc.next();
			girlCount++;
			girlSum += sc.nextInt();
		}

		System.out.println(boyCount + " boys, " + girlCount + " girls");
		System.out.println("Difference between boys' and girls' sums: " + Math.abs(boySum - girlSum));
	}

}
