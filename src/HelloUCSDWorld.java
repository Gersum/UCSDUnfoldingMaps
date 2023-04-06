import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;

/**
 * Hello World!
 * 
 * This is the basic stub to start creating interactive maps.
 */
public class HelloUCSDWorld extends PApplet {

	UnfoldingMap map;

	public void setup() {
		size(800, 600, OPENGL);

		Location location = new Location(32.881, -117.238);

		SimplePointMarker marker = new SimplePointMarker(location);



		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
		map.zoomAndPanTo(14,location ); // UCSD

		map.addMarkers(marker);

		MapUtils.createDefaultEventDispatcher(this, map);

	}

	public void draw() {
		background(0);
		map.draw();
	}

}
