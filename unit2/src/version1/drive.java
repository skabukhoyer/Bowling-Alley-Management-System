package version1;
import java.util.Vector;
import java.io.*;

public class drive {

	public static void main(String[] args) {

		int numLanes = Config.number_of_lanes;
		int maxPatronsPerParty = Config.max_number_of_party_per_lane;
		
		ControlDesk controlDesk = new ControlDesk(numLanes);

		ControlDeskView cdv = new ControlDeskView( controlDesk, maxPatronsPerParty);
		controlDesk.subscribe( cdv );

	}
}
