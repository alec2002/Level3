
public class Snake {
	int viciousness;
	boolean venomous;
Snake(int v, boolean ven){
	this.viciousness = v;
	this.venomous = ven;
}
int getViciousness(){
	return viciousness;
}
void setViciousness(int v){
	this.viciousness = v;
}
boolean getVenemous(){
	return venomous;
}
void setVenemous(boolean ven){
	this.venomous = ven;
}
}
