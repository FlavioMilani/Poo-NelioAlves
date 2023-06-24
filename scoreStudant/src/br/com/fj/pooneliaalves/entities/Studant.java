package br.com.fj.pooneliaalves.entities;

public class Studant {
	private String name;
	private double scoreFQuarter; //Primeiro trimestre;
	private double scoreSQuarter; //Segundo trimestre;
	private double scoreTQuarter; //Terceiro trimestre;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScoreFQuarter() {
		return scoreFQuarter;
	}
	public void setScoreFQuarter(double scoreFQuarter) {
		this.scoreFQuarter = scoreFQuarter;
	}
	public double getScoreSQuarter() {
		return scoreSQuarter;
	}
	public void setScoreSQuarter(double scoreSQuarter) {
		this.scoreSQuarter = scoreSQuarter;
	}
	public double getScoreTQuarter() {
		return scoreTQuarter;
	}
	public void setScoreTQuarter(double scoreTQuarter) {
		this.scoreTQuarter = scoreTQuarter;
	}
	
	double score;
	
	public double finalScore() {		
		
			
		return scoreFQuarter + scoreSQuarter + scoreTQuarter;
	}
	
	public double missingPoints() {
		if(finalScore() < 60) {
			return 60 - finalScore();
		} else {
			return 0;
		}
	}
	
}
