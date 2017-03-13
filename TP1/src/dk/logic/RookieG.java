package dk.logic;

public class RookieG extends Guardian {

	public RookieG() {
		super();
	}
	
	public RookieG(Coordinates path[]){
		super(path);
	}

	public boolean moveCharacter(Level level) {
		if (!sleeping) {
			this.indexPath++;
			if (this.indexPath >= path.length)
				this.indexPath = 0;

			Coordinates newCoordinates = path[indexPath];
			setCoord(newCoordinates);

			return true;
		}
		return false;

	}
}
