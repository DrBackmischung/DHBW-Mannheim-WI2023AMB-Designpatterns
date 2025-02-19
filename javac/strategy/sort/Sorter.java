package javac.strategy.sort;

public class Sorter {
	
	private SortingAlgorithm sorter;

    public void setSorter(SortingAlgorithm sorter) {
        this.sorter = sorter;
    }

    public void sortArray(int[] array) {
        sorter.sort(array);
    }

}
