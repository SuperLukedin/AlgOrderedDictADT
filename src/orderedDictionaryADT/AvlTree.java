package orderedDictionaryADT;

public class AvlTree {
	public static void main(String[] args) {
		SkipList skl = new SkipList();
		skl.skipinsert(1, 1);
		skl.skipinsert(12, 1);
		skl.skipinsert(10, 1);
		skl.skipinsert(7, 1);
		skl.skipinsert(9, 1);
		skl.skipinsert(3, 1);
		skl.skipinsert(2, 1);
		skl.Visualize();
		
	}
}
