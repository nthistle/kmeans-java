import java.lang.Math;

public class KMeans
{
	
	public static void main(String[] args) {
		// tmp filler, external library does not need a main
		List<DataPoint> myData = new ArrayList<CartesianData>();
		double[][] data = new double[][] {{-1.84,-1.37},{-1.93,-2.42},{1.37,0.3},{-2.47,5.79},{5.38,-0.15},{-3.5,5.12},{-3.63,6.01},{3.81,1.52},{-3.43,6.07},{2.79,-0.21},{4.78,-0.68},{0.03,-1.07},{-3.52,5.65},{3.16,-1.15},{-1.85,5.84},{-1.67,-1.39},{4.94,0.65},{2.9,0.2},{-3.22,3.94},{-1.49,-0.72},{2.75,-0.13},{-3.74,-1.75},{-0.94,-1.19},{-2.85,5.58},{-2.98,-3.19},{-1.78,-2.28},{-2.45,-1.69},{-1.44,-1.03},{-3.28,-0.88},{-1.8,-0.67},{-2.36,3.63},{0.03,-1.81},{5.53,-0.06},{4.38,-0.73},{-3.33,6.47},{4.05,0.91},{-2.51,-1.79},{-3.77,5.11},{4.74,1.84},{3.27,0.34},{-3.92,5.43},{3.76,-0.88},{-3.36,7.33},{-2.52,5.81},{-0.98,-3.07},{-2.68,6.22},{4.14,-0.74},{2.2,0.4},{-3.3,6.26},{-2.46,-1.44},{-1.13,-1.1},{2.97,1.24},{-2.75,5.29},{0.84,-0.06},{0.24,-2.92},{-1.91,-2.12},{-1.64,-1.26},{-2.52,5.18},{-5.16,4.99},{1.59,0.69},{1.27,-0.38},{-4.72,7.66},{-2.7,3.81},{3.23,1.12},{-1.81,-1.0},{3.21,3.21},{-2.85,6.95},{-1.36,-0.72},{-3.27,-2.73},{-1.54,5.5},{-2.72,-2.21},{2.87,0.87},{-2.84,5.69},{-1.03,6.11},{-1.31,-1.69},{-1.72,-3.04},{-0.98,4.15},{-2.55,6.41},{-0.89,0.41},{1.67,0.86},{-3.14,3.69},{4.38,0.37},{-2.37,5.55},{3.74,0.71},{-2.24,-0.39},{-2.92,4.85},{-1.38,-0.65},{-3.66,5.74},{2.14,0.47},{3.12,0.04},{-1.02,-2.34},{-0.69,-2.81},{1.67,-1.29},{-1.89,-2.41},{3.11,0.42},{-2.35,6.09},{-2.7,4.79},{-2.87,5.63},{-0.92,-3.66},{-1.79,6.6},{-2.53,3.46},{3.64,1.14},{2.75,1.31},{3.73,1.35},{3.52,0.23},{-1.64,5.79},{2.57,0.89},{0.23,-2.13},{-2.77,-1.51},{-2.13,5.05},{-0.75,-0.89},{-3.21,-2.83},{5.31,1.86},{3.24,1.02},{2.59,-0.41},{3.11,-0.14},{-0.26,-3.05},{-4.11,4.35},{-1.05,-1.03},{-0.94,-0.26},{3.29,0.24},{1.99,-1.01},{-3.94,7.42},{-0.91,-2.45},{-2.56,6.27},{3.46,1.42},{-0.86,4.96},{2.59,-0.13},{-1.82,4.06},{3.24,0.39},{-2.73,-3.18},{3.23,0.54},{-2.91,6.99},{1.78,0.93},{-1.31,4.96},{-3.19,6.59},{-1.35,-3.23},{-0.53,-0.85},{1.71,-0.77},{-4.17,3.98},{5.15,-1.79},{-3.93,5.07},{-0.2,-2.68},{-3.44,6.49},{-3.37,5.22},{-2.34,-2.39},{4.11,-0.38},{-0.14,-1.89},{3.63,1.05},{-0.62,-2.9}};
		for(double[] entry : data) {
			myData.add(new CartesianData(entry[0],entry[1]));
		}
	}

	private int numRepeats;
	private int numIterations;

	/**
	 * Class constructor, initializes with default values.
	 */
	public KMeans() {
		this.numIterations = 500;
		this.numRepeats = 100;
	}


	/**
	 * Class constructor, initializes using given values for numRepeats and numIterations.
	 */
	public KMeans(int numRepeats, int numIterations) {
		this.numIterations = 500;
		this.numRepeats = 100;
	}


	/**
	 * Runs the K-Means clustering algorithm on the supplied data and value of k using 
	 * the initialized algorithm parameters.
	 */
	public List<List<DataPoint>> cluster(List<DataPoint> data, int k) {
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



class CartesianData implements DataPoint
{
	private double x;
	private double y;

	public CartesianData(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double dist(DataPoint other) {
		if(other instanceof CartesianData) {
			CartesianData otherc = (CartesianData) other;
			double xdif = otherc.getX() - this.x;
			double ydif = otherc.getY() - this.y;
			return Math.sqrt((xdif*xdif)+(ydif*ydif));
		}
		else {
			return 0.0;
		}
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
}