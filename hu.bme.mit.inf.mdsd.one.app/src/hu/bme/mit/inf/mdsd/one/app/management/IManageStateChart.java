package hu.bme.mit.inf.mdsd.one.app.management;

public interface IManageStateChart {

	void updateTime();
	void manageTime();
	void manageHomeFaults();
	void manageVisitorFaults();
	void giveHomeYellowCard();
	void giveVisitorYellowCard();
	void giveHomeRedCard();
	void giveVisitorRedCard();
	void giveHomeGoal();
	void giveVisitorGoal();
	void useHomeTimeOut();
	void useVisitorTimeOut();	
}
