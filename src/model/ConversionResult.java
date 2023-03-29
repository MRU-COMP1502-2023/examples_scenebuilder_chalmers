package model;

public class ConversionResult {

	private String from;
	private String to;
	private double before;
	private double after;
	
	public ConversionResult(String from, String to, double before, double after) {
		this.from = from;
		this.to = to;
		this.before = before;
		this.after = after;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public double getBefore() {
		return before;
	}

	public double getAfter() {
		return after;
	}
	
	public String toString() {
		return String.format("%.2f %s is %.2f %s", before, from, after, to);
	}
}
