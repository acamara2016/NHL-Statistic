package Ass2;

public class Player {
	private String playerName, position, defence, teamName;
	private int gamePlayed, goalScored, assists, penaltyMinute, shotGoal, winningGoal;
	public Player() {}
	public Player(String pname, String pos, String def, String team, int gp, int gs, int ass, int pt, int sgl, int wgl) {
		this.playerName=pname;
		this.position=pos;
		this.defence=def;
		this.teamName=team;
		this.gamePlayed=gp;
		this.goalScored=gs;
		this.assists=ass;
		this.penaltyMinute=pt;
		this.shotGoal=sgl;
		this.winningGoal=wgl;
		
	}
	
	public void setPN(String pn) {this.playerName=pn;}
	public void setPS(String pos) {this.position=pos;}
	public void setDF(String def) {this.defence=def;}
	public void setTN(String t) {this.teamName=t;}
	public void setGP(int g) {this.gamePlayed=g;}
	public void setAT(int as) {this.assists=as;}
	public void setSG(int sg) {this.shotGoal=sg;}
	public void setGS(int gos) {this.goalScored=gos;}
	public void setWG(int wg) {this.winningGoal=wg;}
	
	public String getPN() {return playerName;}
	public String getPS() {return position;}
	public String getDF() {return defence;}
	public String getTN() {return teamName;}
	public int getGP() {return gamePlayed;}
	public int getGs() {return goalScored;}
	public int getAT() {return assists;}
	public int getPT() {return penaltyMinute;}
	public int getSG() {return shotGoal;}
	public int getWG() {return winningGoal;}
	
	public String toString() {
		return("Player "+this.getPN()+" is in team :"+this.getTN()+" "+this.getDF());
	}
}
