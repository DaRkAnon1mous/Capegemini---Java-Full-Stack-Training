import java.util.*;

public class NumAvg {

    private TreeSet<Integer> numSet=new TreeSet<Integer>();

        // Write code for getter and setter

    public TreeSet<Integer> getNumSet() {
		return numSet;
	}

	public void setNumSet(TreeSet<Integer> numSet) {
		this.numSet = numSet;
	}

	public void addNum(int num)
    {
	    // code here
		if(num%5!=0 && num%6!=0) {
			numSet.add(num);
		}
    }

    public double calAvg()
    {
	    return numSet.stream().mapToInt(Integer::intValue).average().orElse(-1);
    }
}
