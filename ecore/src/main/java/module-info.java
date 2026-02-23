import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.change.ecore.ECoreGenChangeProcessorsCapabilityFactory;

module org.nasdanika.models.change.ecore {
		
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.change.ecore;
	opens org.nasdanika.models.change.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenChangeProcessorsCapabilityFactory; 		
	
}
