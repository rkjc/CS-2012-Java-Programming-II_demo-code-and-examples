package museum;

public abstract interface Cursed {
	
	abstract public void applyMagicSeal();
	abstract public void removeMagicSeal();
    abstract public boolean checkMagicSeal();
    abstract public boolean getIsCursed();
    abstract public void setIsCursed(boolean x);

}
