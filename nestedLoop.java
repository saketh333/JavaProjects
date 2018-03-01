// Nested loop
// this will print hello 9 times


for (int i = 0; i < 3; i++){
	for(int j = 0; j < 3; j++){
		System.out.println("Hello")
	}
}


// function that calculates the average grades

public Static void average(int [][] grades){
		int size = grades.length;
		int total = 0;
		for (int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
				total += grades[i][j];
			}
		}
		double average = total/(double) size;
		return average;
}		