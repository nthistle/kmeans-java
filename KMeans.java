

public class KMeans
{
	
	public static void main(String[] args) {
		// tmp filler, external library does not need a main
	}

	private int numRepeats;
	private int numIterations;

	/**
	 * Class constructor, initializes with default values
	 */
	public KMeans() {
		this.numIterations = 500;
		this.numRepeats = 100;
	}


	/**
	 * Class constructor, initializes using given values for numRepeats and numIterations
	 */
	public KMeans(int numRepeats, int numIterations) {
		this.numIterations = 500;
		this.numRepeats = 100;
	}


	/**
	 * Runs the K-Means clustering algorithm on the supplied data using the initialized
	 * algorithm parameters
	 */
	public List<List<DataPoint>> cluster(List<DataPoint> data) {
		return null;
	}

	private double cost(List<List<DataPoint>> clustering) {
		return 0.0;
	}

}

interface DataPoint
{
	/**
	 * Represents the "distance" between this data point and another,
	 * this method will only be called with the other data points in
	 * the same initial data list supplied to the cluster() method.
	 * (Casting is fine, optionally return 0.0 or Double.POSITIVE_INFINITY
	 * in the event of a conflicting type)
	 */
	public double dist(DataPoint other);
}