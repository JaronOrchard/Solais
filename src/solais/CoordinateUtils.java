package solais;

public class CoordinateUtils {
	
	/**
	 * Given two {@link Coordinate}s, determines of they intersect within a certain range.
	 * @param coord1 The first Coordinate
	 * @param coord2 The second Coordinate
	 * @param intersectionRadius The maximum distance the two Coordinates could be away from each other and still intersect
	 * @return {@code true} if the Coordinates intersect within a range of {@code intersectionRadius}, {@code false} otherwise.
	 */
	public static boolean coordinatesIntersect(Coordinate coord1, Coordinate coord2, float intersectionRadius) {
		return Math.sqrt((((coord1.getX() - coord2.getX())*(coord1.getX() - coord2.getX())) +
						  /*((coord1.getY() - coord2.getY())*(coord1.getY() - coord2.getY())) +*/ // ignore y-coordinate
						  ((coord1.getZ() - coord2.getZ())*(coord1.getZ() - coord2.getZ())))) <= intersectionRadius;
	}
	
}
