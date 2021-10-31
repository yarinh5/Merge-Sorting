import javax.swing.JOptionPane;

public class Main 
{
	  	private static int size;
	 	private static int numOfThreads;
		private static int[] arr;

	public static void main(String[] args) {
		getInput();
		printArr();
	}

	private static void printArr() {
		arr =new int[size];
		for(int i = 0; i< size; i++)
			arr[i]=(int)(Math.random()*100);
		System.out.println("Initial array:");
		for(int i: arr) {
			System.out.print(i + " ");
		}
		mergeArr();
		System.out.println("\nSorted array:");
		for(int i: arr)
		System.out.print(i+" ");
	}

	private static void mergeArr() {
		MergeThreadHandler handler = new MergeThreadHandler(numOfThreads, size, arr);
		arr = handler.runMergeThread();
	}

	private static void getInput() {
		try
		{
			if ((size = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the size of the array:"))) <= 0) {
				JOptionPane.showMessageDialog(null, "Illegal input.", "Error", JOptionPane.ERROR_MESSAGE);
				System.exit(1);
			}
			if ((numOfThreads = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of threads:"))) <= 0) {
				JOptionPane.showMessageDialog(null, "Illegal input.", "Error", JOptionPane.ERROR_MESSAGE);
				System.exit(1);
			}
		}
		catch(NumberFormatException t)
		{
			JOptionPane.showMessageDialog(null,"Closing program.","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}
